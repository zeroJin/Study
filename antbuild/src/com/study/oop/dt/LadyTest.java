package com.study.oop.dt;

import org.junit.Test;

class Animal {
	String name;
	Animal(String name){
		this.name = name;
	}
	public void enjoy(){
		System.out.println("叫声。。。");
	}
}

class Cat extends Animal {
	String color;
	Cat(String name, String color){
		super(name);
		this.color = color;
	}
	
	public void enjoy(){
		System.out.println(color + " " + name + " 猫叫声。。。");
	}
}

class Dog extends Animal {
	String color;
	Dog(String name, String color){
		super(name);
		this.color = color;
	}
	public void enjoy(){
		System.out.println("狗叫声。。。");
	}
}

class Lady {
	String name;
	Animal am;
	Lady(String name, Animal am){
		this.name = name;
		this.am = am;
	}
	public void myAmEnjoy(){
		am.enjoy();
	}
}

public class LadyTest {

	@Test
	public void ladyTest() {
		Cat cat = new Cat("catName", "blue");
		Lady ld = new Lady("lili", cat);
		ld.myAmEnjoy();
		Dog dog = new Dog("dogName", "Black");
		Lady ld1 = new Lady("lala", dog);
		ld1.myAmEnjoy();
	}
}
