import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;


public class ParamaterRewriter extends ADTCBaseListener{

	TokenStreamRewriter rewriter;
	ADTCParser parser;
	
	
	Map<String, List<String>> map = new HashMap<String, List<String>>();
	List<String> typeInt = new ArrayList<String>(); 
	List<String> typeFloat = new ArrayList<String>(); 
	List<String> typeDouble = new ArrayList<String>(); 
	List<String> typeChar = new ArrayList<String>(); 
	List<String> typeShort = new ArrayList<String>(); 
	List<String> typeLong = new ArrayList<String>();
	List<String> typeStructUnion = new ArrayList<String>();
	
	private boolean typedef = false;
	private String typeSpecifier="";
	private String KEY = "";
	
	public ParamaterRewriter(ADTCParser parser, TokenStream tokens){
		
		rewriter = new TokenStreamRewriter(tokens);
		this.parser = parser;
		
	}
	
	boolean isClass(String Cek){
		
		Cek = Cek.toLowerCase();
		
		return ((Cek.contains("struct")||Cek.contains("union"))&& Cek.endsWith("}"));
	}
	
	public void enterDeclaration(ADTCParser.DeclarationContext ctx) { 
		
TokenStream tokens = parser.getTokenStream();
        
		if(ctx.declarationSpecifiers().declarationSpecifier(0)!=null){
		
			for(Map.Entry<String, List<String>> entry : map.entrySet()){
			
			String key = entry.getKey();
			List<String> values = entry.getValue();
	            
	         
	            for(String valueN : values){
	            	
	            	if(tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(0)).equals("typedef") && tokens.getText(ctx.declarationSpecifiers().declarationSpecifier(1)).equals(valueN)){
	            		
	            		String typeReplace = tokens.getText(ctx.getRuleContext());
	            		
	            		String finalReplace;
	            		finalReplace = typeReplace.replaceFirst(valueN, key);
	            		rewriter.replace(ctx.start,ctx.stop, finalReplace);  
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
	
	public void enterParameterDeclaration(ADTCParser.ParameterDeclarationContext ctx) { 
		
		TokenStream tokens = parser.getTokenStream();
			
		   for(Map.Entry<String, List<String>> entry : map.entrySet()){
			
			String key = entry.getKey();
			List<String> values = entry.getValue();
	            	         
	            for(String valueN : values){
	            		            	
	            	if((tokens.getText(ctx.declarationSpecifiers()).equals(valueN) && key.equals("char")|| tokens.getText(ctx.declarationSpecifiers()).equals("char")) && tokens.getText(ctx.declarator()).endsWith("]")) {	            	
	            		
	            		int arr = tokens.getText(ctx.declarator()).indexOf("[");
	        			int arr1 = tokens.getText(ctx.declarator()).indexOf("]");
	        			
	        			String param ="String "+tokens.getText(ctx.declarator()).substring(0, arr)+tokens.getText(ctx.declarator()).substring(arr1+1);
	        			rewriter.replace(ctx.start,ctx.stop,param);
	        			
	            	}else if(tokens.getText(ctx.declarationSpecifiers()).equals(valueN)){
	            		
	            		String typeReplace = tokens.getText(ctx.getRuleContext());
	            			            		
	            		String finalReplace = typeReplace.replace(valueN, key);
	            		rewriter.replace(ctx.start,ctx.stop, finalReplace);
	            	}
	            	
	            }
	            
			} 
	  }
	
}
