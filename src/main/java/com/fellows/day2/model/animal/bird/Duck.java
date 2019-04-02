package com.fellows.day2.model.animal.bird;

import com.fellows.day2.model.animal.Bird;
import com.fellows.day2.model.animal.behavior.Flying;
import com.fellows.day2.model.animal.behavior.Swimming;
import com.fellows.day2.model.animal.behavior.Walking;

public class Duck extends Bird implements Flying, Swimming, Walking {

	public Duck(int height, int weight, int numberOfOffspring, int wingSpan) {
		super(height, weight, numberOfOffspring, wingSpan);
	}

	@Override
	public void swim() {
		System.out.println("Duck is Swimming with its webbed feet.");
	}

	@Override
	public void fly() {
		System.out.println("Duck is flying.");
	}

	@Override
	public void fly(int altitude) {
		System.out.println("Duck is flying at altitude of " + altitude + " meters.");
	}

	@Override
	public void walk() {
		System.out.println("Duck is walking on both legs.");
	}

	@Override
	public void eat() {
		System.out.println("Duck is eating with its beak.");
	}

	@Override
	public void move() {
		System.out.println("Duck is moving with both legs.");
	}

}
