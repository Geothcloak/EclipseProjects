package com.justin.animals;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	public String eatABone(){
		return "he ate a bone"; 
	}
	
	@Override
	public String sayMyName(){
		return "barkbarkbark my name is " + name;
	}
}
