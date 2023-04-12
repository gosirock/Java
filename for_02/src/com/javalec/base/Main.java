package com.javalec.base;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

//		// 사용자가 입력한 숫자로 구구단을 구성.
//		
//		// 선언
//		Scanner scanner = new Scanner(System.in);
//		int dan = 0;
//		
//		// 입력받기
//		System.out.println("구구단 몇단 = ");
//			dan = scanner.nextInt();
//		
//		// 구구단계산 및 출력
//		for(int i = 1; i <= 9; i ++  ) {
//			System.out.println(dan + " X " + i + " = " + (dan*i));
//		}
		
		
		// 구구단 전체 출력
		
//		for(int dan = 2; dan <= 9; dan++) {
//			System.out.println("-----" + dan + "단 -----");
//				for(int num = 1; num <= 9; num ++) {
//					System.out.println(dan + " x " + num + " = " + (dan*num));
//			}
//		}
//		
		
		// 구구단 전체 출력중 곱해지는 수가 짝수인 경우에만 출력하기
//		for(int dan = 2; dan <= 9; dan++) {												// 구구단 첫번째숫자 반복문
//			System.out.println("-----" + dan + "단 -----");									// 꾸밈 단 출력
//			for(int num = 1; num <= 9; num ++) {											// 뒤에숫자 반복문
//				if(num % 2 == 0) {															// 짝수
//					System.out.println(dan + " x " + num + " = " + (dan*num));				// 구구단 출력
//				}
//			}	
//		}

		// 구구단 전체 출력중 짝수단과 곱해지는 수가 짝수인 경우에만 출력하
		
//		for(int dan = 2; dan <= 9; dan++) {												// 구구단 첫번째숫자 반복문
//			if(dan % 2 ==0) {																// 짝수 단만 출력
//				System.out.println("-----" + dan + "단 -----");								// 꾸밈 단 출력
//				for(int num = 1; num <= 9; num ++) {											// 뒤에숫자 반복문
//					if(num % 2 == 0) {															// 짝수 뒷수자만 출력
//						System.out.println(dan + " x " + num + " = " + (dan*num));				// 구구단 출력
//				}
//			}	
//		}
//	}
//		
//		// 구구단 전체 출력중 곱해지는 수가 홀수인 경우에는 곱해지는 수를 * 로 표시하기
//		
//		String star = "*";
//		
//		for(int dan = 2; dan <= 9; dan++) {													// 구구단 첫번째숫자 반복문
//				System.out.println("-----" + dan + "단 -----");									// 꾸밈 단 출력
//				for(int num = 1; num <= 9; num ++) {											// 뒤에숫자 반복문
//					if(num % 2 == 1) {															// 짝수 뒷수자만 출력
//						star.equals(num);														// 홀수를 star변수에 input
//							System.out.println(dan + " x " + star + " = " + (dan*num));			// 홀수 * 구구단 출력
//					}
//					else {
//						System.out.println(dan + " x " + num + " = " + (dan*num));				// 나머지 구구단출력
//					}
//				}
//			}
//		
//		
//		// 구구단 전체 출력중 곱해지는 수가 홀수인 경우에는 곱해지는 수를 * 로 표시하기 /////강사님
//		for(int dan = 2; dan <= 9; dan++) {
//			for(int num = 1; num <= 9; num ++) {
//				System.out.println(dan + " X " + (num % 2 == 0 ? num : "*") + " = " + (dan*num));
//			}
//		}
		
		
		// 구구단 옆으루 이중 for문
//		for(int dan = 1; dan <= 9; dan ++) {
//			for(int num = 2; num <= 9; num ++) {
//				System.out.print(num + " x " + dan + " = " + (dan*num) + "	");
//			}System.out.println();
//		}
		
		
//		 // 구구단  짝수 출력
//		for(int dan = 2; dan <= 9; dan+=2) {
//			System.out.println();
//			for(int num = 2; num <= 9; num ++) {
//				System.out.print(num + " x " + dan + " = " + (dan*num) + "	");
//			}
//			System.out.println();
//		}
		
		
		 // 구구단 홀수 별로 출력
		// String.format
//		for(int num = 1; num <= 9; num ++) {
//			for(int dan = 2; dan <= 9; dan ++) {
//				System.out.print(dan + " x " + (num % 2 == 1 ? "*" : num) + " = " + (String.format("%2s",num*dan) + "	"));      //String.format
//		}
//			System.out.println();
//		}
//		
		
		
		// 앞뒤가 둘다 홀수면 출력제한
		
		for(int num = 1; num <= 9; num ++) {
			for(int dan = 2; dan <= 9; dan ++) {
				if((num % 2 == 1) && (dan % 2 == 1)) {
					System.out.print("\t\t");
				}else
				System.out.print(dan + " x " + num + " = " + (num*dan) + "	"); 
		}
			System.out.println();
		}
		
		// 결과값이 짝수이면 출력제한
		
		for(int num = 1; num <= 9; num ++) {
			for(int dan = 2; dan <= 9; dan ++) {
				if(num*dan % 2 == 1) {
					System.out.print("\t\t");
				}else
				System.out.print(dan + " x " + num + " = " + (num*dan) + "	"); 
		}
			System.out.println();
		}
		
		 //결과값이 짝수이면 출력제한2
		
		for(int num = 1; num <= 9; num ++) {
			for(int dan = 2; dan <= 9; dan ++) {
				System.out.print((num*dan % 2 == 1 ? "\t\t" : dan + " x " + num + " = " + num*dan + "	")); 
		}
			System.out.println();
		}
		
		
		
		}
		
	}


	
