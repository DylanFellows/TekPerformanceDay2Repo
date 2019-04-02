package com.fellows.day2.model.animal;

import com.fellows.day2.model.animal.behavior.Eating;
import com.fellows.day2.model.animal.behavior.Moving;

public abstract class Animal implements Eating, Moving {
	private int height;
	private int weight;
	private int numberOfOffspring;
	
	public Animal(int height, int weight, int numberOfOffspring) {
		super();
		this.height = height;
		this.weight = weight;
		this.numberOfOffspring = numberOfOffspring;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getNumberOfOffspring() {
		return numberOfOffspring;
	}

	public void setNumberOfOffspring(int numberOfOffspring) {
		this.numberOfOffspring = numberOfOffspring;
	}

}
