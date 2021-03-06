package com.justin.dcompany;

public class Salaried extends Employee{
	Rewardable rewardable;
	private double yearlySalary;
	public Salaried(String name, int id, String department, double yearlySalary) {
		super(name, id, department);
		this.yearlySalary = yearlySalary;
	}
	
	public Salaried(String name, int id, String department, double yearlySalary, Rewardable rewardable) {
		super(name, id, department);
		this.yearlySalary = yearlySalary;
		this.rewardable = rewardable;
	}
	
	

	@Override
	public double CalculatePayCheck() {
		double payCheck;
		payCheck = yearlySalary / 26;
		//TODO subtract witholdings
		if (rewardable != null){
			payCheck += rewardable.PayCheckReward(payCheck);
		}
		
		return payCheck;
	}
	
}