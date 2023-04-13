package com.javalec.base;

public class Main {

	public static void main(String[] args) {

//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ 배열의 평균 구하기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		int sum = 0;
		int[] intNum = {1,5,8,12,200,1002};			//6개
		double avg = 0;
		
		for(int i = 0; i < intNum.length; i++) {
			sum += intNum[i];
			
		}
		avg = (double)sum / intNum.length ;
		
		System.out.println("배열의 평균값 = " + avg);
		
		
		
	}

}
