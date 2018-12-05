package com.ibs.client;

import java.util.function.BiFunction;

public class ClientTest {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer, String> bifunction = (num1,num2)->"Result is:"+(num1+num2);
		System.out.println(bifunction.apply(100, 200));
		System.out.println("Hello World");
	
	}

}
