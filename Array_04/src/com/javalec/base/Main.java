package com.javalec.base;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		
//	Scanner scanner = new Scanner(System.in);
//	int[] num = new int[5];
//	int sum = 0;
//	
//	System.out.println("5개의 숫자를 입력하세요");
//	for(int i = 0; i < num.length ; i++) {
//		System.out.print(i+1 + "번 숫자: ");
//		num[i] = scanner.nextInt();
//		sum += num[i];
//	}
//	
//	System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//	System.out.println("입력하신 숫자는 다음과 같습니다.\n");
//	
//	for(int i=num.length-1; i>=0; i--) {								// num.length 는 5 배열 제일큰값은 4
//		System.out.println(i+1 + ") " + num[i]);						// 반대로나오
//	}
//	System.out.println("합계 :" + sum);
		
		
	// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 숫자의 갯수는 최대 100개 입니다. 몇개의 숫자를 입력 하시겠습니까? ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
	
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[100];
		int maxNum = 0;
		int sum = 0;
		
		
		System.out.println("숫자의 갯수는 최대 100개 입니다. 몇개의 숫자를 입력 하시겠습니까?");
			maxNum = scanner.nextInt();
		System.out.println(maxNum + "개의 숫자를 입력하세요");
		
		for(int i = 0; i < maxNum ; i++) {
			System.out.print(i+1 + "번 숫자: ");
			num[i] = scanner.nextInt();
			sum += num[i];
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("입력하신 숫자는 다음과 같습니다.\n");
		
		for(int i=maxNum; i>=1; i--) {								
			System.out.println(i + ") " + num[i-1]);				
		}
		System.out.println("합계 :" + sum);
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 몇개의 숫자를 입력하시겠습니까? ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 
//		Scanner scanner = new Scanner(System.in);
//		int sum = 0;
//		int scan = 0;
//		
//		System.out.println("몇개의 숫자를 입력 하시겠습니까?");
//		scan = scanner.nextInt();
//		int[] num = new int[scan];
//		
//		System.out.println(scan+ "개의 숫자를 입력하세요");
//		
//		for(int i = 0; i < num.length ; i++) {
//			System.out.print(i+1 + "번 숫자: ");
//			num[i] = scanner.nextInt();
//			sum += num[i];
//		}
//		
//		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		System.out.println("입력하신 숫자는 다음과 같습니다.\n");
//		
//		for(int i=scan; i>=1; i--) {								
//			System.out.println(i + ") " + num[i-1]);				
//		}
//		System.out.println("합계 :" + sum);
	}
}
