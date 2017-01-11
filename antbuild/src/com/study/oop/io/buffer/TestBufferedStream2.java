package com.study.oop.io.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestBufferedStream2 {

	public static void main(String[] args) {
		try {
			
			//创建一个bufferedWriter对象
			BufferedWriter bw = 
					new BufferedWriter(new FileWriter("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\buffer\\dat.txt"));
			
			//创建一个bufferedReadter对象
			BufferedReader br = 
					new BufferedReader(new FileReader("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\buffer\\dat.txt"));
			
			String s = null;
			
			//给bufferedWriter对象写入值
			for (int i = 0; i < 100; i++) {
				s = String.valueOf(Math.random());
				bw.write(s);
				bw.newLine();
			}
			
			//清空bufferedWriter
			bw.flush();
			
			//读取buffer额的Writer对象写入的数据
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			bw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
