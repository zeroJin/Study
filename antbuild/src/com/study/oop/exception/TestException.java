package com.study.oop.exception;

import javax.security.sasl.SaslException;

public class TestException {

	public static void main(String[] args) {
		String test = "yes";
		try {
			System.out.println("Start try");
			doRisky(test);
			System.out.println("End try");
		} catch (SaslException e) {
			System.out.println("Sasl Exception");
		} finally {
			System.out.println("finally");
		}
		System.out.println("end of main");
	}
	
	static void doRisky(String test) throws SaslException {
		System.out.println("Start Risky!");
		if("yes".equals(test)){
			throw new SaslException();
		}
		System.out.println("end Risky!");
		return;
	}
}
