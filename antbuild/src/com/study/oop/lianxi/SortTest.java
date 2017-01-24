package com.study.oop.lianxi;

import java.util.ArrayList;
import java.util.List;
/**
 * 需求：
 * 存在一串0和1的数字，以一个0带三个1的方式显示，并且打印下标。
 * 如：
 * 0
 * 1,1,1
 * 0
 * 1,1,1
 * 0
 * 1,
 * 
 * */
public class SortTest {

	public static void main(String[] args) {
		int[] i = {1,0,1,0,1,1,0,1,0,1,1};
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l11 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		List<Integer> l22 = new ArrayList<Integer>();
		for (int j = 0; j < i.length; j++) {
			if(i[j] == 0){
				l1.add(i[j]);
				l11.add(j);
			}else{
				l2.add(i[j]);
				l22.add(j);
			}
		}
		System.out.println(l1 + " " + l11);
		System.out.println(l2 + " " + l22);
		int pom = 0;
		if(l1.size() > 0){
			for (int j = 0; j < l1.size(); j++) {
				System.out.print(l1.get(j) + ":" + l11.get(j));
				System.out.println();
				if(l2.size() > 0){
					for (; pom < 3 * j + 3 && pom < l2.size(); pom ++) {
							System.out.print(l2.get(pom) + ":" + l22.get(pom) + ", ");
					}
				}
				System.out.println();
			}
		}
		System.out.println();
	}
}
