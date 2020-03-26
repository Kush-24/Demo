package kush.fileprogram;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		createFileUsingFileClass();
		createFileUsingFileOutputStreamClass();
		checkFileExist();
		getLastModificationDateOfFile();
	}


	private static void checkFileExist() {
		File file=new File("C:\\temp\\File5.txt");
		System.out.println(file.exists());
	}

	private static void getLastModificationDateOfFile() throws IOException{
		File file=new File("C:\\temp\\File5.txt");
		Long lastMod=file.lastModified();
		Date date=new Date(lastMod);
		System.out.println("Last modified date is :"+date);
	}

	private static void createFileUsingFileOutputStreamClass() throws IOException {
		 String data="test file";
	      FileOutputStream out = new FileOutputStream("C:\\temp\\File5.txt");
	      out.write(data.getBytes());
	      out.close();
	}

	private static void createFileUsingFileClass() throws IOException {
		File file=new File("C:\\temp\\file4.txt");
		if(file.createNewFile())
			System.out.println("File created..");
		else
			System.out.println("Error , File already exist..");
	// write data
	FileWriter writer=new FileWriter(file);
	writer.write("Write anything inside the file...just created..");
	writer.close();
	}
}
