package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * 실행화면) 
		 * 금액을 입력하세요! : 8000 
		 * 너무 비쌉니다.
		 * 
		 * 8000 이상은 너무비쌉니다. 5000~7999 조금비쌉니다. 3000~4999 적당한 금액 입니다. 0~2999 싼 편입니다.
		 */

		// Declare
		Scanner scanner = new Scanner(System.in);
		int money = 0; // 사용자 금액 입력
		String message = ""; // 출력값 멘트

		// Input
		System.out.print("금액을 입력하세요! : ");
		money = scanner.nextInt();

		// Process
		if (money >= 8000) {
			message = "너무 비쌉니다.";
		} else if (money >= 5000) {
			message = "조금 비쌉니다.";
		} else if (money >= 3000) {
			message = "적당한 금액 입니다.";
		} else if (money >= 0) {
			message = "싼 편입니다.";
		} else {
			message = "잘못된 금액 입니다.";
		}

		// Output
		System.out.println(message);
		
	}

}
