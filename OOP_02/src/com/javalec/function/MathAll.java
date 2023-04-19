package com.javalec.function;

public class MathAll {
	

	
	
	
	
	// --- Field

private int startNum = 0;
private int endNum = 0;



	// --- Constructor

public MathAll() {
	// TODO Auto-generated constructor stub
}


public MathAll(int startNum, int endNum) {
	super();
	this.startNum = startNum;
	this.endNum = endNum;
	System.out.println(startNum+endNum);
	System.out.println(startNum-endNum);
	System.out.println(startNum*endNum);
	System.out.println(startNum/endNum);
	add();
	sub();
	mul();
	div();
}
	private void add() {					// void로 써있으면 리턴이 필요없다
		System.out.println("# 덧셈 : " + (startNum + endNum));
	}
	private void sub() {					// void로 써있으면 리턴이 필요없다
		System.out.println("# 덧셈 : " + (startNum - endNum));
	}private void mul() {					// void로 써있으면 리턴이 필요없다
		System.out.println("# 덧셈 : " + (startNum * endNum));
	}private void div() {					// void로 써있으면 리턴이 필요없다
		System.out.println("# 덧셈 : " + (String.format("%2.2f",(double)startNum / endNum)));
	}
	// --- Method


	





}
