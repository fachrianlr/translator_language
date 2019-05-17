import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.TokenStream;


public class ExtractToClassJava extends ADTCBaseListener{

	ADTCParser parser;
	private String name = "";
	private String typeSpecifier=""; //get type data
	private String nameClass="";
	
	private int enumConstant=0; // value enum
	private int indenStructUnion;
	
	private List<String> fillMainClass = new ArrayList<String>(); 
	
	public ExtractToClassJava(ADTCParser parser, String name){
		this.parser=parser;
		this.name=name;
	}
	
	boolean isStructUnion(String Cek){
			
			Cek = Cek.toLowerCase();
			
			return (Cek.contains("struct")||Cek.contains("union"));
		
		}
	
	boolean isClass(String Cek){
		
		Cek = Cek.toLowerCase();
		
		return ((Cek.contains("struct")||Cek.contains("union"))&& Cek.endsWith("}"));
	}
	
	
	String indentasi(int N){
		
		String tab="";
		int i=0;
		
		while(i<N){

			tab=tab+"  ";
			i++;
		}	
		return tab;
	}
	
	/*------------------------------*/
	
	public void exitHeader(ADTCParser.HeaderContext ctx) { 
		
		System.out.println(" class "+name+"Class implements "+name+"{\n");
		
		int i=0;
		while(i < fillMainClass.size()){
			
			System.out.println("   private "+fillMainClass.get(i));
			i++;
		}
		System.out.println();
		System.out.println(" }");
		
	}
	
	public void enterDeclaration(ADTCParser.DeclarationContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
		
		if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(0)).equals("typedef") && ctx.declarationSpecifiers().declarationSpecifier(0)!=null){
			
			if(isClass(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)))){
				
				nameClass=tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2));
			}
		}
				
		if(!tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(0)).equals("typedef") && !tokens.getText(ctx.getRuleContext()).contains("const")){
			
			if ((ctx.declarationSpecifiers()!=null && ctx.initDeclaratorList()!=null && !tokens.getText(ctx.initDeclaratorList()).endsWith(")")) && tokens.getText(ctx.getRuleContext()).contains("[")){
				
				String StringReplace = tokens.getText(ctx.getRuleContext());
				String newArr = StringReplace.substring(StringReplace.indexOf("["), StringReplace.lastIndexOf("]")+1).replaceAll("[a-zA-Z0-9_]", "").replaceAll("[-+.^:,]","");
				String finalReplace = StringReplace.replace(StringReplace.substring(StringReplace.indexOf("["), StringReplace.lastIndexOf("]")+2), "");
				
				fillMainClass.add(finalReplace+newArr+" = new "+tokens.getText(ctx.declarationSpecifiers())+StringReplace.substring(StringReplace.indexOf("["), StringReplace.lastIndexOf("]")+1)+";");
			}
		    else if(ctx.declarationSpecifiers().declarationSpecifier(0)!=null && ctx.declarationSpecifiers().declarationSpecifier(1)!=null){
				
				fillMainClass.add(tokens.getText(ctx.getRuleContext()));
			}
		}		
	}
	
	public void enterEnumSpecifier(ADTCParser.EnumSpecifierContext ctx) { 
		
		System.out.println(" class "+ctx.Identifier()+" {");
		System.out.println();
	}	
	
	public void enterEnumerator(ADTCParser.EnumeratorContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
			
			if(ctx.enumerationConstant()!=null && ctx.constantExpression()==null){
				
				System.out.print("   public static final int "+tokens.getText(ctx.enumerationConstant())+" = "+enumConstant+";\n");
				enumConstant++;
			}else if(ctx.enumerationConstant()!=null){				
				
				System.out.print("   public static final int "+tokens.getText(ctx.enumerationConstant())+" = "+tokens.getText(ctx.constantExpression())+";\n");
				enumConstant=Integer.parseInt(tokens.getText(ctx.constantExpression()))+1;
			}
	}
	
	public void exitEnumSpecifier(ADTCParser.EnumSpecifierContext ctx){
		
			System.out.println();
			System.out.println(" }");
			System.out.println();
		
	}
	//exit enum 
	
	
	// enter struct&union
	public void enterStructOrUnionSpecifier(ADTCParser.StructOrUnionSpecifierContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
		
		if(isClass(tokens.getText(ctx.getRuleContext()))){
			
			if(ctx.Identifier()!=null){
				System.out.println(indentasi(indenStructUnion)+" class "+ctx.Identifier()+"{" );
			}else
				System.out.println(indentasi(indenStructUnion)+" class "+nameClass+"{" );
			
			System.out.println();
		}
	}
	
	public void enterStructDeclaration(ADTCParser.StructDeclarationContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
		
		if(ctx.specifierQualifierList()!=null)
			typeSpecifier=tokens.getText(ctx.specifierQualifierList());
		
		if(ctx.structDeclaratorList()==null && ctx.specifierQualifierList()!=null && !isStructUnion(tokens.getText(ctx.specifierQualifierList()))) {

				System.out.println(indentasi(indenStructUnion)+"   public "+tokens.getText(ctx.specifierQualifierList())+";");
		} 
		
		if(ctx.specifierQualifierList()!=null && isClass(tokens.getText(ctx.specifierQualifierList()))){
			indenStructUnion++;
		}
	}
	
	public void enterStructDeclarator(ADTCParser.StructDeclaratorContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
			try{
			int indexArr=0;
			String newArr="";
			
			String newChar="";
			int indexChar=0;
			
			if(ctx.declarator()!=null){
				indexArr = tokens.getText(ctx.declarator()).indexOf("[");
				newArr = tokens.getText(ctx.declarator()).substring(indexArr);
				indexChar=tokens.getText(ctx.declarator()).lastIndexOf("[");
				newChar = tokens.getText(ctx.declarator()).substring(indexArr,indexChar);;
			}
			
			if(typeSpecifier.equals("char")&& !newChar.contains("[")){
				
				typeSpecifier="String";
				System.out.println(indentasi(indenStructUnion)+"   public "+typeSpecifier+" "+tokens.getText(ctx.declarator()).substring(0, indexArr)+"  = new "+typeSpecifier+"()"+";");
			}
			else if(typeSpecifier.equals("char")){
				
				typeSpecifier="String";
				System.out.println(indentasi(indenStructUnion)+"   public "+typeSpecifier+" "+tokens.getText(ctx.declarator()).substring(0,indexArr)+tokens.getText(ctx.declarator()).substring(0,indexChar).replaceAll("[a-zA-Z0-9_]", "").replaceAll("[-+.^:,]","")+" = new "+typeSpecifier+newChar+";");
			}else if(ctx.declarator()!=null){
				System.out.println(indentasi(indenStructUnion)+"   public "+typeSpecifier+" "+tokens.getText(ctx.declarator()).substring(0,indexArr)+tokens.getText(ctx.declarator()).replaceAll("[a-zA-Z0-9_]", "").replaceAll("[-+.^:,]","")+" = new "+typeSpecifier+newArr+";");
			}
			
			}
			catch(Exception e){
				System.out.println(e);
			}
			
	}
	
	public void exitStructOrUnionSpecifier(ADTCParser.StructOrUnionSpecifierContext ctx){
		
		TokenStream tokens = parser.getTokenStream();
		
		if(isClass(tokens.getText(ctx.getRuleContext()))) {
			System.out.println();
			System.out.println(indentasi(indenStructUnion)+" }");
			System.out.println();
		}
		
		indenStructUnion--;
	}
	// exit struct&union

}
