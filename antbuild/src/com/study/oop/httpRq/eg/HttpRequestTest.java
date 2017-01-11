package com.study.oop.httpRq.eg;

import org.junit.Test;

public class HttpRequestTest {

	@Test
	public void requestT(){
		String get = HttpRequest.sendGet("http://54.222.233.255/product", "cmd=categorylist");
		String post = HttpRequest.sendPost("http://54.222.233.255/product", "cmd=categorylist");
		
		System.out.println(get);
		
		System.out.println("==============");
		System.out.println(post);
	}
}
