package com.study.oop.httpRq.motif;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpRequest {

	/**
	 * Get request
	 * @author John
	 * @param url param
	 * */
	public static String setGet(String url, String param){
		String result = null;		//返回参数
		BufferedReader in = null;	//接收请求返回的数据
		HttpURLConnection httpconn = null;	//HTTP请求
		
		try {
			String urlNameString = url + "?" + param;
			
			//先创建一个URL连接
			URL realURL = new URL(urlNameString);
			
			//打开URL连接
			httpconn = (HttpURLConnection) realURL.openConnection();
			
			//使用GET方法去请求
			httpconn.setRequestMethod("GET");
			
			//定义返回的头数据
			Map<String, List<String>> map;
			
			//接收请求返回的头数据
			map = httpconn.getHeaderFields();
			
			//循环出返回头文件中的内容
			Set<String> set = map.keySet();
			for(String key : set){
				System.out.println(key + " " + map.get(key));
			}
			
			//接收返回的数据
			in = new BufferedReader(new InputStreamReader(httpconn.getInputStream()));
			
			//循环接收的数据
			String line;
			
			while((line = in.readLine()) != null){
				result += line;
			}
			
			return result;
		} catch (Exception e) {
			System.out.println("发送GEt 请求异常！！");
			e.printStackTrace();
		}
		finally{
			try {
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}
	
	/**
	 * Post request
	 * @author John
	 * @param url param
	 * */
	public static String sendPost(String url, String param){
		String result = null;
		BufferedReader in = null;
		PrintStream out = null;
		HttpURLConnection httpconn = null;
		try {
			//创建一个URL连接
			URL realURL = new URL(url);
			
			//打开连接，并且把返回值赋给httpconn
			httpconn = (HttpURLConnection)realURL.openConnection();
			
			//设置请求类型
			httpconn.setRequestMethod("POST");
			
			//设置setDoOutput为true，当请求为Post时必须设置为true
			httpconn.setDoOutput(true);
//			httpconn.setDoInput(true);
			
			//把链接写入到字符流中
			out = new PrintStream(httpconn.getOutputStream());
			
			//把加入参数的连接写入到请求中
			out.print(param);
			
			//刷新改流的缓冲
			out.flush();
			
			//获取返回的头文件内容
			Map<String, List<String>> map = httpconn.getHeaderFields();
			
			//遍历头文件内容并打印
			for(String key : map.keySet()){
				System.out.println(key + "--" + map.get(key));
			}
			
			//获取请求返回的内容
			in = new BufferedReader(new InputStreamReader(httpconn.getInputStream()));
			
			String line;
			while((line = in.readLine()) != null){
				result += line;
			}
			
		} catch (Exception e) {
			System.out.println("发送POST请求异常！！");
			e.printStackTrace();
		}
		
		finally {
			try {
				if(out != null){
					out.close();
				}
				if(in != null){
					in.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
