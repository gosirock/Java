package com.jacalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
/*
 * 실행화면)
 *  *** BMI계산기 ***
 *  
 *  신장(cm)을 입력하세요 : 170
 *  몸무게(kg)을 입력하세요 : 70
 *  
 *  >> 계산 결과 귀하는 ___ 입니다.
 *  BMI 공식 = 몸무게(kg) / 신장(m) * 신장(m)
 */
		
		// Declare
	Scanner scanner = new Scanner(System.in);
	double height = 0, weight = 0, bmi = 0;
	String messeage = "";
	
		// Input
	System.out.println("*** BMI 계산기 ***");
	System.out.print("신장(cm)을 입력하세요 : ");
		height = scanner.nextDouble();         // height = scanner.nextDouble(); / 100   강사님 코딩
	if((height > 250) || (height < 10)) {
		System.out.println("잘못된 정보입니다.");
	}else {
		
	System.out.print("몸무게(kg)을 입력하세요 : ");
		weight = scanner.nextDouble();
	if((weight > 300) || (weight < 10) || (height < weight)) {
		System.out.println("잘못된 정보입니다.");
	}else {
		// Process
		
	bmi = weight / (height * 0.01 * 2);
	
	if (bmi >= 30) {
		messeage = "고도비만";
	}else if(bmi >= 25) {
		messeage = "비만";
	}else if(bmi >= 23) {
		messeage = "과체중";
	}else if(bmi >= 18.5) {
		messeage = "정상체중";
	}else {
		messeage = "저체중";
	}
		// Output
	System.out.println("\n>> 계산 결과 귀하는 " + messeage + " 입니다." );
	
	}
	}
	}
	}


