package com.study.oop.hfj;

abstract class Animal {
	private String name;
	
	public String getName(){
		return name;
	}
	
	public Animal(String theName){
		this.name = theName;
	}
}

class Hippo extends Animal {
	public Hippo(String name){
		super(name);
	}
}

public class TestConstructor {

	public static void main(String[] args) {
		Hippo h = new Hippo("Buffy");
		System.out.println(h.getName());
	}
}
