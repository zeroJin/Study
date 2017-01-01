package com.study.oop.abstractTest;

import org.junit.Test;

abstract class Animal {
	String name;
	
	Animal(String name){
		this.name = name;
	}
	
/*	public void enjoy() {
		System.out.println("Happy!");
	}
*/
	public abstract void enjoy(); //修改为抽象方法！
}

class Cat extends Animal {
	String eyesColor;
	
	Cat(String name, String eyesColor) {
		super(name);
		this.eyesColor = eyesColor;
	}
	public void enjoy() {
		System.out.println("Cat Happy ! ");
	}
}

class Dog extends Animal {
	String color;
	Dog(String name, String color){
		super(name);
		this.color = color;
	}
	
	public void enjoy(){
		System.out.println("Dog Happy ! ");
	}
}

class Lucy{
	String name;
	int age;
	Animal am;
	Lucy(String name, int age, Animal am){
		this.name = name;
		this.age = age;
		this.am = am;
	}
	public void myAmEnjoy(){
		am.enjoy();
	}
}
public class AbstractTest {

	@Test
	public void abstractTest(){
		Cat cat = new Cat("catName", "blue");
		Lucy lucy = new Lucy("lc1", 13, cat);
		lucy.myAmEnjoy();
	}
}
