package com.justin.fileio;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReadFromFileTest {
	ReadFromFile readFromFile;
	@Before
	public void init(){
		readFromFile = new ReadFromFile();
	}
	@Test
	public void test() {
		Assert.assertEquals(10, readFromFile.ReadPlayerCharacterFromFile("PlayerCharactersSaved.txt").size());
	}

}
