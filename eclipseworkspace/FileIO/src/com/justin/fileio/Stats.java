package com.justin.fileio;

public class Stats {
	private int intellect;
	private int charisma;
	private int strength;
	private int stamina;
	public Stats(int intellect, int charisma, int strength, int stamina){
		this.intellect = intellect;
		this.charisma = charisma;
		this.strength = strength;
		this.stamina = stamina;
	}
	public int getIntellect(){
		return intellect;
	}
	public int getCharisma(){
		return charisma;
	}
	public int getStrength(){
		return strength;
	}
	public int getStamina(){
		return stamina;
	}
}

