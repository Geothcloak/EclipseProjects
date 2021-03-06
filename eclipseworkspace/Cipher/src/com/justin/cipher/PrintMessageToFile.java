package com.justin.cipher;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PrintMessageToFile {
	
	public String printMessageToFile(String filePath, String messageToPrint){
		
		try{
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath)));
			writer.write(messageToPrint);
			
			writer.close();
		}catch(IOException e){
			System.out.println("Could not write to file.");
		}
		return messageToPrint;
	}
}
