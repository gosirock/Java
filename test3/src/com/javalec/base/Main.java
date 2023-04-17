package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		int inputNum = 0;
		int outputNum = 0;
		int data = 0;
		
		// 입력부분
		System.out.print("입력할 숫자의 갯수? :");
			inputNum = scanner.nextInt();
		
		int[] num = new int[inputNum];
			
		for(int i = 0; i < num.length; i++) {
			System.out.print(inputNum + "개의 숫자를 입력하세요!:");
			num[i] = scanner.nextInt();
		}
		
		
		//  검색부분
		
		System.out.print("검색할 숫자는? :");
		outputNum = scanner.nextInt();
		
		// 출력부분
			
		for(data = 0; data < num.length; data++) {
			if(num[data] == outputNum) {
				System.out.print(outputNum + "의 위치는 " + (data+1) + "번째 입니다.");
				break;
			}
		}
		// 찾지 못할 경우
		if(data == inputNum) {
			System.out.println(outputNum + "는 존재하지 않습니다.");
		}
		
		
		
	}

}
