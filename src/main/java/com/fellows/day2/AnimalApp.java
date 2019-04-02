package com.fellows.day2;

import com.fellows.day2.model.animal.bird.Duck;
import com.fellows.day2.model.animal.bird.Ostrich;
import com.fellows.day2.model.animal.bird.Wren;
import com.fellows.day2.model.animal.mammal.Elephant;
import com.fellows.day2.model.animal.mammal.Tiger;

public class AnimalApp {
	public static void main (String [] args) {
		
		Ostrich ostrich = new Ostrich(5, 120, 2, 15);
		ostrich.run();
		ostrich.run(12);
		ostrich.eat();
		ostrich.walk();
		ostrich.move();
		
		Duck duck = new Duck(1, 5, 6, 4);
		duck.walk();
		duck.fly();
		duck.fly(100);
		duck.swim();
		duck.eat();
		duck.move();
		
		Wren wren = new Wren(1, 1, 3, 1);
		wren.fly();
		wren.fly(75);
		wren.eat();
		wren.walk();
		wren.swim();
		wren.move();
		
		Elephant elephant = new Elephant(10,1000,1, "Gray");
		elephant.walk();
		elephant.run();
		elephant.run(5);
		elephant.swim();
		elephant.eat();
		elephant.move();
		
		Tiger tiger = new Tiger(4,200,3, "Orange");
		tiger.run();
		tiger.walk();
		tiger.swim();
		tiger.run(8);
		tiger.move();
		tiger.setHunting(false);
		tiger.isHunting();
		tiger.eat();
		
	}
}
