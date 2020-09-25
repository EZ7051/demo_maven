package com.demo;

public class RestApi {
	public String getData() {
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {}
		
		return "Hello";
	}
}
