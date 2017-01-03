package com.study.oop.fenzhuang;

import org.junit.Test;

class GoodDog{
	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	void bark(){
		if(size > 60){
			System.out.println("Wooof! wooof!");
		}else if(size > 14){
			System.out.println("Ruff! Ruff!");
		}else{
			System.out.println("Yip! Yip!");
		}
	}
}

public class GoogDogTest {

	@Test
	public void goodDogTest(){
		GoodDog gd = new GoodDog();
		gd.setSize(61);
		GoodDog gd1 = new GoodDog();
		gd1.setSize(20);
		GoodDog gd2 = new GoodDog();
		gd2.setSize(10);
		System.out.println(gd.getSize());
		System.out.println(gd1.getSize());
		System.out.println(gd2.getSize());
		gd.bark();
		gd1.bark();
		gd2.bark();
	}
	@Test
	public void dogArray(){
		Dog[] pets = new Dog[7];
		pets[0] = new Dog();
		pets[0].setSize(22);
		int x = pets[0].getSize();
		pets[0].brak();
		System.out.println(x);
	}
}
