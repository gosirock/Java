package com.javalec.base;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
//		Scanner scanner = new Scanner(System.in);
//		
//		int inputNum = 0;			// 입력할 숫자의 갯수
//		int position = 0;			// 삽입 위치		
//		int insertNum = 0;			// 삽입 숫자
//		
//		// 입력부분
//		System.out.print("입력할 숫자의 갯수? :");
//		inputNum = scanner.nextInt();
//		
//		int[] num = new int[inputNum+1];
//		
//		System.out.println(inputNum + "개의 숫자를 입력하세요! :");
//		for(int i = 0; i < inputNum; i++) {
//			System.out.print((i+1) + "의 숫자!:");
//			num[i] = scanner.nextInt();
//		}
//		
//		
//		System.out.println("숫자를 삽입하고자 하는 위치는 ? :");
//			position = scanner.nextInt()-1;
//		System.out.println("삽입하고자 하는 수는 ? :");
//			insertNum = scanner.nextInt();
//		
//		
//		for(int i = inputNum-1; i>=position-1; i-- ) {
//			num[i+1] = num[i];
//		}
//		num[position - 1] = insertNum; 
//		
//		System.out.println("-------- 결과 ---------");	
//		
//		for(int i = 0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//			
//		
		
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 반대로 빼기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
Scanner scanner = new Scanner(System.in);
		
		int inputNum = 0;			// 입력할 숫자의 갯수
		int position = 0;			// 삽입 위치		
		
		// 입력부분
		System.out.print("입력할 숫자의 갯수? :");
		inputNum = scanner.nextInt();
		
		int[] num = new int[inputNum];
		
		System.out.println(inputNum + "개의 숫자를 입력하세요! :");
		for(int i = 0; i < inputNum; i++) {
			System.out.print((i+1) + "의 숫자!:");
			num[i] = scanner.nextInt();
		}
		
		
		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? :");
			position = scanner.nextInt();
		
		for(int i = position; i<inputNum; i++ ) {
			num[i-1] = num[i];
		}
		
		System.out.println("-------- 결과 ---------");	
		
		for(int i = 0; i<num.length-1; i++) {
			System.out.println(num[i]);
		}
		
		
		
		
		
		
		
	}
}
