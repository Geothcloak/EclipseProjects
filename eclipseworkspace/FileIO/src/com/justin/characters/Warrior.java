package com.justin.characters;

import com.justin.fileio.Stats;

public class Warrior extends PlayerCharacter{
	private static final String WARRIOR = "Warrior";
	private String classType;
	private String feat;
	
	public Warrior(String name, Stats stats) {
		super(name, stats);
		this.classType = WARRIOR;
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
		return "ate some mutton";
	}
}
