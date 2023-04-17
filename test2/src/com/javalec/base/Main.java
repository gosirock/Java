package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
//		int[] histo = new int[10];
		String[] histo = {"","","","","","","","","",""};						// 문자배열은 안에 내용이없으면 기본 null
		
		// 입력부분
		
//		System.out.println("Input score : ");
//		for(int i=0; i<histo.length; i++) {
//			System.out.print((i+1) + "의 score :");
//			histo[scanner.nextInt()/10]++;										// 입력값 /10 로나눠서 나눠진 넘버에 +1
//			
//		}
//		scanner.close();
//
//		// 출력부분
//		System.out.println("-------------- histogram --------------");
//		
//		for(int i =histo.length - 1; i>=0; i--) {								// 90부터 출력이니 랭스-1 부터 0까지
//			System.out.print(String.format("%3d : ", i*10));
//			for(int j =1; j<=histo[i]; j++) {									// histo[i] 만큼 출력
//				System.out.print("#");
//			}
//			System.out.println();
//		}
		// 입력부분
		
		System.out.println("Input score : ");
		for(int i=0; i<histo.length; i++) {
			System.out.print((i+1) + "의 score :");
			histo[scanner.nextInt()/10]+="#";										
		}
		scanner.close();
		
		// 출력부분
		
		System.out.println("-------------- histogram --------------");
		for(int i =histo.length - 1; i>=0; i--) {								
			System.out.print(String.format("%3d : ", i*10) + histo[i] + "\n");
		}
	
		
		
		
		
		
		
		
		
	}

}
