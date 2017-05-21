package com.justin.totemBiz;

public class Totem {
	float height;
	String name;
	String material;
	int totalSpirits;
	
	public Totem(float height, String name, String material, int totalSpirits){
		this.height = height;
		this.name = name;
		this.material = material;
		this.totalSpirits = totalSpirits;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTotalSpirits() {
		return totalSpirits;
	}

	public void setTotalSpirits(int totalSpirits) {
		this.totalSpirits = totalSpirits;
	}
	
}
