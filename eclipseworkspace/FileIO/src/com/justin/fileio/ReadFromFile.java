package com.justin.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.justin.characters.PlayerCharacter;

public class ReadFromFile {
	
	//"PlayerCharactersSaved.txt"
	public List<PlayerCharacter> ReadPlayerCharacterFromFile(String FilePath){
		
		List<PlayerCharacter> playerCharacters = new ArrayList<>();
		SetClassType setClassType = new SetClassType();
		
		try{
			BufferedReader reader = new BufferedReader(new FileReader(FilePath));
			String currentLine;
			while ((currentLine = reader.readLine())!= null) {
				String[] tempArray = currentLine.split(",");
				
				Stats stats = new Stats(Integer.parseInt(tempArray[1]), Integer.parseInt(tempArray[2]), 
						Integer.parseInt(tempArray[3]), Integer.parseInt(tempArray[4]));
				
				playerCharacters.add(setClassType.calcClass(tempArray[0], stats));				
	        }
			reader.close();
		}catch(IOException e){
			System.out.println("could not find file." + e.getMessage());
		}
		
		/* int i = 0;
		while(tempArray[i] != null){
			System.out.println(tempArray[i].toString());
			i++;
		} */
		return playerCharacters;
		
	}
	
}

