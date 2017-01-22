package com.study.oop.thread;

public class TestPriority {

	public static void main(String[] args) {
		Thread t1 = new Thread(new T1());
		Thread t2 = new Thread(new T2());
		Thread t3 = new Thread(new T3());
		Thread t4 = new Thread(new T4());
		Thread t5 = new Thread(new T5());
		
		//给T1设置比默认优先级在高3级
		t1.setPriority(Thread.NORM_PRIORITY + 3);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}

class T1 implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("=T1: " + i);
		}
	}
}

class T2 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("==T2: " + i);
		}
	}
}

class T3 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("===T3: " + i);
		}
	}
}

class T4 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("====T4: " + i);
		}
	}
}

class T5 implements Runnable{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("=====T5: " + i);
		}
	}
}