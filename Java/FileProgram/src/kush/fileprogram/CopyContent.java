package kush.fileprogram;

import java.io.*;

public class CopyContent {
		public static void main(String[] args) throws IOException {
			copyOneFileToAnother();
			copyContent();
		}

		private static void copyContent() throws IOException {
			BufferedReader read=new BufferedReader(new FileReader("C:\\temp\\file4.txt"));
			File file=new File("C:\\temp\\report.txt");
			FileWriter writer=new FileWriter(file);
			if(!file.exists())
				file.createNewFile();
			String line=read.readLine();
			while(line!=null) {
				writer.write(line);	
				line=read.readLine();
			}
			System.out.println("Data copied..");
			writer.close();read.close();
		}

		private static void copyOneFileToAnother() throws IOException {
			  try {
			         File infile = new File("C:\\temp\\file4.txt");
			         File outfile = new File("C:\\temp\\kushfile.txt");
			      FileInputStream  ins = new FileInputStream(infile);
			      FileOutputStream outs = new FileOutputStream(outfile);
			         byte[] buffer = new byte[1024];
			         int length;
			         
			         while ((length = ins.read(buffer)) > 0) {
			            outs.write(buffer, 0, length);
			         } 
			         ins.close();
			         outs.close();
			         System.out.println("File copied successfully!!");
			      }
			  catch(IOException ioe) {
			         ioe.printStackTrace();
			      } 
			   }
		}
