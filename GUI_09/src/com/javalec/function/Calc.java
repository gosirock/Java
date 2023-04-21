package com.javalec.function;

public class Calc {
	
	
	// Field
	int num1;
	int num2;
	String select;
	int result;
	
	
	// Constructor
	public Calc() {
		// TODO Auto-generated constructor stub
	}

	public Calc(int num1, int num2, String select) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.select = select;
	}





	// Method


	public int sum() {
		
		if(select == "전체") {
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
		}else if(select == "홀수") {
			if (num1 > num2) {
				for(int i = num2; i <= num1; i++) {
					if(i%2==1)
						result += i;
			}
		}else {
				for(int i = num1; i <= num2; i++) {
					if(i%2==1)
						result += i;
			}
			
			}
			return result;
		}
			else if(select =="짝수") {
				if (num1 > num2) {
					for(int i = num2; i <= num1; i++) {
						if(i%2==0)
							result += i;
					}
				}else {
					for(int i = num1; i <= num2; i++) {
						if(i%2==0)
							result += i;
				}
				}
				return result;
			}else {
				return result;
			}
		
	}
	


}
	
