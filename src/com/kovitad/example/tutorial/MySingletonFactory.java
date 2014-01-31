package com.kovitad.example.tutorial;

public class MySingletonFactory {
	private static final MySingletonFactory instance = new MySingletonFactory();

	private MySingletonFactory() {
	}
	MySingletonFactory(String a) {
	}
	public static MySingletonFactory getInstance() {
		return instance;
	}
}