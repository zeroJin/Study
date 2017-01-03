package com.study.oop.game;

import org.junit.Test;

public class SimpleDotComTest {

	@Test
	public void simpleDotComTest(){
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		
		String userGuess = "4";
		String result = dot.checkYourself(userGuess);
		String testResult = "failed!";
		if(result.equals("hit")){
			testResult = "passed!";
		}
		System.out.println("testResult: " + testResult);
	}
	
//	@Test
	public void simpleDotComTestAll(){
		int numOfGuessese = 0;
		GameHelper helper = new GameHelper();
		
		SimpleDotCom theDotCom = new SimpleDotCom();
		int randomNum = (int) (Math.random() * 5);
		int[] locations = {randomNum, randomNum + 1, randomNum + 2};
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;
		while(isAlive == true){
			String guess = helper.getUserInput("enter a number: ");
			String result = theDotCom.checkYourself(guess);
			numOfGuessese ++;
			if(result.equals("kill")){
				isAlive = false;
				System.out.println("You took " + numOfGuessese + "guess ");
			}
		}
	}
}
