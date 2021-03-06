package com.justin.cipher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMessageFromFile {
	
	public String readMessageFromFile(String filePath){
		StringBuilder stringBuilder = new StringBuilder();
		
		try{
			String currentLine;
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			while(reader.ready()){
				currentLine = reader.readLine();
				stringBuilder.append(currentLine);
			}
				
			reader.close();
		}catch(IOException e){
			System.out.println("Could not find file." + e.getMessage());
		}
		
		return stringBuilder.toString();
	}
}
