import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;


public class InputOutput{
	
	 String path="";
	 String name="";
	
	 public InputOutput(String path, String name){
		 
		 this.path=path;
		 this.name=name;
	 }
	 
	public void Translasi(String Output) throws IOException{
		// TODO Auto-generated method stub
		
		String inputFile=path;
		
		if(!path.equals("")){
			
			FinalInputTokens FinalInputTokens = new FinalInputTokens(inputFile);
			
			ANTLRInputStream input = new ANTLRInputStream(FinalInputTokens.final_tokens());
			
			/*interface*/
			ADTCLexer lexer = new ADTCLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ADTCParser parser = new ADTCParser(tokens);
			ParseTree tree = parser.header();
			ParseTreeWalker walker = new ParseTreeWalker();
			ExtractToInterfaceJava ekstrak = new ExtractToInterfaceJava(parser,name);
			
			File file = new File(Output+".java");
			PrintStream printStream = new PrintStream(new FileOutputStream(file));
			System.setOut(printStream);
			walker.walk(ekstrak, tree);
			
			/*Class*/
			ANTLRInputStream input1 = new ANTLRInputStream(FinalInputTokens.final_tokens());
			ADTCLexer lexer1 = new ADTCLexer(input1);
			CommonTokenStream tokens1 = new CommonTokenStream(lexer1);
			ADTCParser parser1 = new ADTCParser(tokens1);
			ParseTree tree1 = parser1.header();
			ParseTreeWalker walker1 = new ParseTreeWalker();
			ExtractToClassJava ekstrak1 = new ExtractToClassJava(parser1,name);
			
			int subOutput = Output.lastIndexOf("\\");
			File file1 = new File(Output.substring(0, subOutput+1)+Output.substring(subOutput+1)+"Class.java");
			PrintStream printStream1 = new PrintStream(new FileOutputStream(file1));
			System.setOut(printStream1);
			walker1.walk(ekstrak1,tree1);
			
			}
		}
	
		/*
		public void tes(String Output) throws IOException{
			
			String inputFile=path;
			
			if(!path.equals("")){
				
				FinalInputTokens FinalInputTokens = new FinalInputTokens(inputFile);
				
				System.out.println(FinalInputTokens.final_tokens());
				
				ANTLRInputStream input = new ANTLRInputStream(FinalInputTokens.final_tokens());
				
				ADTCLexer lexer = new ADTCLexer(input);
				
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				
				ADTCParser parser = new ADTCParser(tokens);
				
				ParseTreeWalker walker = new ParseTreeWalker();
				
				ParseTree tree = parser.header();
				
				ExtractToClassJava ekstrak = new ExtractToClassJava(parser,name);
				
				walker.walk(ekstrak, tree);
				
			}
				
		}
		*/
	
		public void ParsingTree() throws IOException{
			
			String inputFile=path;
			
			if(!path.equals("")){
				
				InputStream is = new FileInputStream(inputFile);
				
				ANTLRInputStream input = new ANTLRInputStream(is);
				
				ADTCLexer lexer = new ADTCLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				ADTCParser parser = new ADTCParser(tokens);
				
				ParseTree tree = parser.header();
				
				JFrame frame = new JFrame("Parsing Tree ADT C");
		        JPanel panel = new JPanel();
		        
		    	JMenuBar menuBar = new JMenuBar();
				frame.setJMenuBar(menuBar);
				
				JMenu mnNewMenu = new JMenu("File");
				menuBar.add(mnNewMenu);
				
				JMenuItem mntmSaveAs = new JMenuItem("Export As PNG");
				mntmSaveAs.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						BufferedImage bi = new BufferedImage(panel.getWidth(),panel.getHeight(), BufferedImage.TYPE_4BYTE_ABGR); 
						Graphics g = bi.createGraphics();
						panel.paint(g);  //this == JComponent
						g.dispose();
						try{
							
							ImageIO.write(bi,"png",new File("d://test.png"));
							
						}
						catch (Exception e1) {
							
							e1.printStackTrace();
						}
					}
				});
			
				mnNewMenu.add(mntmSaveAs);
			    
		        TreeViewer view = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
		        view.setScale(1.5);//scale a little
		        panel.add(view);
		        
		        frame.add(panel);
		        JScrollPane jsp = new JScrollPane(panel);
		        frame.getContentPane().add(jsp);		        
		        jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		        		   
		        frame.setSize(700,700);
		        frame.setVisible(true);
			}
		
		}
        
	}
	