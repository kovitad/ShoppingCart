package com.kovitad.services;

public class HelloWs {
	public String sayHello(String name) {
		if (name == null) {
			return "Hello";
		}

		return "Hello, " + name + "!";
	}
}
