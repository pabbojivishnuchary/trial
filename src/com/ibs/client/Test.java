package com.ibs.client;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		BiFunction<String, Integer, Integer> bifunction = (designation,age)->{
			if (designation!=null&&age!=null) {
				if(designation.equalsIgnoreCase("manager") && age>30){
					return 120000;
				}
					else if(designation.equalsIgnoreCase("developer") && age>25){
						return 90000;	
				}
					else {
						return 0;
					}
				
			} else {
				return 0;
			}	
		};
		
		int salary = bifunction.apply("manager", 35);
		System.out.println(salary);
		
		salary = bifunction.apply("developer", 26);
		System.out.println(salary);
		
		Function<Integer, String> function2 = sal->{
			if(sal>80000){
				return "band-5";
			}
			else if (sal>50000){
				return "band-4";
			}	
		
		else {
			return "band-3";
	}
		};
		//Example of AndThen method
	String salaryband = bifunction.andThen(function2).apply("manager", 35);
	System.out.println(salaryband);
	
	
	String salaryband1 = bifunction.andThen(function2).apply("developer", 25);
	System.out.println(salaryband1);
		
	}
}
