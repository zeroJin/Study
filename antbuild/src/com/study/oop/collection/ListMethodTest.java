package com.study.oop.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListMethodTest {

	public static void main(String[] args) {
		List<String> l1 = new LinkedList<String>();
		
		for (int i = 0; i <= 9; i++) {
			l1.add("a" + i);
		}
		System.out.println(l1);
		Collections.shuffle(l1);	//随机排序
		System.out.println(l1);
		Collections.reverse(l1);	//逆序排序
		System.out.println(l1);
		Collections.sort(l1);	//排序
		System.out.println(l1);
		System.out.println(Collections.binarySearch(l1, "a4"));
	}
}
