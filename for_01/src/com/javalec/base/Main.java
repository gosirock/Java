package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 소스중심의 반복문 // 기능위주는 if
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

					// 범위의 합 Scanner사용 ///////////

//		int sum = 0;
//		int startNum = 0;
//		int endNum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자를 력하세요 : ");
//		startNum = scanner.nextInt();
//		System.out.println("두번째 숫자를 력하세요 : ");
//		endNum = scanner.nextInt();
//		
//		for(int i = startNum; i <= endNum; i++) {
//			sum += i;
//		
//		}
//		System.out.println(startNum + " ~ " + endNum + " 합계 = " + sum);

					// 1부터 100까지의 짝수의 합계 구하기 /////////

//		int evenSum = 0;
//		int oddSum = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				evenSum += i;
//
//			} else {
//				oddSum += i;
//
//			}
//		}
//		System.out.println("1부터 100까지의 짝수의 합은 " + evenSum + " 입니다.");
//		System.out.println("1부터 100까지의 홀수의 합은 " + oddSum + " 입니다.");

		
		
				// 1부터 100까지의 수중 3의배수이거나 5의배수인 합   내가한거...
	
//		int sum3 = 0;
//		int sum5 = 0;
//		int total = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if (i % 3 == 0) {
//				sum3 += i;
//			}else if(i % 5 == 0) {
//				sum5 += i;
//			}
//			total = sum3 + sum5;
//		}
//		System.out.println("1부터 100까지의 수중 3의배수이거나 5의배수인 합은 " + total + " 입니다.");
		
					// 강사님이 하신거
//		int sum = 0;
//			for(int i = 1; i <= 100; i++) {
//				if((i % 3 == 0) || (i % 5 == 0)) {
//						sum += i;
//					}
//				}
//		System.out.println("1부터 100까지의 수중 3의배수이거나 5의배수인 합은 " + sum	+ " 입니다.");
		
		
						// 범위의 합계
		/* case #1
		 * 첫번째 숫자를 입력하세요 : 1
		 * 두번째 숫자를 입력하세요 : 100
		 * 두수의 합계는 5050 입니다.
		 * 
		 * case #2
		 * 첫번째 숫자를 입력하세요 : 100
		 * 두번째 숫자를 입력하세요 : 1
		 * 두수의 합계는 5050 입니다.
		 * 
		 */
		
//		int sum = 0;
//		int startNum = 0;
//		int endNum = 0;
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자를 입력하세요 : ");
//		startNum = scanner.nextInt();
//		System.out.println("두번째 숫자를 입력하세요 : ");
//		endNum = scanner.nextInt();
//		
//		
//		if(startNum < endNum) {
//			for(int i = startNum; i <= endNum; i++) {
//				sum += i;
//		}
//		}else {
//			for(int i = startNum; i >= endNum; i--)
//				sum += i;
//		}
//		System.out.println("두 수의 합계는 " + sum + " 입니다.");
		
		
				// 홀수의 합계
				// 짝수의 합계
				// 합계의 평균
				// 홀수 합계의 평균
				// 짝수 합계의 평균
		
		// 선언
		int oddSum = 0;						// 홀수 합계
		int evenSum = 0;					// 짝수 합계
		Double totalAverage = 0.;			// 합계의 평균
		Double oddSumAverage = 0.;			// 홀수 합계의 평균
		Double evenSumAverage = 0.;			// 짝수 합계의 평균
		int startNum = 0;					// 범위 계산 첫번째 숫자
		int endNum = 0;						// 범위 계산 두번째 숫자
		int tempStart = 0;					// 입력받은 첫번째 숫자
		int tempEnd = 0;					// 입력받은 두번째 숫자
		int oddCount = 0;					// 홀수카운트
		int evenCount = 0;  				// 짝수 카운트
		int totalCount = 0; 				// 카운트 합계
		int sum = 0;						// 범위의 합계
		Scanner scanner = new Scanner(System.in);
		
		// 숫자 입력 받기
		System.out.println("첫번째 숫자를 입력하세요 : ");
		tempStart = scanner.nextInt();
		System.out.println("두번째 숫자를 입력하세요 : ");
		tempEnd = scanner.nextInt();
		
		// 시작 숫자와 끝숫자를 비교해서 작은수가 첫번째수로 큰수가 두번째수로 정리
		if(tempStart > tempEnd) {
			startNum = tempEnd;
			endNum = tempStart;
		}else {
			startNum = tempStart;
			endNum = tempEnd;
		}
		
		// 계산
		for(int i = startNum; i <= endNum; i++) {
		if(i % 2 == 1) {											// 홀수계산
			oddSum += i;											// 홀수합계
			oddCount ++;											// 홀수갯수
		}else{														// 짝수계산
			evenSum += i;											// 짝수합계
			evenCount ++;											// 짝수갯수
		}
		
		}
		// 평균 구하기
		// average = (double)sum / (endNum - startNum + 1);
		totalCount = oddCount + evenCount;							// 홀수와 짝수 갯수
		totalAverage = (double)(oddSum + evenSum) / totalCount ;	// 합계의 평균
		oddSumAverage =  (double)oddSum / oddCount;					// 홀수합계의 평균
		evenSumAverage = (double)evenSum / evenCount;				// 짝수합계의 평균
	
		// 출력
		System.out.println("홀수의 합계 : " + oddSum);
		System.out.println("짝수의 합계 : " + evenSum);
		System.out.println("합계의 평균 : " + totalAverage);
		System.out.println("홀수 합계의 평균 : " + oddSumAverage);
		System.out.println("짝수 합계의 평균 : " + evenSumAverage);

	}

}
