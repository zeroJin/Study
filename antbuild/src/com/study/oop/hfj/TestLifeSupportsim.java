package com.study.oop.hfj;

import java.util.ArrayList;

class V2Radiator {
	V2Radiator(ArrayList<SimUnit> list){
		for(int x = 0; x < 5; x ++){
			list.add(new SimUnit("V2Radiator"));
		}
		System.out.println("V2Radiator" + list);
	}
}

class V3Radiator extends V2Radiator {
	V3Radiator(ArrayList<SimUnit> lglist){
		super(lglist);
		for (int i = 0; i < 10; i++) {
			lglist.add(new SimUnit("V3Radiator"));
		}
		System.out.println("V3Radiator" + lglist);
		
	}
}

class RetentionBot {
	RetentionBot(ArrayList<SimUnit> rlist){
		rlist.add(new SimUnit("Retention"));
		System.out.println("RetentionBot" + rlist);
	}
}

public class TestLifeSupportsim {

	public static void main(String[] args) {
		ArrayList<SimUnit> aList = new ArrayList<SimUnit>();
		V2Radiator v2 = new V2Radiator(aList);
		
		System.out.println(aList.size());
		
		V3Radiator v3 = new V3Radiator(aList);
		System.out.println(aList.size());
		
		for (int i = 0; i < 20; i++) {
			RetentionBot ret = new RetentionBot(aList);
		}
		System.out.println(aList.size());
		
		//打印随机数
		for (int i = 0; i < 10; i++) {
			System.out.print(Math.random() + " ");
			System.out.println();
			System.out.print((int)(Math.random() * 100) + " ");
			System.out.println();
		}
		
		Integer i = 12;
		int j = 0;
		j = i;
		System.out.println(i);
		System.out.println(j);
	}
}

class SimUnit {
	
	String botType;
	
	SimUnit(String type){
		botType = type;
	}
	
	int powerUse(){
		if("Retention".equals(botType)){
			return 2;
		}else{
			return 4;
		}
	}
	
	public String toString(){
		
		return "This!";
	}
}
