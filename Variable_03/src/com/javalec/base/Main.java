package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		// 묵시적 변환과 명시적 변환
		// 묵시적 변환  정수 -> 실수
		int i1 = 10;
		double d1 = i1;
		
		System.out.println("d1의 데이터는 " + d1 + "입니다.");
		
		// 실수 -> 정수 = 안됨  (int)로 일시적변환
		double d2 = 10.567;
		int i2 = (int)d2;
		
		System.out.println("i2의 데이터는 " + i2 + "입니다.");
		
		
		
	}

}
