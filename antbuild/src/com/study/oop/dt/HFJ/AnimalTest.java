package com.study.oop.dt.HFJ;

import org.junit.Test;

public class AnimalTest {

//	@Test
	public void testAnimal(){
		
		Wolf w = new Wolf();
		w.sleep();
		
		Animal[] am = new Animal[5];
		am[0] = new Dog();
		am[1] = new Cat();
		am[2] = new Wolf();
		am[3] = new Hippo();
		am[4] = new Lion();
		for (int i = 0; i < am.length; i++) {
			am[i].eat();
			am[i].roam();
		}
	}
	
	/**
	 * 多态实例
	 * 父类当作形数，子类当实参
	 * */
	public void vet(Animal a) {
		a.makeNoise();
	}
	@Test
	public void start(){
		AnimalTest amt = new AnimalTest();
		Dog d = new Dog();
		Hippo h = new Hippo();
		amt.vet(d);
		amt.vet(h);
	}
}