package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ구구단 출력하기ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		int[] dan = {5,3,9,7,8};
//		
//		for(int num = 1; num <= 9; num ++) {
//			for(int i = 0; i < dan.length; i ++) {
//				System.out.print(dan[i] + " x " + num + " = " + (dan[i]*num) + "	");
//			}System.out.println();
//		}
		
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 배열의 종류ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		String[] str = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int[] intNum = {10,20,30};
		double[] doubleNum = {1.1, 1.2};
		boolean[] boolNum = {true, false, true, true};
		
		int sum = 0;
		double avgSum = 0;
		double avg = 0;
		int boolSum = 0;
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ str 전체 출력해보기ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "	");										// str 하나씩 출력
		}System.out.println();
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ intNum의 합계 구하기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for(int i = 0; i < intNum.length; i++) {
			sum += intNum[i];													// sum에 하나씩 넣기
		}
		System.out.println( "intNum의 합계 = " + sum);
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ doubleNum의 평균 구하기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for(int i = 0; i < doubleNum.length; i++) {
			avgSum += doubleNum[i];												// avgsum에 하나씩 넣기
		}
		double doubleAvg = avgSum/doubleNum.length;								// 평균 구하기
		System.out.println("doubleNum의 평균 = " + doubleAvg);					
		
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ boolNum중 true의 갯수 출력하기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for(int i = 0; i < boolNum.length; i++) {
			if(boolNum[i] == true) {											// true 갯수 만 받기
				boolSum++;
			}
		}
		System.out.println("boolNum중 true의 갯수 = " + boolSum);
		
		
		
	}

}
