package com.fellows.day2.model.animal.mammal;

import com.fellows.day2.model.animal.Mammal;
import com.fellows.day2.model.animal.behavior.Running;
import com.fellows.day2.model.animal.behavior.Swimming;
import com.fellows.day2.model.animal.behavior.Walking;

public class Elephant extends Mammal implements Running, Swimming, Walking {
	
	public Elephant(int height, int weight, int numberOfOffspring, String hairColor) {
		super(height, weight, numberOfOffspring, hairColor);
	}

	@Override
	public void eat() {
		System.out.println("Elephant is eating greens with its trunk.");
	}

	@Override
	public void move() {
		System.out.println("Elephant is moving on all four legs.");
	}

	@Override
	public void walk() {
		System.out.println("Elephant is walking on all four legs.");
	}

	@Override
	public void swim() {
		System.out.println("Elephant is swimming with all four legs.");
	}

	@Override
	public void run() {
		System.out.println("Elephant is running on all four legs.");
	}

	@Override
	public void run(int speed) {
		System.out.println("Elephant is running at speed of " + speed + " ft/sec.");
	}

}
