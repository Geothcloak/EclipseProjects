package com.justin.cipher;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReadMessageFromFileTest {
	ReadMessageFromFile readMessageFromFile;
	@Before
	public void init(){
		 readMessageFromFile = new ReadMessageFromFile();
	} 
	@Test
	public void canReadMessageFromFile(){
		Assert.assertEquals("hi my name is cat because im a cat", readMessageFromFile.readMessageFromFile("Password.txt"));
	}
}
