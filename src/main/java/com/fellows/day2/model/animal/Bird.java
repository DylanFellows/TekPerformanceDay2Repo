package com.fellows.day2.model.animal;

public abstract class Bird extends Animal {
	private int wingSpan;

	public Bird(int height, int weight, int numberOfOffspring, int wingSpan) {
		super(height, weight, numberOfOffspring);
		this.wingSpan = wingSpan;
	}

	public int getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	
}
