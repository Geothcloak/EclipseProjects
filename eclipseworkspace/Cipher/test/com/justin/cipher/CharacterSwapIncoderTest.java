package com.justin.cipher;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CharacterSwapIncoderTest {
	CharacterSwapIncoder useCipher;
	Map<Character, Character> chars;
	@Before
	public void init(){
		
		chars = new HashMap<>();
		chars.put('a', 'b');
		chars.put('b', 'c');
		chars.put('c', 'd');
		chars.put('d', 'e');
		chars.put('e', 'f');
		chars.put('f', 'g');
		chars.put('g', 'h');
		chars.put('h', 'i');
		chars.put('i', 'j');
		chars.put('j', 'k');
		chars.put('k', 'l');
		chars.put('l', 'm');
		chars.put('m', 'n');
		chars.put('n', 'o');
		chars.put('o', 'p');
		chars.put('p', 'q');
		chars.put('q', 'r');
		chars.put('r', 's');
		chars.put('s', 't');
		chars.put('t', 'u');
		chars.put('u', 'v');
		chars.put('v', 'w');
		chars.put('w', 'x');
		chars.put('x', 'y');
		chars.put('y', 'z');
		chars.put('z', 'a');
		chars.put(' ', ' ');
		useCipher = new CharacterSwapIncoder(chars);
	}
	@Test
	public void canUseCipher(){
		Assert.assertEquals("ifmmp", useCipher.useCipher("hello"));
	}
	@Test
	public void canUseDeCipher(){
		Assert.assertEquals("hello", useCipher.useDeCipher("ifmmp"));
	}
	
}







