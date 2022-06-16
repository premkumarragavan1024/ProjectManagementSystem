package com.java.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 // Creates an array of character
        char[] array = new char[100];//

        try {
            // Creates a reader using the FileReader /Users/thulasy/Documents/iDigiSoft Technology/Source Code/Core Java workspace/Java_ProjectDemo/src/com/java/reader/input.txt
        	FileReader input = new FileReader("/Users/thulasy/Documents/iDigiSoft Technology/Source Code/Training_Workspace/Java_ProjectDemo/src/com/java/reader/input.txt");

            // Checks if reader is ready 
            System.out.println("Is there data in the stream?  " + input.ready());

            // Reads characters
            input.read(array);
            System.out.println("Data in the stream:");
            System.out.println(array);

            // Closes the reader
            input.close();
        }

        catch(FileNotFoundException e) {
            e.getStackTrace();
            System.out.println("File Not Found");
        }
	}

}
