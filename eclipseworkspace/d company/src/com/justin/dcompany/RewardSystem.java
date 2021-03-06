package com.justin.dcompany;

import java.util.Random;

public class RewardSystem implements Rewardable{
	private double maxReward = 1.5; 
	private double minReward = .5;
	@Override 
	public double PayCheckReward(double payCheck){
		double randomReward;
		Random rand = new Random();
		randomReward = rand.nextDouble() * maxReward + minReward;
		return  payCheck * randomReward;
	}
}
