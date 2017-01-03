package com.study.oop.collection;

import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		List l1 = new LinkedList();
		for (int i = 0; i <= 5; i++) {
			l1.add("a" + i);
		}
		System.out.println(l1);
		l1.add(3, "a100");
		System.out.println(l1);
		String aa = (String) l1.set(5, "a200");
		System.out.println(l1 + aa);
		System.out.println("get num 2:  " + l1.get(2));
		System.out.println("The a3 on: " + l1.indexOf("a3"));
		l1.remove(2);
		System.out.println(l1);
	}
}
