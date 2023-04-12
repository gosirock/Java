package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		
		// Data출력 //출력되는건 전부 문자다
		System.out.println("1234");
		System.out.println(1234);
		System.out.println(10 + 20);
		System.out.println("10 + 20");
		
		//괄호안 + 는 계산하는 + // 괄호밖 + 는 연결
		
		System.out.println("10 + 20 = " + 10 + 20);
		System.out.println("10 + 20 = " + (10 + 20));
		System.out.println("10 - 20 = " + (10 - 20));
		System.out.println("10 * 20 = " + (10 * 20));
		System.out.println("10 / 20 = " + (10 / 20));
		
		System.out.println("10 / 20 = " + (10.0 / 20));  // 둘중에 하나가 실수여야 .몇 나온
		System.out.println("10 / 20 = " + ((double)10 / 20));  // 둘중 하나 double
		System.out.println("10 % 20 = " + (10 % 20)); // 나머지 값 %
		
		// 변수
		int num1 = 10;	//정수형변수   String 만 자바에서 대문자이다.
		num1 = 100;
		
		int num2 = 200;
		
		// 변수 num1과 num2의 덧셈을 출력하기
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		
		
		
		
	}

}
