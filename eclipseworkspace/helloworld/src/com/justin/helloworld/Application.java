package com.justin.helloworld;

public class Application {
	public static void main(String[] args) {
		PrintHelloToScreen printHelloToScreen = new PrintHelloToScreen("hellow world");
		PrintHelloToScreen printHelloToScreen2 = new PrintHelloToScreen("trick or treat");
		
		String toCatchAPreditor;
		toCatchAPreditor = printHelloToScreen.printIt("do it up");
		System.out.println(toCatchAPreditor + " inside main.");
		
		
		toCatchAPreditor = printHelloToScreen2.printIt();
		System.out.println(toCatchAPreditor + " inside main.");
		
		toCatchAPreditor = printHelloToScreen.printIt('6');
		
		AdvancedPrinter advancedPrinter = new AdvancedPrinter();
	}
}
