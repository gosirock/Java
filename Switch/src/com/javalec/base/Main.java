package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		
		int num1 = 10;
		
//		if(num1 % 2 == 0) {
//			System.out.println("Even");     //짝수
//		}else {
//			System.out.println("Odd");		//홀수
//		}
		
		switch(num1 % 2) {					// 스위치는 break 안하면 계속진행한다. 언제쓰느냐? if보다 깔끔하게할때...
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;
	
		}
		
		
		
		int num2 = 100;
		
		
		switch(num2 / 10) {
		case 10:										// break 안하면 밑으루
		case 9:
				System.out.println("A학점");
				break;
		case 8:
				System.out.println("B학점");
				break;
		case 7:
				System.out.println("C학점");
				break;
		case 6:
				System.out.println("D학점");
				break;
		default:											// default가 else 같은느낌
				System.out.println("F학점");
				break;


	
		
			
		}
	}
}
