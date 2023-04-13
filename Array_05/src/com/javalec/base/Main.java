package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		/*
		 * James의 신장을 입력하세요! 170
		 * Cathy의 신장을 입력하세요! 165
		 * Kenny의 신장을 입력하세요! 180
		 * Martin의 신장을 입력하세요! 190
		 * Crystal의 신장을 입력하세요! 165
		 * 평균신장은 : 174
		 * 가장 큰 학생은 Martin 이고 그 학생의 키는 190
		 * 가장 작은 학생의 Cathy 이고 그 학생의 키는 165
		 */
	
	// 선언
	Scanner scanner = new Scanner(System.in);	
	String str = "의 신장을 입력하세요! ";											// 단순문자열
	String[] name = {"James", "Cathy", "Kenny", "Martin", "Crystal"}; 			// 학생이름 배열
	String maxName = "";														// 가장큰 학생배열의 이름
	String minName = "";														// 가장작은 학생배열의 이름
	int[] height = new int[5];													// 키 배열
	int sum = 0;																// 키 합계
	double avg = 0;																// 평균
	int max = 0;																// 가장큰키 max
	int min = 1000;																// 가장작은키 min
	
	// 입력
	for(int i = 0; i < name.length; i++) {
		System.out.print(name[i] + str);										// 출력
			height[i] = scanner.nextInt();										// 입력값 키 배열에 넣기
			sum += height[i];													// 전체 키 합계 구하기
	}
	
	// 계산 // 위에포문에 이프 넣어도됨
	for(int i = 0; i < name.length; i++) {
		if(max < height[i]) {													// 가장 큰 학생키 분류하기
			max = height[i];													// 가장 큰 학생키 max 에 넣기
			maxName = name[i];													// 가장 큰 학생이름 maxName 에 넣기
		}
		if(min > height[i]) {													// 가장 작은 학생키 분류
			min = height[i];													// 가장 작은 학생키 min 에 넣기
			minName = name[i];													// 가장 작은 학생이름 minName 에 넣기
		}
	}
	
	avg = sum / name.length;													// 평균키 
	
	// 출력
	System.out.println("평균신장은 : " + avg);												// 평균신장 출력
	System.out.println("가장 큰 학생은 " + maxName + " 이고 그 학생의 키는 " + max);			// 가장큰키 출력
	System.out.println("가장 작은 학생은 " + minName + " 이고 그 학생의 키는 " + min);			// 가장작은애 출력
	
		
		
		
		
	}

}