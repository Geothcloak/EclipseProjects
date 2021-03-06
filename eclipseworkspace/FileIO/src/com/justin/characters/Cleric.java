package com.justin.characters;

import com.justin.fileio.Stats;

public class Cleric extends PlayerCharacter{
	private static final String CLERIC = "Cleric";
	private String classType;
	private String feat;
	
	public Cleric(String name, Stats stats) {
		super(name, stats);
		this.classType = CLERIC;
	}
	
	public void setFeat(String feat) {
		this.feat = feat;
	}
	@Override
	public String getClassType() {
		return classType;
	}
	@Override
	public String getFeat() {
		return feat;
	}
	
	@Override
	public String eatFood() {
		return "drank some wine";
	}
	

}
