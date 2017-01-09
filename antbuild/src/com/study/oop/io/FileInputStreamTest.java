package com.study.oop.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		
		try {
			in = new FileInputStream("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\FileInputStreamTest.java");
		} catch (FileNotFoundException e) {
			System.out.println("找不到读取的文件");
			System.exit(-1);
		}
		
		try {
			long num = 0;
			
			while((b = in.read())!= -1){
				System.out.print((char)b);	
			}
			System.out.println();
			System.out.println("tote: " + num + "!");
		} catch (Exception e) {
			System.out.println("file read error!!");
			System.exit(-1);
		}
	}
}
