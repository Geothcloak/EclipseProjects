package com.justin.shippingSystem.calculator;

import com.justin.shippingSystem.Dimentions;

public class CalcWeightPerFoot {
	public double calcWeightPerFoot(Dimentions dimentions, double weight){
		CalcVolume calcVolume = new CalcVolume();
		return (calcVolume.calcVolume(dimentions)/weight);
	}
}
