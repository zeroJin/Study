package com.study.oop.game;

import java.util.List;

public class SimpleDotCom {

	int[] locationCells;
//	private List<String> list;
	int numOfHits;
	
	void setLocationCells(int[] loc){
		this.locationCells = loc;
	}
	
	String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
//		使用数组实现的游戏逻辑
		for(int cell : locationCells){
			if(guess == cell){
				result = "hit!";
				numOfHits ++ ;
				break;
			}
		}
//		int index = list.indexOf(stringGuess);
//		if(index >= 0){
//			list.remove(index);
//			if(list.isEmpty()){
//				result = "kill";
//			}
//		}
		if(numOfHits == locationCells.length){
			return "kill!";
		}
		System.out.println("result: " + result);
		return result;
	}
}
