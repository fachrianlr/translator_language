import org.antlr.v4.runtime.TokenStream;

public class ExtractToInterfaceJava extends ADTCBaseListener {
	
	ADTCParser parser; // class parser
	String name=""; // name of interface java
	public ExtractToInterfaceJava(ADTCParser parser, String name){
		this.parser=parser;
		this.name=name;
	}

	
	String typeData1 =""; // Cek type data
	String typeData2 =""; 
	String typeSpecifier=""; //get type data

	
	
	boolean typedef=false;
	
	int indenStructUnion;
	int param_line=1;
	
	/*predikat*/
	boolean cekTypeValid(String Cek){
		
		return (Cek.equals("char")||Cek.equals("String")||Cek.equals("int")||Cek.equals("short")||Cek.equals("long")||Cek.equals("float")||Cek.equals("double")||Cek.equals("boolean")||Cek.equals("void"));
	}
	
	boolean isStructUnion(String Cek){
		
		Cek = Cek.toLowerCase();
		
		return (Cek.contains("struct")||Cek.contains("union"));
	
	}
	
	boolean isClass(String Cek){
		
		Cek = Cek.toLowerCase();
		
		return ((Cek.contains("struct")||Cek.contains("union"))&& Cek.endsWith("}"));
	}
	
	boolean cekParameter(String Cek){
		
		return ((Cek.contains("(")) && (Cek.endsWith(")")));
	}
	
	/*primitif*/
	
	//enter Header
	public void enterHeader(ADTCParser.HeaderContext ctx) { 
		
		if(name!=null){
			
			System.out.println("public interface "+name+" {");
			System.out.println();
		}		
	}
	
	// {
	public void exitHeader(ADTCParser.HeaderContext ctx) { 
		
		System.out.println("\n}");		
		
	}
	//exit Header
	
	//boolean
	public void enterBooleanMacro(ADTCParser.BooleanMacroContext ctx) { 
		
		System.out.println("/*\n#define true 1#\ndefine false 0 \n#define boolean unsigned char\nTipe Data boolean Sudah terdefinisi pada Java\n*/");
	}
	//boolean
	
	public void enterDeclaration(ADTCParser.DeclarationContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
		
		if(ctx.declarationSpecifiers().declarationSpecifier(0).storageClassSpecifier()!=null && tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(0).storageClassSpecifier()).equals("typedef")){
			
			typedef=true;
		}
	    
		if(ctx.declarationSpecifiers().getChild(0).getText()!=null && ctx.declarationSpecifiers().getChild(1)!=null){ //get c constan
			
			typeData1 = ctx.declarationSpecifiers().getChild(0).getText();
			typeData2 = ctx.declarationSpecifiers().getChild(1).getText();
		}
		
	}
	
	public void exitDeclaration(ADTCParser.DeclarationContext ctx){
		
		TokenStream tokens = parser.getTokenStream();
		
		typeData1=""; // re initial typeData1
		typeData2=""; // re initial typeData2
		typedef=false;
		
		if(ctx.initDeclaratorList()!=null && tokens.getText(ctx.initDeclaratorList()).endsWith(")") && param_line==1){
			System.out.println("\n  public "+tokens.getText(ctx.declarationSpecifiers())+" "+tokens.getText(ctx.initDeclaratorList())+";");
			param_line++;
		}
		else if(ctx.initDeclaratorList()!=null && tokens.getText(ctx.initDeclaratorList()).endsWith(")"))
			System.out.println("  public "+tokens.getText(ctx.declarationSpecifiers())+" "+tokens.getText(ctx.initDeclaratorList())+";");
	}
	
	// enter Init
	public void enterInitDeclarator(ADTCParser.InitDeclaratorContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
		
		String decl="";
		
		if(cekTypeValid(typeData1))
			decl=typeData1;
		else 
			decl=typeData2;
		
		
		if (!typedef && (ctx.declarator()!=null) && (ctx.initializer()!=null) && (ctx.declarator().pointer()==null)&& (typeData1.equals("const")||typeData2.equals("const"))){
			
		     if(decl.equals("float") && !tokens.getText(ctx.initializer()).contains("{"))	 
		    	 System.out.println(" public static final "+decl+" "+tokens.getText(ctx.declarator())+" = "+tokens.getText(ctx.initializer())+"f;");
		     
			 else {
				 if(ctx.declarator().directDeclarator()!=null && tokens.getText(ctx.declarator().directDeclarator()).contains("[")){
					
				   int indexArr = tokens.getText(ctx.declarator().directDeclarator()).indexOf("[");
				   String newArr= tokens.getText(ctx.declarator().directDeclarator()).substring(indexArr);
				  
				   if(decl.equals("char") && tokens.getText(ctx.initializer()).contains("\"")){
					   decl="String";
					   System.out.println("  public static final "+decl+" "+tokens.getText(ctx.declarator().directDeclarator()).substring(0,indexArr)+newArr.replaceAll("[a-zA-Z0-9_]", "").substring(2)+" = "+tokens.getText(ctx.initializer())+";");
				   }
				   else 
					   System.out.println("  public static final "+decl+" "+tokens.getText(ctx.declarator().directDeclarator()).substring(0,indexArr)+newArr.replaceAll("[a-zA-Z0-9_]", "")+" = "+tokens.getText(ctx.initializer())+";");
				 }
				 else
				   System.out.println("  public static final "+decl+"  "+tokens.getText(ctx.declarator())+"="+tokens.getText(ctx.initializer())+";");
			 }				 
		}
	}
	
	//exit Init
	
	/*enter DefineMacro*/
	public void enterDefineMacro(ADTCParser.DefineMacroContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
		String declaratorMacro="";
		
		if(ctx.defineDeclarator()!=null){
			
			declaratorMacro = tokens.getText(ctx.defineDeclarator());
		}
			
		if(ctx.defineInitializer()!=null && !declaratorMacro.equals("true") && !declaratorMacro.equals("false")){
			
			String initialMacro = tokens.getText(ctx.defineInitializer());
						
			if(initialMacro.contains("\"") && initialMacro.endsWith("\"")){
				
				System.out.println("  public static final String "+declaratorMacro+" = "+initialMacro+";");
			}else if(initialMacro.contains("\'") && initialMacro.endsWith("\'")){
				
				System.out.println("  public static final char "+declaratorMacro+" = '"+initialMacro.substring(initialMacro.length()-2, initialMacro.length()-1)+"';");
			}else if(initialMacro.contains(".") && initialMacro.matches("[0-9-.]+")){
				
				System.out.println("  public static final float "+declaratorMacro+" = "+initialMacro+"f;");
			}else if(initialMacro.matches("[0-9]+"))
				System.out.println("  public static final int "+declaratorMacro+" = "+initialMacro+";");
		}
	}
}


