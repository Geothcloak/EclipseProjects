package com.justin.characters;

import com.justin.fileio.Stats;

public class Rogue extends PlayerCharacter{
	private static final String ROGUE = "Rogue";
	private String classType;
	private String feat;
	private Poison posion;
	
	
	public Rogue(String name, Stats stats) {
		super(name, stats);
		this.classType = ROGUE;
	}
	public Poison getPosion() {
		return posion;
	}
	public void setPosion(Poison posion) {
		this.posion = posion;
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
		return "ate some bread";
	}


}
