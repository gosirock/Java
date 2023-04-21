package com.javalec.function;

public class Calc {

	
	
	// Field
	
	int num1 = 0;
	int num2 = 0;
	
	
	// Constructor
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}


	public Calc(int num1, int num2) {			// String 으로 받고
		super();
		this.num1 = num1;						// = Integer.parseInt(num1);
		this.num2 = num2;						// = Integer.parseInt(num2);
		
	}
	
	
	
	// Method
	
	public int add() {
		return num1 + num2;						// return Integer.toString(num1 + num2);
	}
	
	public int sub() {
		return num1 - num2;
	}
	
	public int mul() {
		return num1 * num2;
	}
	
	public double div() {
		return (double)num1 / num2;
	}
	/*
	 * public String div() {
	 * 	String result;
	 * 
	 * 	if(num2 == 0){
	 * 		result = "Impossible";
	 * }else{
	 * 		result = String.format("%.3f",(double)num1/num2);
	 * }
	 * return result
	 */
	
	
	
	
}
