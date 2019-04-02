package com.fellows.day2.model.animal;

public abstract class Mammal extends Animal {
	public Mammal(int height, int weight, int numberOfOffspring, String hairColor) {
		super(height, weight, numberOfOffspring);
	}

	private String hairColor;

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

}
