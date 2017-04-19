package com.justin.shippingSystem.calculator;

import java.util.List;

import com.justin.shippingSystem.parcels.Crate;
import com.justin.shippingSystem.parcels.Letter;
import com.justin.shippingSystem.parcels.Parcel;

public class Sum {
	
	public double sumLetterPostage(List<Parcel> parcels){
		double sumOfPostage = 0;
		
		for(int i = 0; i < parcels.size(); i++){
			if (parcels.get(i).getType().equals("Letter")){
				Letter letter = (Letter)parcels.get(i);
				sumOfPostage += letter.getPostage();
			}
		}
		return sumOfPostage;
	}
	
	public double sumCrateWeight(List<Parcel> parcels){
		CalcVolume calcVolume = new CalcVolume();
		double sumOfVolume = 0;
		
		for(int i = 0; i < parcels.size(); i++){
			if (parcels.get(i).getType().equals("Crate")){
				Crate crate = (Crate)parcels.get(i);
				sumOfVolume += calcVolume.calcVolume(crate.getDimention());
			}
			/*   by checking literal on left side i can avoid possible null pointer. 
			if ("Crate".equals(parcels.get(i).getType())){	
			}
			*/
		}
		return sumOfVolume;
	}
}
