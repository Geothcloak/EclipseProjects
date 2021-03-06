package com.justin.fileio;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

import com.justin.characters.PlayerCharacter;

public class WriteToFile {
	public String writeToFile(List<PlayerCharacter> playerCharacters){
		//output(class, name, stats, feat)
		StringBuilder stringBuilder = new StringBuilder();
		StatsReporter statsReporter = new StatsReporter();
		
		try{
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("FromTheWriter.txt")));
			
			for(int i = 0; i < playerCharacters.size(); i ++){
				stringBuilder.append("Class: ").append(playerCharacters.get(i).getClassType());
				stringBuilder.append(", Name: ").append(playerCharacters.get(i).getName());
				stringBuilder.append(", Stats: ").append(statsReporter.formatStats(playerCharacters.get(i).getStats()));
				stringBuilder.append("\n");
			}
			writer.write(stringBuilder.toString());
			writer.close();
		}catch(IOException e){
			System.out.println("could not find file." + e.getMessage());
		}
		return stringBuilder.toString();
	}
}

