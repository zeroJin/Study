package com.study.oop.collection;

import java.util.HashMap;
import java.util.Map;

public class MapArgsWordsTest {

	private static final Integer ONE = new Integer(1);
	public static void main(String[] args) {
		String[] arr = {"aaa","bbb","ccc","aaa","bbb"};
		mapOut(arr);
	}
	public static void mapOut(String[] a){
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < a.length; i++) {
//			Integer freq = (Integer) m.get(a[i]);
//			int freq = (Integer) m.get(a[i]) == null ? 0 : (Integer) m.get(a[i]); // 因为对象传过来是null ，所以需要做判断重新赋值。
			if(!m.containsKey(a[i])){
				m.put(a[i], ONE);
			}else{
				int freq = m.get(a[i]);
				m.put(a[i], freq + 1);
			}
//			m.put(a[i], (freq == null ? ONE : new Integer(freq.intValue()) + 1));
		}
		System.out.println(m.size());
		System.out.println(m);
	}
}
