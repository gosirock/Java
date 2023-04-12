package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 소스중심의 반복문  //	기능위주는 if
		// 소스에서 y = ax + b 에서 a와 b를 찾는것
		// 1에서 10까지를 출력
		// for문 안에 i = index 를 쓴다.
		// 전역변수를 쓰게되면 꼬인다....
		
		
//		for(int i = 1; i <= 10; i++) {   // 시작; 최종; 증감
//			System.out.println(i);
//		}

		// 구구단 출력할 부분의 규칙을 찾자
		// 2x1 = 2, 2x2 = 4, 2x3 = 6, 3x1 = 3
		
//		for(int i = 2; i <= 9; i += 2 ) {
//			System.out.println("2 x " + i + " = " + (i * 2));
//		}
		
		
		// 부터 10까지의 합계
		// 누적변수는 꼭 바깥에 선언
//		
//		int sum = 0;
//		
//		for(int i = 1; i <= 10; i++) {
//			sum += i;   //누적연산자 사용하면 편하다
		
		
//		}
//		System.out.println("1~10까지의 합계: " + sum);
		 
		// 범위의 합계 구하기 ////////
		
//		int sum = 0;
//		int startNum = 1;
//		int endNum = 10;
//		
//		
//		for(int i = startNum; i <= endNum; i++) {
//			sum += i;
//		
//		}
//		System.out.println(startNum + " ~ " + endNum + " 합계 = " + sum);
		
		
		// 범위의 합 Scanner사용	///////////
		
		int sum = 0;
		int startNum = 0;
		int endNum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 력하세요 : ");
		startNum = scanner.nextInt();
		System.out.println("두번째 숫자를 력하세요 : ");
		endNum = scanner.nextInt();
		
		for(int i = startNum; i <= endNum; i++) {
			sum += i;
		
		}
		System.out.println(startNum + " ~ " + endNum + " 합계 = " + sum);
		
		
	}

}
