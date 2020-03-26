package kush.fileprogram;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaHtml {
	     public static void main(String[] a) throws IOException {
	                PrintWriter pw = new PrintWriter(new FileWriter("C:\\temp\\report.html"));
	                pw.println("<TABLE BORDER><TR><TH>Number<TH>Square of Number</TR>");
	                for (int i = 1; i <= 20; i++) {
	                       int square = i * i;
	                       pw.println("<TR><TD>" + i + "<TD>" + square);
	                }
	                pw.println("</TABLE>");
	                pw.close();
	    }
}
