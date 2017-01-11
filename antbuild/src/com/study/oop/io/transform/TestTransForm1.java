package com.study.oop.io.transform;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestTransForm1 {

	public static void main(String[] args) {
		try {
			//创建一个outputStreamWriter对象
			OutputStreamWriter osw = 
					new OutputStreamWriter(
							new FileOutputStream("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\buffer\\outputStreamWriter.txt"));
			
			//把内容写入新创建的文件中
			osw.write("hello world!!");
			
			//获取当前的字符编码
			System.out.println(osw.getEncoding());
			osw.close();
			
			osw = new OutputStreamWriter(
					new FileOutputStream("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\buffer\\outputStreamWriter.txt", true), "ISO8859_1");

			//再次写入到文件中
			osw.write("hello world agen!!");
			
			//再次获取文件编码
			System.out.println(osw.getEncoding());
			osw.close();
			
			//创建inputsteamreader对象，读取刚才写入的文件
			InputStreamReader isr = 
					new InputStreamReader(
							new FileInputStream("E:\\Study\\MyGit\\Study\\antbuild\\src\\com\\study\\oop\\io\\buffer\\outputStreamWriter.txt"));
			int s;
			
			while((s = isr.read()) != -1){
				System.out.print((char)s + " ");
			}
			
			isr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
