package com.justin.maps;

public class Animal implements Eatable{
	String name;
	String color;
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String eat() {
		return "i eat plants";
	}
	
	
}
