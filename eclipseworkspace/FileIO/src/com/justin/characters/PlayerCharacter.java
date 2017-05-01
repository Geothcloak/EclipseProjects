package com.justin.characters;

import com.justin.fileio.Stats;

public abstract class PlayerCharacter {
	private String name;
	private Stats stats;
	private String classType;
	private String feat;
	public PlayerCharacter(String name, Stats stats){
		this.name = name;
		this.stats = stats;
	}
	public final String getName(){
		return name;
	}
	public final Stats getStats(){
		return stats;
	}
	public String getClassType() {
		return classType;
	}

	public String getFeat() {
		return feat;
	}
		
	public abstract String eatFood();
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	
	
}
