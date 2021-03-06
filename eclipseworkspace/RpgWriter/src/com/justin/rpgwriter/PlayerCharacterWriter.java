package com.justin.rpgwriter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class PlayerCharacterWriter {
	public String writeToFile(PlayerCharacter playerCharacter){
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("name: ").append(playerCharacter.getName());
		stringBuilder.append(" int: ").append(playerCharacter.getIntellect());
		stringBuilder.append(" str: ").append(playerCharacter.getStrength());
		stringBuilder.append(" charisma: ").append(playerCharacter.getCharisma());
		stringBuilder.append(" stamina: ").append(playerCharacter.getStamina());
		
		try{
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("whatever.txt")));
			writer.write(stringBuilder.toString());
			writer.close();
		}catch(IOException e){
			System.out.println("could not find file." + e.getMessage());
		}
		
		
		
		
		
		return stringBuilder.toString();
	}
}
