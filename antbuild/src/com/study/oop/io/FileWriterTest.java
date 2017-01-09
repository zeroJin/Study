package com.study.oop.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		FileWriter fw = null;

		try {
			fw = new FileWriter("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\TestFileWriter.txt");
			for (int i = 0; i < 5000; i++) {
				fw.write(i);
			}
			fw.close();
			System.out.println("文件写入成功！！！");
		} catch (IOException e) {
			System.out.println("文件写入错误！！！");
			System.exit(-1);
		}
	}
}
