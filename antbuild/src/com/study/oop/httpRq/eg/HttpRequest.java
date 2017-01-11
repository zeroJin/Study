package com.study.oop.httpRq.eg;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpRequest {

	//Get Request
	public static String sendGet(String URL, String param) {
		String result = null;
		BufferedReader in = null;
		try {
			String urlNameString = URL + "?" + param;
			
			//首先创建一个URL对象。
			URL realUrl = new URL(urlNameString);
			
			//打开URL之间的连接。
			URLConnection connection = realUrl.openConnection();
			
			//设置通用的请求属性。
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("use-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			
			//建立实际连接
			connection.connect();
			
			//获取返回信息
			Map<String, List<String>> map = connection.getHeaderFields();
			
			//遍历所有的响应头字段
			for(String key : map.keySet()){
				System.out.println(key + "-->" + map.get(key));
			}
			
			//定义BufferedReader输入流来读取URL的响应
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			
			String line;
			
			while((line = in.readLine()) != null){
				result += line;
			}
		} catch (Exception e) {
			System.out.println("发送Get请求出现异常！！！");
			e.printStackTrace();
		} 
		//使用finally块关闭输入流
		finally{
			try {
				if(in != null){
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	//POST Request
	public static String sendPost(String url, String param) {
		String result = null;
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			
			//创建一个URL对象。
			URL realUrl = new URL(url);
			
			//打开和URL之间的连接。
			URLConnection connection = realUrl.openConnection();
			
			//设置通用的请求属性
			connection.setRequestProperty("accept", "*/*");
			connection.setRequestProperty("connection", "Keep-Alive");
			connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			
			//发送POST请求必须设置如下两行
			connection.setDoOutput(true);
			connection.setDoInput(true);
			
			//获取URLconnection对象对应的输出流
			out = new PrintWriter(connection.getOutputStream());
			
			//发送请求参数
			out.print(param);
			
			//输出流的缓冲
			out.flush();
			
			//定义BufferedReader输入流来读取URL的响应。
			in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String line;
			
			while((line = in.readLine()) != null){
				return result += line;
			}
		} catch (Exception e) {
			System.out.println("发送POST请求出现异常！！！");
			e.printStackTrace();
		}
		
		//使用finally块来关闭输出流，输入流
		finally{
			try {
				if(out != null) {
					out.close();
				}
				if(in != null){
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * Test Map
	 * */
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("a", "aaa");
		map.put(null, "bbb");
		System.out.println(map);
		Set<String> s = map.keySet();
		for (String s1 : s) {
			System.out.println(s1 + " " + map.get(s1));
		}
	}
}
