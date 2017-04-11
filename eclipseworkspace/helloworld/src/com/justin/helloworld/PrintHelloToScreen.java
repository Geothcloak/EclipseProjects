package com.justin.helloworld;

public class PrintHelloToScreen {
	private String messageToPrint;
	public PrintHelloToScreen(String messageToPrint) {
		
		this.messageToPrint = messageToPrint;
	}
	
	private String printIt(){
		System.out.println(messageToPrint +" inside printIt.");
		return messageToPrint;
	}
	
	String printIt(String customMessage){
		System.out.println(customMessage +" inside printIt with argument.");
		return customMessage;
	}
	
	String printIt(char customMessage){
		System.out.println(customMessage +" inside printIt with argument.");
		return customMessage + " ";
	}
	
	
	//private void testing(){
		//printIt();
		//this.printIt();
//	}
	
	

	
	
}
