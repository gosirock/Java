package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * 실행화면)
		 * 점수를 입력하세요 : 89
		 * 
		 * 점수가 89 여서 B학점 입니다.
		 */
		
		// Declare
		Scanner scanner = new Scanner(System.in);
		int score = 0;		
		String messeage = "";
		
		// Input
		System.out.print("점수를 입력하세요 : ");
			score = scanner.nextInt();
		// Process
		if((score >= 101) || (score < 0)) {
			System.out.println("잘못된 정보 입니다.");
		}else { 
		if(score >= 90) {
			messeage = "A";
		}else if(score >= 80) {
			messeage = "B";
		}else if(score >= 70) {
			messeage = "C";
		}else if(score >= 60) {
			messeage = "D";
		}else {
			messeage = "F";
		}
		// Out put
		System.out.println("점수가 " + score + " 여서 " + messeage + "학점 입니다." );
		}
		
		
	}
}