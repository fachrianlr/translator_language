import java.awt.*;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Element;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Main {

	private JFrame frmActijTranslatortranslator;
	private JTextArea textArea;
	private JTextArea txtStatus;
	private JTextArea lines;
	private JTextArea textDetail;
	private String tempDir="";
	
	private String textStatus = "Console Output :\nnothing...";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmActijTranslatortranslator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmActijTranslatortranslator = new JFrame("Translator ADT C ke Interface Java");
		frmActijTranslatortranslator.setTitle("ADTJ Translator (Translator ADT C ke Interface Java)");
		frmActijTranslatortranslator.setForeground(Color.BLACK);
		frmActijTranslatortranslator.setBackground(Color.BLACK);
		frmActijTranslatortranslator.setBounds(100, 100, 450, 300);
		frmActijTranslatortranslator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textArea = new JTextArea();
		txtStatus = new JTextArea();
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				txtStatus.setText("Console Output : \nFile Not Saved ...");
			}
		});
		
		textArea.setTabSize(2);
		lines = new JTextArea("1");
		textDetail = new JTextArea();
		
		JMenuBar menuBar = new JMenuBar();
		frmActijTranslatortranslator.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		textArea.setFont(new Font("consolas", Font.PLAIN, 16));
		
		lines.setColumns(5);
		lines.setFont(new Font("Consolas", Font.PLAIN, 16));
		lines.setBackground(Color.LIGHT_GRAY);
		lines.setEditable(false);
		
		textDetail.setBackground(Color.RED);
		textDetail.setEditable(false);
		textDetail.setSize(400,400);
		
		JScrollPane jsp = new JScrollPane(textArea);
		
		JMenuItem mntmLoadAdtCheader = new JMenuItem("Load File");
		mntmLoadAdtCheader.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setEditable(true);
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				int result = fileChooser.showOpenDialog(fileChooser);
				if (result == JFileChooser.APPROVE_OPTION) {
				    File f = fileChooser.getSelectedFile();
				    
				    tempDir=f.getAbsolutePath();
				    textStatus = "Console Output :\nLoad File : "+f.getName()+"\nIn directory: "+f.getAbsolutePath();
				    txtStatus.setText(textStatus);
			
				    String extension = f.getName().substring(f.getName().lastIndexOf(".")+1, f.getName().length());
				    
				    if(extension.equals("h")){
				    	
				    	try {
				    		
		                    FileReader reader = new FileReader(f);
		                    BufferedReader br = new BufferedReader(reader);
		                    textArea.read(br, null);  // Use TextComponent read
		                    
		                    br.close();
		                    lines.setText("");
		            		textArea.getDocument().addDocumentListener(new DocumentListener() {
		            			
		            			public String getText(){
		            				int caretPosition = textArea.getDocument().getLength();
		            				Element root = textArea.getDocument().getDefaultRootElement();
		            				String text = "1" + System.getProperty("line.separator");
		            				for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
		            					text += i + System.getProperty("line.separator");
		            				}
		            				return text;
		            			}
		            			
		            			@Override
		            			public void removeUpdate(DocumentEvent e) {
		            				// TODO Auto-generated method stub
		            				lines.setText(getText());
		            			}
		            			
		            			@Override
		            			public void insertUpdate(DocumentEvent e) {
		            				// TODO Auto-generated method stub
		            				lines.setText(getText());
		            			}
		            			
		            			@Override
		            			public void changedUpdate(DocumentEvent e) {
		            				// TODO Auto-generated method stub
		            				lines.setText(getText());
		            			}

		            		});
		                    
		                    
		                } catch (Exception e2) {
		                    System.out.println(e2);	               
		                }
		
				      }else
				    	  JOptionPane.showMessageDialog(null, "Format File Bukan Header File C!");
				    }
			}
		});
		
		mnNewMenu.add(mntmLoadAdtCheader);
				
		JMenuItem mntmSave = new JMenuItem("Save ");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String data = textArea.getText().trim();
			if(!data.equals("")){
			
				if(tempDir.equals("")) {
					
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
					int result = fileChooser.showSaveDialog(fileChooser);
					if(result==JFileChooser.APPROVE_OPTION){
						
						File f = fileChooser.getSelectedFile();
						try {
							FileWriter writer = new FileWriter(f+".h");
		                    BufferedWriter br = new BufferedWriter(writer);
							textArea.write(br);
							
							textStatus = "Console Output :\nFile Saved ... "+"\nIn directory: "+f.getAbsolutePath()+".h";
							txtStatus.setText(textStatus);
							
						} catch (Exception e2) {
							
							JOptionPane.showMessageDialog(null, "Gagal Menyimpan");;
							System.exit(1);
						}
					}
				}else {
					
					try {
						FileWriter writer = new FileWriter(tempDir);
	                    BufferedWriter br = new BufferedWriter(writer);
						textArea.write(br);
					    textStatus = "Console Output :\nFile Saved : \nIn directory: "+tempDir;
					    txtStatus.setText(textStatus);
					    
					} catch (Exception e2) {
						
						JOptionPane.showMessageDialog(null, "Gagal Menyimpan");
						System.exit(1);
					}
				}
			}else{
				JOptionPane.showMessageDialog(null, "Text Area Masih Kosong!");
			}
		 }
		});
		mnNewMenu.add(mntmSave);
	
		JMenuItem mntmSaveAs = new JMenuItem("Save As");
		mntmSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data = textArea.getText().trim();
				if(!data.equals("")){
					
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				int result = fileChooser.showSaveDialog(fileChooser);
				if(result==JFileChooser.APPROVE_OPTION){
					
					File f = fileChooser.getSelectedFile();
					try {
						FileWriter writer = new FileWriter(f+".h");
	                    BufferedWriter br = new BufferedWriter(writer);
						textArea.write(br);
						
					    textStatus = "Console Output :\nFile Saved : \nIn directory: "+f.getAbsolutePath()+".h";
					    txtStatus.setText(textStatus);
					    
					} catch (Exception e2) {
						
						JOptionPane.showMessageDialog(null, "Gagal Menyimpan");
						System.exit(1);
					}
				}
				
				}else {
					JOptionPane.showMessageDialog(null, "Text Area Masih Kosong!");
				}
			}
		});
		mnNewMenu.add(mntmSaveAs);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmActijTranslatortranslator.dispose();
			}
		});
		mnNewMenu.add(mntmExit);
		
		JMenu mnNewMenu_1 = new JMenu("Tools");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmTranlasiKeInterface = new JMenuItem("Translating to Java Interface");
		mntmTranlasiKeInterface.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if(!tempDir.equals("")){
				
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				int result = fileChooser.showSaveDialog(fileChooser);
				
				if(result==JFileChooser.APPROVE_OPTION){{
					
				File dir = fileChooser.getSelectedFile();
				InputOutput input = new InputOutput(tempDir,dir.getName());
				try {
					input.Translasi(dir.getAbsolutePath());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				textStatus = "Console Output :\nFiles Generated Success...: \nSaved In directory : \n"+dir.getAbsolutePath()+".java\n"+dir.getAbsolutePath()+"Class.java";
			    txtStatus.setText(textStatus);
				
				}
			  }
			}else{
				JOptionPane.showMessageDialog(null, "File ADT C Belum Dipilih!");
			}
			}
		});
		mnNewMenu_1.add(mntmTranlasiKeInterface);
		
		JMenuItem mntmParsingTreeAdt = new JMenuItem("Parsing Tree ADT C");
		mntmParsingTreeAdt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!tempDir.equals("")){
				 
					InputOutput form = new InputOutput(tempDir,null);
					try {
						form.ParsingTree();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else
					JOptionPane.showMessageDialog(null, "File ADT C Belum Dipilih!");
			 }
		});
		mnNewMenu_1.add(mntmParsingTreeAdt);
		
		JMenuItem mntmTes = new JMenuItem("Help");
		mntmTes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setEditable(false);
				textArea.setText("Cara Pemakaian ADTJ Translator : \n"
								 + "1. Masukan ADT C berupa header file C pada direktori yang dipilih.\n"
						         + "2. ADT C yang dipilih akan ditampilkan pada text editor. \n"
						         + "3. Data ADT C dapat diedit pada text editor untuk diperbarui.\n"
						         + "4. Setelah ADT C dipilih, maka pilih perintah \"Translasi Ke Interface Java\" \n"
						         + "   pada menu bar \"Tools\".\n"
						         + "5. Pilih direktori untuk tempat penyimpanan interface Java.\n"
						         + "6. File interface Java hasil translasi dari ADT C tersimpan pada direktori\n"
						         + "   tersebut.");
			}
		});
		mnNewMenu_1.add(mntmTes);
		
		textArea.getDocument().addDocumentListener(new DocumentListener() {
			
			public String getText(){
				int caretPosition = textArea.getDocument().getLength();
				Element root = textArea.getDocument().getDefaultRootElement();
				String text = "1" + System.getProperty("line.separator");
				for(int i = 2; i < root.getElementIndex( caretPosition ) + 2; i++){
					text += i + System.getProperty("line.separator");
				}
				return text;
			}
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				lines.setText(getText());
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				lines.setText(getText());
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				lines.setText(getText());
			}

		});
		frmActijTranslatortranslator.getContentPane().setLayout(new BorderLayout(0, 0));
		
		jsp.setViewportView(textArea);
		jsp.setRowHeaderView(lines);

		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		txtStatus.setEditable(false);
		txtStatus.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtStatus.setText("Console Output :\r\n");
		
		frmActijTranslatortranslator.getContentPane().add(txtStatus, BorderLayout.SOUTH);
		
		frmActijTranslatortranslator.getContentPane().add(jsp);
		frmActijTranslatortranslator.pack();
		frmActijTranslatortranslator.setSize(900, 400);
		frmActijTranslatortranslator.setVisible(true);
	}
}
