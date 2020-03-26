package kush.fileprogram;

import java.io.File;

public class FilePathCompare {
		public static void main(String[] args) {
			File file1=new File("C:\\temp\\file.txt");
			File file2=new File("C:\\temp\\file2.txt");
			if(file1.compareTo(file2)==0) {
				System.out.println("Paths are Same");
			}
			else {
				System.out.println("Paths are different..");
			}
		}
}
