package com.justin.cipher;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterSwapIncoder implements Cipherable{
	Map<Character, Character> cipherMap;
	Map<Character, Character> decipherMap;
	public CharacterSwapIncoder(Map<Character, Character> charsMap){
		this.cipherMap = charsMap;
		decipherMap = new HashMap<>();
		for (Entry<Character, Character> c : cipherMap.entrySet()) {
			decipherMap.put(c.getValue(), c.getKey());
		}
	}
	
	@Override
	public String useCipher(String string) {
		return buildAndReplaceCharacters(cipherMap, string);
	}

	@Override
	public String useDeCipher(String string) {
		return buildAndReplaceCharacters(decipherMap, string);
	}
	
	public String buildAndReplaceCharacters(Map<Character, Character> cipher, String string){
		char[] charsArray = string.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : charsArray) {
			stringBuilder.append(cipher.get(c));
		}
		return stringBuilder.toString();
	}
}
