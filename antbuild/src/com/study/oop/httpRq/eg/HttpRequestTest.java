package com.study.oop.httpRq.eg;

import org.junit.Test;

public class HttpRequestTest {

	@Test
	public void requestT(){
		String get = HttpRequest.sendGet("http://192.168.0.230/product", "cmd=categorylist");
		String post = HttpRequest.sendPost("http://192.168.0.230/product", "cmd=categorylist");
		System.out.println(post);
	}
}
