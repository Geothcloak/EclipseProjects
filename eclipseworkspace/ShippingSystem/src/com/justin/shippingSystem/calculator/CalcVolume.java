package com.justin.shippingSystem.calculator;

import com.justin.shippingSystem.Dimentions;

public class CalcVolume {
	public double calcVolume(Dimentions dimentions){
		return dimentions.getDimentionX() * dimentions.getDimentionY() * dimentions.getDimentionZ();
	}
}
