package com.justin.cipher;

public class StringToArray {
	public char[] stringToArray(String message){
		char[] messageArray = new char[message.length() - 1];
		
		for (int i = 0; i < messageArray.length; i++){
			messageArray[i] = message.charAt(i);
		}
		
		return messageArray;
	}
}
