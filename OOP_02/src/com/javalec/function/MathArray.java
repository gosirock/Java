package com.javalec.function;

public class MathArray {

	private int startNum = 0;
	private int endNum = 0;
	
	private String[] result = new String[4];
	
	public MathArray() {
	}

	public MathArray(int startNum, int endNum) {
		super();
		this.startNum = startNum;
		this.endNum = endNum;
	}
	
	public String[] calc() {
		
		result[0] = Integer.toString(startNum + endNum);
		result[1] = Integer.toString(startNum - endNum);
		result[2] = Integer.toString(startNum * endNum);
		result[3] = String.format("%2.2f",(double)startNum / endNum);
		
		return result;
	}
	
	
	
	
}
