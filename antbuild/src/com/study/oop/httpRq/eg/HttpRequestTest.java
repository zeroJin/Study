package com.study.oop.httpRq.eg;

import org.junit.Test;

public class HttpRequestTest {

	@Test
	public void requestT(){
		String get = HttpRequest.sendGet("http://54.222.233.255/product", "cmd=categorylist");
//		String getBaidu = HttpRequest.sendGet("http://www.baidu.com", "kw=categorylist");
		String post = HttpRequest.sendPost("http://54.222.233.255/product", "cmd=categorylist");
		/**
		 * 快递接口
		 * http://www.kuaidi100.com/query?type=快递公司代号&postid=快递单号
		 * ps:快递公司编码:申通="shentong" EMS="ems" 顺丰="shunfeng" 圆通="yuantong" 中通="zhongtong" 韵达="yunda" 天天="tiantian" 汇通="huitongkuaidi" 全峰="quanfengkuaidi" 德邦="debangwuliu" 宅急送="zhaijisong"
		 * */
		String getKd = HttpRequest.sendPost(
				"http://www.kuaidi100.com/query", "type=shentong&postid=111111");
		
		/**
		 * 手机号
		 * http://tcc.taobao.com/cc/json/mobile_tel_segment.htm?tel=手机号
		 * */
		String Phon = HttpRequest.sendPost("http://tcc.taobao.com/cc/json/mobile_tel_segment.htm", "tel=13011125549");
		
		System.out.println(Phon);
		System.out.println("==============");
		System.out.println(getKd);
		System.out.println("==============");
		System.out.println(get);
		System.out.println("==============");
		System.out.println(post);
	}
}
