package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] user = new int[5];																	// 고객숫자만큼 배열
		int selectNum = 0;																			// 메뉴 선택 번호
		int userNum = 0;																			// 고객번호
		int amount = 0;
		Boolean down = true; 
		
		while(down) {																				//반복~
			
		System.out.print("1.입금\n" + "2.출금\n" + "3.현황\n" + "4.종료\n" + "번호를 선택하세요 : ");
		selectNum = scanner.nextInt();																// 메뉴 선택번호 입력
		
		switch(selectNum) {							
		case 1:																						// 1.입금
			System.out.print("고객번호 : ");
			userNum = scanner.nextInt();
			System.out.print("금액 : ");
			user[userNum-1] += scanner.nextInt();
			System.out.println("입금 결과 : 고객번호 :" + userNum + " 잔액 : " + user[userNum-1]);
			break;
			
		case 2:																						// 2. 출금
			System.out.print("고객번호 : ");
			userNum = scanner.nextInt();
			System.out.print("금액 : ");
			amount = scanner.nextInt();
			if(user[userNum-1] >= amount) {																// 잔액확인 0 이하는 잔액부족
				user[userNum-1] -= amount;
				System.out.println("출금 결과 : 고객번호 :" + userNum + " 잔액 : " + user[userNum-1]);	
			}else
			System.out.println("잔액이 부족합니다");
			break;
			
		case 3:																						// 3. 현황
			System.out.println("\t\t고객명\t잔액");
			System.out.println("\t\t----\t---");
			for(int i=0; i < user.length; i++) {
				System.out.println("\t\t" + (i+1) + "\t" + user[i]);
			}
			break;
		case 4:																						// 4. 종료
			System.out.println(" >>>>> Thank you <<<<<");
			down = false;																			// 반복상태바꾸기
			break;
		}
		
		
		
		}
		
		
	}

}
