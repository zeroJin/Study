package com.study.oop.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GetMaxNum {

	public static void main(String[] args) {
		int [] array = {1,1,2,1,3,2,3,2,4};
		getMaxNum(array);
	}
	
	public static void getMaxNum(int[] arr){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])){
				int count = map.get(arr[i]);
				count ++;
				map.remove(arr[i]);
				map.put(arr[i], count);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		System.out.println(map);
		Set<Integer> set = map.keySet();
		//遍历map
//		for(Integer in : set){
//			System.out.println(in + " = " + map.get(in));
//		}
		
		//遍历map的key
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()){
//			System.out.println(it.next());55555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555555%%%% 
			int v ;
			v = map.get(it.next());
			System.out.println("++" + v);
		}
		//遍历map
		Iterator<Map.Entry<Integer, Integer>> it1 = map.entrySet().iterator();
		while(it1.hasNext()){
			Map.Entry<Integer, Integer> entry = it1.next();
			System.out.println("key:" + entry.getKey() + " " + "value:" + entry.getValue());
		}

		
	}
}
