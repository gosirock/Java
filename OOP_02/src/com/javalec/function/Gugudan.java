package com.javalec.function;

public class Gugudan {

	
	// --- Field
public int danSta;
public int danEnd;
public int resultNum = 0;
public String[] result = new String[(danEnd-danSta+1)*9];
	// --- Constructor
	
	public Gugudan() {
	}
	public Gugudan(int danSta, int danEnd) {
		super();
		this.danSta = danSta;
		this.danEnd = danEnd;
	
	}
	// --- Method
	
	public String[] dan() {
		for(int dan = danSta; dan <= danEnd; dan++) {
			for(int number = 1; number <= 9; number++) {
			result[resultNum] = dan + " X " + number + " = " + (dan * number);
			resultNum++;
		}
		}return result;
	}
	
	
	
}	