package com.justin.fileio;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.justin.characters.PlayerCharacter;

public class WriteToFileTest {
	WriteToFile writeToFileUnderTest;
	ReadFromFile readFromFile;
	@Before
	public void init(){
		readFromFile = new ReadFromFile();
		writeToFileUnderTest = new WriteToFile();
		
	}
	@Test
	public void canWriteToFile() {
		
		writeToFileUnderTest.writeToFile(readFromFile.ReadPlayerCharacterFromFile(
				"PlayerCharactersSaved.txt"));
		//Assert.assertEquals(" ", writeToFileUnderTest.writeToFile(playerCharacters));
	}
}
