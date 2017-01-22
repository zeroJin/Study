package com.study.oop.thread;

import java.util.*;

public class TestInterrupt {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		mt.interrupt();
	}
}

class MyThread extends Thread {

	public void run(){
		int i = 1;
		while(true){
			System.out.println("======" + new Date() + "======" + " " + i ++);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}
