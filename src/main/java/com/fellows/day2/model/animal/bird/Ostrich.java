package com.fellows.day2.model.animal.bird;

import com.fellows.day2.model.animal.Bird;
import com.fellows.day2.model.animal.behavior.Running;
import com.fellows.day2.model.animal.behavior.Walking;

public class Ostrich extends Bird implements Running, Walking {

	public Ostrich(int height, int weight, int numberOfOffspring, int wingSpan) {
		super(height, weight, numberOfOffspring, wingSpan);
	}

	@Override
	public void run() {
		System.out.println("Ostrich is running on both legs.");
	}

	@Override
	public void run(int speed) {
		System.out.println("Ostrich is running at speed of " + speed + " ft/sec.");

	}

	@Override
	public void eat() {
		System.out.println("Ostrich is eating with its beak.");
	}

	@Override
	public void move() {
		System.out.println("Ostrich is moving with both legs.");
	}

	@Override
	public void walk() {
		System.out.println("Ostrich is walking with both legs.");
	}

}
