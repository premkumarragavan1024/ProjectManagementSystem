package com.java.reader;

import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.io.FileInputStream;

public class InputStreamgetEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      // Creates a FileInputStream
		      FileInputStream file = new FileInputStream("/Users/thulasy/Documents/iDigiSoft Technology/Source Code/Core Java workspace/Java_ProjectDemo/src/com/java/reader/input.txt");

		      // Creates an InputStreamReader with default encoding
		      InputStreamReader input1 = new InputStreamReader(file);

		      // Creates an InputStreamReader specifying the encoding
		      InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF8"));//unicode-8

		      // Returns the character encoding of the input stream
		      System.out.println("Character encoding of input1: " + input1.getEncoding());
		      System.out.println("Character encoding of input2: " + input2.getEncoding());

		      // Closes the reader
		      input1.close();
		      input2.close();
		    }

		    catch(Exception e) {
		      e.getStackTrace();
		    }

	}

}
