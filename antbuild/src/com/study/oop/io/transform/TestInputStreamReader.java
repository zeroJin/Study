package com.study.oop.io.transform;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestInputStreamReader {

	public static void main(String[] args) {
		//创建一个inputStreamReader对象
		InputStreamReader isr = 
				new InputStreamReader(System.in);
		
		//创建一个bufferedreader对象，包含isr
		BufferedReader bf = new BufferedReader(isr);
		
		String s = null;
		
		try {
			s = bf.readLine();
			while(s != null){
				if(s.equalsIgnoreCase("exit")){
					break;
				}
				System.out.println(s.toUpperCase());
				
				s = bf.readLine();
			}
			
			bf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
