package com.javalec.base;

import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 입력값 +3 단까지 출력하
//		int number = 0;
//		
//		System.out.print("Input you number : ");														// 번호입력받기
//		number = scanner.nextInt();
//		
//		
//		for(int num = 9; num >= 1; num --) {															// 뒷자리 반복문
//			for(int dan = number+3; dan >= number; dan --) {											// 단 반복문
//				if((num*dan) % 2 == 1) {
//					System.out.print(dan + " x " + num + " = " + String.format("%2s", "*") + "	");
//				}else
//				System.out.print(dan + " x " + num + " = " + String.format("%2s",num*dan) + "	");		// 자리수 정렬 및 계산
//			}System.out.println();																		// 띄우기
//	}	

// if문이 있으면 없으면 좋고 똑같은게 있으면 없애는게 좋고	
		
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 10의 10의0승 ~ 10의10승까지의 제곱승을 구하라. ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//	long j = 1;							// long 사용
//		
//	for(int i = 0; i <= 10; i++) {
//		System.out.println("10^" + String.format("%2s",i) + " = " + String.format("%13s",j));
//		j*=10;
//	}
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	double로 해도된다	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//	double j = 1.0;							
//	
//	for(int i = 0; i <= 10; i++) {
//		System.out.println("10^" + String.format("%02d",i) + " = " + String.format("%12.0f",j));
//		j*=10;
//	}

		
	/*
	 * *
	 * **
	 * ***
	 * ****
	 * ***
	 * **
	 * *
	 */
		
//	int num = 0;
//	System.out.print("Input your decimal no. : ");
//		num = scanner.nextInt();
//		
//		// 증가
//	for(int i = 1; i <= num; i++) {					//세로
//			
//		for(int j = 1; j <= i; j++ ) {				//가로
//			System.out.print("*");
//		}System.out.println();
//	}
//	
//		// 감소
//	for(int i = num-1; i >= 1; i--) {
//		for(int j = i; j >= 1; j-- ) {
//			System.out.print("*");
//		}System.out.println();
//	}
	
	
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 입력한 수의 factorial 구하기 (예 4! = 4x3x2x1) for로 구하기
		
//	int factorial = 0;														// 입력값
//	int total = 1;															// 합계
//		
//	System.out.print("Input your decimal no. : ");							// 입력값 받기
//		factorial = scanner.nextInt();
//	
//	for(int i=factorial; i>0; i--) {									// 입력값 에서 0보다 크면 -1
//		total *= i;															// 입력값 에서 1까지 받기
//	}
//	System.out.println(factorial + "'s factorial value = \t" + total);		// 출력
	

//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 입력한 수의 factorial 구하기 (예 4! = 4x3x2x1) while로 구하기
		
//	int factorial = 0;														// 입력값
//	int total = 1;															// 합계
//			
//	System.out.print("Input your decimal no. : ");							// 입력값 받기
//		factorial = scanner.nextInt();
//		
//	while(true) {															// while 반복
//		total *= factorial;													// 합계에 곱하기
//		factorial--;														// 팩토리얼 하나빼기
//			if(factorial == 1) {												// 팩토리얼이 1이면 멈춤
//				break;
//		}
//	}System.out.println(factorial + "'s factorial value = \t" + total);		// 출력
	
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 입력한 수의 factorial 구하기 (예 4! = 4x3x2x1) 홀수합만!	
//		int factorial = 0;														// 입력값
//		int total = 1;															// 합계
//			
//		System.out.print("Input your decimal no. : ");							// 입력값 받기
//			factorial = scanner.nextInt();
//		
//			
//		for(int i=factorial; i>0; i--) {										// 입력값 에서 0보다 크면 -1
//			if(i % 2 == 1) {
//			total *= i;		}													// 입력값 에서 1까지 받기
//		}
//		System.out.println(factorial + "'s factorial value = \t" + total);		// 출력
	
	
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 몇 단계의 피라미드로 구성할까 ?
//	int num = 0;																// 입력값
//	int pyramid = 1;															// 피라미드 숫자
//	
//	System.out.print("몇 단계의 피라미드로 구성할까 ? : ");								// 입력값 받기
//		num = scanner.nextInt();
//		
//	for(int i = 1; i <= num; i++) {												// 두번째 반복문 입력값만큼 띄우기
//		for(int j = 1; j <= i; j++) {											//  i 갯수 증감에 따른 출력
//			System.out.print(" " + String.format("%2d",pyramid++));				// 피라미드값 ++로 출력
//		}System.out.println();
//	}
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 몇개의 숫자를 더할까요?
//	int plus = 0;																// 전체 숫자 
//	int tot = 0;																// 숫자 합계
//	
//	System.out.print("몇개의 숫자를 더할까요 ? : ");									// plus개의 숫자받기
//		plus = scanner.nextInt();
//		
//	System.out.println(plus + "의 숫자를 입력하세요");
//	
//	for(int i = 0; i < plus; i++)	{											// plus번 만큼 반복
//		tot += scanner.nextInt();												// 입력값 더해서 tot에 넣기
//				
//	}
//	System.out.println("입력한 숫자의 합은 " + tot + " 입니다.");
	
		
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 입력값 결정 후 숫자 입력 하고 최대값과 최대값 위치 찾기 배열없이		
//	int num = 0;																					// 입력할 숫자 갯수
//	int input = 0;																					// 입력받은 숫자
//	int maxNum = 0;																					// 최대값
//	int count = 0;																					// 최대값위치
//	
//	System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");												// 입력할 숫자 범위 받기
//		num = scanner.nextInt();
//	if(num > 99 || num < 1) {																		// 100이상 0이하 입력시 반환
//		System.out.println("잘못된 숫자입니다.");
//	}else {
//		System.out.println(num + "개의 숫자를 입력하세요");												// 
//		for(int i = 1; i <= num; i++) {																// 입력받은 num 만큼 반복
//			input = scanner.nextInt();																// 입력값 input에 넣기
//			if(maxNum < input) {																	// maxNum 값보다 input 값이 크냐?
//				maxNum = input;																		// 크면 maxNum값에 input 값 넣기
//				count = i;																			// maxNUm 값보다 input 값이 클때 반복 횟수 count 넣기
//			}
//		}
//	System.out.println("입력한 숫자중 최대값은 " + maxNum + "이고 " + count + "번째 값 입니다.");
//	}
	
		
		
		
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 입력값 결정 후 숫자 입력 하고 최대값과 최대값 위치 찾기 배열사용
//		
//	int num = 0;																					// 입력할 숫자 갯수
//	int count = 0;																					// 최대값위치
//	int maxNum = 0;																					// 최대값
//	
//	System.out.print("입력할 숫자의 갯수 ? (100개 미만) : ");
//	num = scanner.nextInt();																		// num 입력할 숫자 받기
//	
//	int[] numArray = new int[num];																	// numArray 에 입력받은 num 만큼 배열생성 
//	
//		if(num > 99 || num < 1) {																	// 100이상 0이하 입력시 반환
//			System.out.println("잘못된 숫자입니다.");
//		}else {
//			System.out.println(num + "개의 숫자를 입력하세요");
//			for(int i = 0; i < num; i++) {																// 입력받은 num 만큼 반복	
//				numArray[i] = scanner.nextInt();														// 0부터 입력값 num까지 입력값 배열 에 넣기
//				if(maxNum < numArray[i]) {																// 최대값 보다 입력값이 크냐?
//					maxNum = numArray[i];																// 최대값 보다 입력값이 크면 maxNum에 넣기
//					count = i+1;																		// 해당 i순번 값 +1 해서 count에 넣기 0번부터 시작이니 +1 함
//				}
//			}System.out.println("입력한 숫자중 최대값은 " + maxNum + "이고 " + count + "번째 값 입니다.");
//		}
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 입력한 한 자릿수 정수의 합을 구하는 프로그램	
//		*****몫과 나머지!!!*********************************8
		
//	int tot = 0;
//	int num = 0;
//	
//	System.out.print("Enter an integer(0 ~ 9) : ");
//	num = scanner.nextInt();
//	
//	while(num != 0) {
//	tot += num % 10;
//	num = num / 10; 
//	}
//	System.out.println("Sum of digits = " + tot );
//	
//	System.out.println(123456 % 10);	
//	System.out.println(123456 / 10);	
		
		
//		학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가
		
	
//	int[] Korean = new int[4];
//	int[] English = new int[4];
//	int[] Mathematics = new int[4];
//	int[] tot = new int[4];
//	double[] avg = new double[4];
//	
//	System.out.println("Korean의 성적을 입력 : ");
//	for (int i = 0; i < Korean.length; i++) {
//		System.out.print("No"+ (i+1) + "의 성적은 :");
//		Korean[i] = scanner.nextInt();
//		tot[i] += Korean[i];
//	}
//	System.out.println("English의 성적을 입력 : ");
//	for (int i = 0; i < English.length; i++) {
//		System.out.print("No"+ (i+1) + "의 성적은 :");
//		English[i] = scanner.nextInt();
//		tot[i] += English[i];
//	}
//	System.out.println("Mathematics의 성적을 입력 : ");
//	for (int i = 0; i < Mathematics.length; i++) {
//		System.out.print("No"+ (i+1) + "의 성적은 :");
//		Mathematics[i] = scanner.nextInt();
//		tot[i] += Mathematics[i];
//		avg[i] += tot[i] / 3.0;
//	}
//	
//	// 출력
//	System.out.println("\tKorean\t\tEnglish\t\tMathematics\tTotal\t\tAverage");
//	
//	for(int i = 0; i < 4; i++) {
//		for(int k = i; k < i+1; k++) {
//			System.out.print("No" + (k+1) + "\t  " + Korean[k] + "\t\t  " + English[k] + "\t\t     " + Mathematics[k] + "\t\t  " + tot[k] + "\t\t " + avg[k]);
//		}System.out.println();
//	}
	
	
	
	
		
	}
}
