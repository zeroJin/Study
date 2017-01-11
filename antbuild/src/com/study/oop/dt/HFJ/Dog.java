package com.study.oop.dt.HFJ;

public class Dog extends Feline {

	@Override
	public void makeNoise() {
		System.out.println("Dog makeNoise!!!");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog eat!!!");
	}
}
