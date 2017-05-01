package com.justin.characters;

import com.justin.fileio.Stats;

public class Wizard extends PlayerCharacter{
	private static final String WIZARD = "Wizard";
	private String classType;
	private String feat;
	private DestructiveSpell destructiveSpell;
	
	public Wizard(String name, Stats stats) {
		super(name, stats);
		this.classType = WIZARD;
	}
	
	public void setDestructiveSpell(DestructiveSpell destructiveSpell) {
		this.destructiveSpell = destructiveSpell;
	}

	public DestructiveSpell getDestructiveSpell(){
		return destructiveSpell;
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
		return "ate a fish";
	}

}
