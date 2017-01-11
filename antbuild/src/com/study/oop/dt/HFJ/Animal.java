package com.study.oop.dt.HFJ;

public class Animal {

	String picture;	//动物的JPEG图像名称
	String food;	//此动物所吃的食物，现在有：meat和grass
	String hunger;	//代表饥饿
	String boundaries;	//动物活动区域的长宽
	String location;	//动物在区域活动中的X与Y的坐标
	
	//动物发出的叫声
	public void makeNoise(){
		System.out.println("Animal makNoise!!!");
	}
	
	//动物遇到食物时的行为动作
	public void eat(){
		System.out.println("Animal eat!!!");
	}
	
	//睡眠的行为程序
	public void sleep(){
		System.out.println("Animal sleep!!!");
	}
	
	//不在进食或睡眠时的行为程序
	public void roam(){
		System.out.println("Animal roam!!!");
	}
}
