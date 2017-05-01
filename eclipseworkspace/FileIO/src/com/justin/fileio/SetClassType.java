package com.justin.fileio;

import com.justin.characters.Cleric;
import com.justin.characters.PlayerCharacter;
import com.justin.characters.Rogue;
import com.justin.characters.Warrior;
import com.justin.characters.Wizard;

public class SetClassType {
	public PlayerCharacter calcClass(String name, Stats stats){
		//all equal then they are cleric
		PlayerCharacter playerCharacter = null;
		
		//if sum of stats is >=24 they are rogue
		if (stats.getIntellect() + stats.getCharisma() + stats.getStrength() + stats.getStamina() == 24){
			playerCharacter = new Rogue(name, stats);
		}
		else if (stats.getIntellect() == stats.getCharisma() && stats.getIntellect() == stats.getStrength()
				&& stats.getIntellect() == stats.getStamina()){

			playerCharacter = new Cleric(name, stats);
		}
		//highest stat is int then wizard
		else if (stats.getIntellect() > stats.getStamina() && stats.getIntellect() > stats.getStrength()
				&& stats.getIntellect() > stats.getCharisma()){
			playerCharacter = new Wizard(name, stats);
		}
		//highest stat is stam then warrior
		else if (stats.getStamina() > stats.getIntellect() && stats.getStamina() > stats.getCharisma()
				&& stats.getStamina() > stats.getStrength()){
			playerCharacter = new Warrior(name, stats);	
		}
		else{
			playerCharacter = new Warrior(name, stats);
		}
		return playerCharacter;
	}
}
