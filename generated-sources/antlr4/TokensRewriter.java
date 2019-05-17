import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;


public class TokensRewriter extends ADTCBaseListener{

	TokenStreamRewriter rewriter;
	ADTCParser parser;
	
	private boolean typedef = false;
	private String typeSpecifier="";
    private String KEY="";
		
	private Map<String, List<String>> map = new HashMap<String, List<String>>();
	private List<String> typeInt = new ArrayList<String>(); 
	private List<String> typeFloat = new ArrayList<String>(); 
	private List<String> typeDouble = new ArrayList<String>(); 
	private List<String> typeChar = new ArrayList<String>(); 
	private List<String> typeShort = new ArrayList<String>(); 
	private List<String> typeLong = new ArrayList<String>();
	private List<String> typeStructUnion = new ArrayList<String>(); 
	
	public TokensRewriter(ADTCParser parser, TokenStream tokens){
		
		rewriter = new TokenStreamRewriter(tokens);
		this.parser=parser;
	}
	
	public void enterDeclaration(ADTCParser.DeclarationContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
        
		if(ctx.declarationSpecifiers().declarationSpecifier(0)!=null){
		
			for(Map.Entry<String, List<String>> entry : map.entrySet()){
			
			String key = entry.getKey();
			List<String> values = entry.getValue();
	            
	         
	            for(String valueN : values){
	            	
	            	if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(0)).equals("typedef") && tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals(valueN)){
	            			         
	            		KEY=key;

	            	}else{
	            		
	            		if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(0)).equals(valueN)) {	            	
		            		
		            		String typeReplace = tokens.getText(ctx.getRuleContext());		            		
		            		String finalReplace;
		            		finalReplace = typeReplace.replaceFirst(valueN, key);
		            		rewriter.replace(ctx.start,ctx.stop, finalReplace);  
		            	}else if(ctx.declarationSpecifiers().declarationSpecifier(1)!=null  && tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals(valueN)&& tokens.getText(ctx.getRuleContext()).contains("const")) {	            	
		            		
		            		String typeReplace = tokens.getText(ctx.getRuleContext());
		            		
		            		String finalReplace;
		            		finalReplace = typeReplace.replaceFirst(valueN, key);
		            		rewriter.replace(ctx.start,ctx.stop, finalReplace);  
		            	}
		            
	            	}
	            		
	            }
			} 
		}
		
		if(ctx.declarationSpecifiers().declarationSpecifier(2)!=null && tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(0)).equals("typedef")){			
			
			typedef=true;
			
			if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals("int")){
				
				typeInt.add(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2)));
				map.put("int",typeInt);
			}else if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals("float")){
				
				typeFloat.add(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2)));
				map.put("float",typeFloat);
			}else if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals("double")){
				
				typeDouble.add(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2)));
				map.put("double",typeDouble);
			}else if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals("short")){
				
				typeShort.add(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2)));
				map.put("short",typeShort);
			}else if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals("char")){
				
				typeChar.add(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2)));
				map.put("char",typeChar);
			}else if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals("long")){
				
				typeLong.add(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2)));
				map.put("char",typeLong);
			}else if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).contains("struct") && !tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).endsWith("}")){
				
				typeStructUnion.add(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2)));
				String structUnion = tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).replace("struct", "");
				map.put(structUnion,typeStructUnion);
	
			}else  if(!tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).endsWith("}")){
				
				typeStructUnion.add(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(2)));				
				map.put(KEY,typeStructUnion);			
			}
			
		} else if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(0)).equals("typedef")){
			
			typedef=true;
			typeSpecifier = KEY;
		}
	}
	
	public void enterInitDeclarator(ADTCParser.InitDeclaratorContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
		
		if(typedef){

			if(typeSpecifier.equals("int")){
				
				typeInt.add(tokens.getText(ctx.declarator()));
				map.put("int",typeInt);
			}else if(typeSpecifier.equals("float")){
				
				typeFloat.add(tokens.getText(ctx.declarator()));
				map.put("float",typeFloat);
			}else if(typeSpecifier.equals("double")){
				
				typeDouble.add(tokens.getText(ctx.declarator()));
				map.put("double",typeDouble);
			}else if(typeSpecifier.equals("short")){
				
				typeShort.add(tokens.getText(ctx.declarator()));
				map.put("short",typeShort);
			}else if(typeSpecifier.equals("char")){
				
				typeChar.add(tokens.getText(ctx.declarator()));
				map.put("char",typeChar);
			}else if(typeSpecifier.equals("long")){
				
				typeLong.add(tokens.getText(ctx.declarator()));
				map.put("long",typeLong);
			}else if(typeSpecifier.contains("struct") && !typeSpecifier.endsWith("}")){
				
				typeStructUnion.add(tokens.getText(ctx.declarator()));
				String structUnion =typeSpecifier.replace("struct", "");
				map.put(structUnion,typeStructUnion);	
			}else if(!typeSpecifier.endsWith("}")){
				
				typeStructUnion.add(tokens.getText(ctx.declarator()));				
				map.put(typeSpecifier,typeStructUnion);	
			}
		}
	}
	
	public void exitDeclaration(ADTCParser.DeclarationContext ctx){
		
		typedef=false;
		typeSpecifier="";
	}
	
	public void enterStructDeclaration(ADTCParser.StructDeclarationContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
		
		if(ctx.specifierQualifierList()!=null){
		
			for(Map.Entry<String, List<String>> entry : map.entrySet()){
			
			String key = entry.getKey();
			List<String> values = entry.getValue();	            
	         
	            for(String valueN : values){
	            	
	            	if(tokens.getText(ctx.specifierQualifierList().typeSpecifier()).equals(valueN)) {	            	
	            		
	            		String typeReplace = tokens.getText(ctx.getRuleContext());
	            		
	            		String finalReplace;
	            		finalReplace = typeReplace.replace(valueN, key);
	            		rewriter.replace(ctx.start,ctx.stop, finalReplace);
	            	}
	            }
			} 
		}
	}
}
