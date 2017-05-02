package com.justin.cipher;

import java.util.HashMap;
import java.util.Map;

public class MessageReadWriter {
	public String readAndWriteMessage(String filePathRead, String filePathWrite){
		Map<Character, Character> chars = new HashMap<>();
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
		
		
		ReadMessageFromFile readMessageFromFile = new ReadMessageFromFile();
		Cipherable cipherable = new CharacterSwapIncoder(chars);
		PrintMessageToFile printMessageToFile = new PrintMessageToFile();
		
		String messageRead = readMessageFromFile.readMessageFromFile(filePathRead);
		
		printMessageToFile.printMessageToFile(filePathWrite, cipherable.useCipher(messageRead));
		
		
		return null;
	}
}
