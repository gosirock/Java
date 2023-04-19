package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Exception 예외처리
		
		int i = 1;
		int j = 0;
		
		System.out.println("Add :" + (i+j));
		System.out.println("Sub :" + (i-j));
		System.out.println("Mul :" + (i*j));
		
		try {															// try 트라이해보고 
			System.out.println("Div :" + (i/j));
		
		}catch(Exception e) {											// catch 이상이있으면
			System.out.println("0으로 나누기는 불가 합니다.");
		}
		
		
		
	}

}
