package com.study.oop.io.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class TestBufferedStream1 {
	
	public static void main(String[] args) {
		try {
			FileInputStream fis = 
					new FileInputStream("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\buffer\\TestBufferedStream1.java");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int c = 0;
			
			System.out.println(bis.read());
			System.out.println(bis.read());

			bis.mark(1);
			
			for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
				System.out.print((char)c + " ");
			}
			System.out.println();
			
			bis.reset();
			for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
				System.out.print((char)c + " ");
			}
			
			bis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
