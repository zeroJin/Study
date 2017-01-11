package com.study.oop.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutPutStream {

	public static void main(String[] args) {
		
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\FileInputStreamTest.java");
			out = new FileOutputStream("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\FileOutputStream.java");
			while((b = in.read()) != -1){
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("The file not found!!");
			System.exit(-1);
		} catch (IOException e) {
			System.out.println("The file copy error!!");
			System.exit(-1);
		}
		
		System.out.println("The file copyed!!");
	}
}
