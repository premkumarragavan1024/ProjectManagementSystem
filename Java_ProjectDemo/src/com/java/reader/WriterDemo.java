package com.java.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "TEST DATA";
		 char[] arrays = new char[100];//

        try {
            // Creates a Writer using FileWriter
            Writer output = new FileWriter("/Users/thulasy/Documents/iDigiSoft Technology/Source Code/Core Java workspace/Java_ProjectDemo/src/com/java/reader/output.txt");


            // Writes string to the file
            output.write(data); 
            
           

            // Closes the writer
            output.close(); 
        }

        catch (FileNotFoundException e) {
            e.getStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 System.out.println(e.getMessage());
		}

	}

}
