package com.justin.cipher;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PrintMessageToFileTest {
	PrintMessageToFile printMessageToFile;
	
	@Before
	public void init(){
		printMessageToFile = new PrintMessageToFile();
		
	}
	@Test
	public void canPrintMessageToFile(){
		Assert.assertEquals("hi", printMessageToFile.printMessageToFile("MessageAfterFormat.txt", "hi"));
	}
}
