package com.study.oop.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderTest {

	public static void main(String[] args) {
		int c = 0;
		FileReader fr = null;
		
		try {
			fr = new FileReader("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\FileReaderTest.java");
		} catch (FileNotFoundException e) {
			System.out.println("找不到读取的文件！！");
			System.exit(-1);
		}
		
		try {
			long num = 0;
			while((c = fr.read()) != -1){
				System.out.print((char)c);
			}
			fr.close();
			System.out.println();
			System.out.println("tote: " + num + "!");
		} catch (Exception e) {
			System.out.println("文件读取错误！！！");
			System.exit(-1);
		}
	}
}
