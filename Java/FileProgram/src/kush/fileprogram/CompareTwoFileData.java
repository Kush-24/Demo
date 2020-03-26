package kush.fileprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompareTwoFileData {

	public static void main(String[] args) throws IOException {
		BufferedReader read1=new BufferedReader(new FileReader("C:\\temp\\file.txt"));
		BufferedReader read2=new BufferedReader(new FileReader("C:\\temp\\file2.txt"));
	      String file1Line=read1.readLine();
	      String file2Line=read2.readLine();
	      boolean isEqual=true;
	      int lineNumber=1;
	     while(file1Line!=null || file2Line!=null) {
	    	 if(file1Line ==null || file2Line ==null || !file1Line.equalsIgnoreCase(file2Line)) {
	    		 isEqual=false;
	    		 break;
	    	 }
	    	 file1Line=read1.readLine();
	    	 file2Line=read2.readLine();
	    	 lineNumber++;
	     }
	      if(isEqual) {
	    	  System.out.println("File1 and File2 content are equal..");
	      }
	      else {
	    	  System.out.println("File1 and File2 content are not equal..");
	    	  System.out.println("File1 is : "+file1Line +" and "+"File2 is:"+file2Line+" on LineNumber"+lineNumber);
	      }
	      read1.close();
	      read2.close();
	}

}
