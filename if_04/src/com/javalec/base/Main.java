package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 실행화면)
		 * 국어 점수를 입력하세요 : 90
		 * 영어 점수를 입력하세요 : 80
		 * 수학 점수를 입력하세요 : 70
		 * 
		 * 평균점수 : 80
		 * 국어 점수는 평균보다 낮습니다.
		 * 영어 점수는 평균 입니다.
		 * 수학 점수는 평균보다 높습니다.
		 */
		
		// Declare
		// 스캐너 하나만 선언해도된다.
		Scanner language = new Scanner(System.in);
		Scanner english = new Scanner(System.in);
		Scanner math = new Scanner(System.in);
		
		int scLanguage = 0, scEnglish = 0, scMath = 0;
		
		String messeage0 = "", messeage1 = "", messeage2 = "";
		String hi = "보다 높습니다.";
		String same = "입니다.";
		String low = "보다 낮습니다.";
		
		// Input
		System.out.print("국어점수를 입력하세요. ");
			scLanguage = language.nextInt();
		System.out.print("영어점수를 입력하세요. ");
			scEnglish = english.nextInt();
		System.out.print("수학점수를 입력하세요. ");
			scMath = math.nextInt();
			
		
		//process
		//평균
		int average = (scLanguage + scEnglish + scMath) / 3;		  //평균은 Double로 받아야한다. 아니면 소숫점
		// 국어평균
		if(scLanguage > average) {
			messeage0 = hi;
		}else if(scLanguage == average){
			messeage0 = same;
		}else {
			messeage0 = low;
		}
		// 영어평균
		if(scEnglish > average) {
			messeage1 = hi;
		}else if(scEnglish == average){
			messeage1 = same;
		}else {
			messeage1 = low;
		}
		// 수학평균
		if(scMath > average) {
			messeage2 = hi;
		}else if(scMath == average){
			messeage2 = same;
		}else {
			messeage2 = low;
		}
		
		// Output
		System.out.println("평균점수 : " + average);
		System.out.println("국어점수는 평균" + messeage0);
		System.out.println("영어점수는 평균" + messeage1);
		System.out.println("수학점수는 평균" + messeage2);
				
		
	}
}
