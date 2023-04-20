package com.javalec.function;

public class Sum {

	
	
	int num;
	int total;
	
	public Sum() {
		// TODO Auto-generated constructor stub
	}


	
	
	
	public Sum(int num) {
		super();
		this.num = num;
	}





	public int addsum() {
		
		while(num != 0) {
			total += num % 10;
			num = num / 10; 
			
			}
		
		return total;
	}
	
	
	
	
}
