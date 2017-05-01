package com.justin.fileio;

public class StatsReporter {
	public String formatStats(Stats stats){
		return ("Int=" + stats.getIntellect() + "Chr=" + stats.getCharisma()
			+ "Str=" + stats.getStrength() + "Sta=" + stats.getStamina());
		
	}
}
