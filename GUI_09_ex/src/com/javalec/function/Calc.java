package com.javalec.function;

public class Calc {
	int startNum;
	int endNum;
	String part;

	
	
	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public Calc(int num1, int num2, String part) {
		super();
		this.startNum = num1;
		this.endNum = num2;
		this.part = part;
	}






	public int action() {
		int result = 0;
		if(part.equals("all")) {
			result = calcAll();
		}else if(part.equals("Even")) {
			result = calcEven();
		}else {
			result = calcOdd();
		}
		return result;
	}

	private int calcAll() {
		int sum = 0;
		for(int i = startNum; i <=endNum; i++) {
			sum+=i;
		}
		return sum;
	}
	
	private int calcEven() {
		int sum = 0;
		for(int i = startNum; i <=endNum; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		return sum;
	}

	private int calcOdd() {
		int sum = 0;
		for(int i = startNum; i <=endNum; i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		return sum;
	}

}
	
