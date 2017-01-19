package com.study.oop.httpRq.motif;

public class TestHttpRequest {

	public static void main(String[] args) {
		String get = HttpRequest.setGet("http://54.222.233.255/product", "cmd=categorylist");
		System.out.println(get);
		
		String post = HttpRequest.sendPost("http://54.222.233.255/product", "cmd=categorylist");
		System.out.println(post);
	}
}
