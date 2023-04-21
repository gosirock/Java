package com.javalec.function;

public class Sum {

	
	int num1;
	int num2;
	int result;
	
	public Sum() {
		// TODO Auto-generated constructor stub
	}


	public Sum(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	
	public int sum() {
		
		if (num1 > num2) {
			for(int i = num2; i <= num1; i++) {
				result += i;
			}
		}else {
			for(int i = num1; i <= num2; i++) {
				result += i;
			
		}
		
		}
		return result;
	
	}
	
}
