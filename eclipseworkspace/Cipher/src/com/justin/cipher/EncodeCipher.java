package com.justin.cipher;

import java.util.HashMap;
import java.util.Map;

public class EncodeCipher implements Cipherable{
	@Override
	public String useCipher() {
		Map<Character, Character> chars = new HashMap<>();
		chars.put('a', 'b');
		chars.put('b', 'b');
		chars.put('c', 'b');
		chars.put('d', 'b');
		chars.put('e', 'b');
		chars.put('f', 'b');
		chars.put('g', 'b');
		chars.put('h', 'b');
		chars.put('i', 'b');
		chars.put('j', 'b');
		chars.put('k', 'b');
		chars.put('l', 'b');
		chars.put('m', 'b');
		chars.put('n', 'b');
		chars.put('o', 'b');
		chars.put('p', 'b');
		chars.put('q', 'b');
		chars.put('r', 'b');
		chars.put('s', 'b');
		chars.put('t', 'b');
		chars.put('u', 'b');
		chars.put('v', 'b');
		chars.put('w', 'b');
		chars.put('x', 'b');
		chars.put('y', 'b');
		chars.put('z', 'b');
		return null;
	}

}
