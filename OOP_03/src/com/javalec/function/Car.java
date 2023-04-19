package com.javalec.function;

public class Car {
	
	// Field
	
	public String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	int maxspeed = 350;
	int speed;
	int num = 0;
	public String[] result = new String[9];
	
	// Constructor
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(int num) {
		super();
		this.num = num;
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
	// Method
	
	public String[] dan() {
		for(int dan = num; dan <= num+1; dan++) {
			for(int i = 1; i <= 9; i++) {
				result[i-1] = num + " X " + i + " = " + (dan*i);
			}
		}return result;
		
		
	}
	

}
