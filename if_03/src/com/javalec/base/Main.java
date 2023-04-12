package com.javalec.base;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 실행화면)
		 * 숫자를 입력하세요 : 2
		 * 입력하신 숫자는 2(은)는 짝수 입니다.
		 */
		// 변수는 메모리이기때문에 중복된 글자는 없앤다.
		
		// Declare	
		Scanner sanner = new Scanner(System.in);
		int num1 = 0;
		String message = "";
		
		// Input
		System.out.print("숫자를 입력하세요 : ");
		num1 = sanner.nextInt();
				
		// Process
		if(num1 % 2 == 0) {
			message = "짝수";
		}else {
			message = "홀수";
		}
		
		// Output
		System.out.println("입력하신 숫자 " + num1 + "(은)는 " + message + " 입니다.");
		
	}	

}
