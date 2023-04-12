package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		// 연산자  + - * /
		int i = 10;
		int j = 2;
		int k = 5;
		
		// 자동 증감 연산자
		i = i + 1;
		i += 1;
		i++;     // 1씩 증가
		System.out.println("증가 : " + i);
		
		i = i - 1;
		i -= 1;
		i--;    // 1씩 감소
		System.out.println("감 : " + i);
		
		// 동등 비교 관계 연산자       범주형변수에 많이 사용
		System.out.println(i == j);     // 두개의값이 같냐?          출력값 true , false
		System.out.println(i != j);     // 두개의값이 다른값이냐?
		System.out.println(i > j);
		System.out.println(i < j);
		System.out.println(i >= j);
		System.out.println(i <= j);
		
		// 논리 연산자  and(&&) , or(||) 
		System.out.println((i > j) && (j > k) );    // And 둘다 true 여야 true
		System.out.println((i > j) || (j > k) );    // or 둘다 false 여야 false 하나라도 맞으면 true
		
		// 삼항 연산자   == ? : 3개있어서 삼항 연산자라고 함 간단한비교
		System.out.println(k == 5 ? "OK" : "None");  // true 면 ?물음표뒤 아니면 : 뒤 출력
		System.out.println(i > 100 ? "OK" : "None");
		
		/* 
		 7이 3의 배수인지 판단하는 문장을 작성하시오..
		 출력물)
		 7이 3의 배수인가? 3의배수 아님
		*/
		
		// 내가한거
		System.out.println("7이 3의 배수인가?");
		System.out.println(7 % 3 == 0 ? "3의 배수임" : "3의 배수 아님");
		
		// 정답 데이터 타입도 확인...
		String decision = (7 % 3 == 0 ? "3의 배수" : "3의 배수 아님");
		System.out.println("7이 3의 배수인가?\n"  + decision);
	}

}
