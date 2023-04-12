package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Condition
		// 커맨드 + 시프트 + f = 자동정리
		int i = 0, j = 0, k = 0;

		// 사용자에게 입력값 받기 Scanner 대문자로 시작하는 변수는 new를 써야한다.
		// class는 복제해 가져와 쓴다. 인스턴스
//		String str1 = new String("ABC") 	// 원래는 이렇게씀, 생략해서 String str1 = "abc"
		Scanner scanner = new Scanner(System.in);

		System.out.print("i의 값을 입력해 주세요! : ");
		i = scanner.nextInt();

		System.out.print("j의 값을 입력해 주세요! : ");
		j = scanner.nextInt();

		System.out.print("k의 값을 입력해 주세요! : ");
		k = scanner.nextInt();

		// if(조건) true면 -> {}
		// 이어지는(관련된) 조건이면 {}에 같이 다른조건이면 따로
		if (j > i) {
			System.out.println("j가 i보다 큽니다.");
		} else if (j < i) {
			System.out.println("j가 i보다 작습니다.");
		} else {
			System.out.println("j와 i는 같습니다.");
		}

		if (i == k) {
			System.out.println("i와 k가 같습니다.");
		} else if (i > k) {
			System.out.println("i가 k보다 큽니다.");
		} else {
			System.out.println("i가 k보다 작습니다.");
		}

		System.out.println("--- End ---");
	}

}