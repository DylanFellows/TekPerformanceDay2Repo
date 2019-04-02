package com.fellows.day2.model.animal.mammal;

import com.fellows.day2.model.animal.Mammal;
import com.fellows.day2.model.animal.behavior.Hunting;
import com.fellows.day2.model.animal.behavior.Running;
import com.fellows.day2.model.animal.behavior.Swimming;
import com.fellows.day2.model.animal.behavior.Walking;

public class Tiger extends Mammal implements Hunting, Walking, Running, Swimming {

	public Tiger(int height, int weight, int numberOfOffspring, String hairColor) {
		super(height, weight, numberOfOffspring, hairColor);
	}

	private boolean isTigerHunting;

	public void setHunting(boolean isHunting) {
		this.isTigerHunting = isHunting;
	}

	@Override
	public void swim() {
		System.out.println("Tiger is swimming with all four legs.");
	}

	@Override
	public void run() {
		System.out.println("Tiger is running on all four legs.");
	}

	@Override
	public void run(int speed) {
		System.out.println("Tiger is running at speed of " + speed + " ft/sec.");
	}

	@Override
	public void walk() {
		System.out.println("Tiger is walking on all four legs.");
	}

	@Override
	public void isHunting() {
		if(isTigerHunting == true) {
			System.out.println("Tiger is hunting.");
		} else {
			System.out.println("Tiger is not hunting.");
		}
	}

	@Override
	public void eat() {
		System.out.println("Tiger is eating meat with its sharp teeth.");
	}

	@Override
	public void move() {
		System.out.println("Tiger is moving on all four legs.");
	}

}
