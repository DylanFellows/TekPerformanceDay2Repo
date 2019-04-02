package com.fellows.day2.model.animal.bird;

import com.fellows.day2.model.animal.Bird;
import com.fellows.day2.model.animal.behavior.Flying;
import com.fellows.day2.model.animal.behavior.Swimming;
import com.fellows.day2.model.animal.behavior.Walking;

public class Wren extends Bird implements Flying, Swimming, Walking {

	public Wren(int height, int weight, int numberOfOffspring, int wingSpan) {
		super(height, weight, numberOfOffspring, wingSpan);
	}

	@Override
	public void fly() {
		System.out.println("Wren is flying.");
	}

	@Override
	public void fly(int altitude) {
		System.out.println("Wren is flying at altitude of " + altitude + " meters.");
	}

	@Override
	public void walk() {
		System.out.println("Wren is walking with both legs.");
	}

	@Override
	public void swim() {
		System.out.println("Wren is swimming with its wings and legs.");
	}

	@Override
	public void eat() {
		System.out.println("Wren is eating with its beak.");
	}

	@Override
	public void move() {
		System.out.println("Wren is moving with both legs.");
	}

}
