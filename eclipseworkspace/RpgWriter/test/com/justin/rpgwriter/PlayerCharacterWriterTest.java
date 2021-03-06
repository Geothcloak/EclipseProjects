package com.justin.rpgwriter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlayerCharacterWriterTest {
	PlayerCharacterWriter playerCharacterWriter;
	PlayerCharacter playerCharacter;
	@Before
	public void init(){
		playerCharacterWriter = new PlayerCharacterWriter();
		playerCharacter = new PlayerCharacter("bob", 0, 10, 3, 8);
	}
	@Test
	public void canWriteToFile(){
		Assert.assertEquals("name: bob int: 0 str: 10 charisma: 3 stamina: 8", playerCharacterWriter.writeToFile(playerCharacter));
	}
}
