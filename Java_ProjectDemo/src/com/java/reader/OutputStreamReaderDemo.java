package com.java.reader;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String data = "Fileo utput";

	    try {
	      // Creates a FileOutputStream
	      FileOutputStream file = new FileOutputStream("/Users/thulasy/Documents/iDigiSoft Technology/Source Code/Training_Workspace/Java_ProjectDemo/src/com/java/reader/output.txt");

	      // Creates an OutputStreamWriter
	      OutputStreamWriter output = new OutputStreamWriter(file);

	      // Writes string to the file
	      output.write(data);

	      // Closes the writer
	      output.close();
	    }

	    catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
 

}
