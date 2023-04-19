package com.javalec.base;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<>();
		int input;			// 입력숫자 갯수
		int inputNum;		// 입력 받은 숫자
		int DelNum;			// 삭제 숫자
		
		System.out.print("입력할 숫자의 갯수? : ");
		input = scanner.nextInt();
		
		for(int i=0; i<input; i++) {
			System.out.print((i+1) + "의 숫자 :");
			inputNum = scanner.nextInt();
			arrayList.add(inputNum);
		}
			
		System.out.print("몇번째의 숫자를 삭제 하시겠습니까? : ");	
		DelNum = scanner.nextInt();
		arrayList.remove(DelNum-1);
		scanner.close();		
			
		System.out.println("---결과---");
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
			
		}
	}

}
