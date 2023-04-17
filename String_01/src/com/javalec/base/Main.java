package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);				// 스캐너의 클라스의 API를 쓰는것 .
//		scanner.												// .뒤에 나오는건 method
		String str0 = new String("가나다라마바사");					// 원래는 new 해줘야한다
		String str1 = "abcdefg";								// 스트링 많이써서 연산하면 메모리 과소비 한다
		String str2 = "HIJKLMN";
		String str3 = "   abc   ";
		
		System.out.println(str1.concat(str2));					// .concat은 문자열 연결
		System.out.println(str1.substring(3));					// 뒤 0123 가지고옴 문자열 자르기
		System.out.println(str0.substring(3, 5));				// 문자 선택출력
		System.out.println(str0.length());						// 문자열 안에는 각Char가 들어있어서 문자열 길이 측정
		System.out.println(str1.toUpperCase());					// 대문자로 변환 
		System.out.println(str1.toUpperCase().concat(str2));	// 대문자 변환 및 연결출력				
		System.out.println(str2.toLowerCase());					// 소문자로 변환
		
		System.out.println(str1.charAt(0));						// 문자열 배열 ?번째 숫자출력
		System.out.println(str1.indexOf('a'));					// 해당문자가 몇번째 있냐
		System.out.println(str1.equals(str2));					// 두문자 같냐
		
		System.out.println(str3);
		System.out.println(str3.trim());						// 스페이스바 제거 사용자가 입력하는부분에 꼭 써줘야해요
		System.out.println(str1.replace('a', 'z'));				// 한글자 바꾸기
		System.out.println(str1.replaceAll("abc", "zzzzzzz"));	// 여러글자 바꾸기
		
		// 010-1212-3434 -> 010-****-****
		String str4 = "010-1212-3434";
		System.out.println(str4.replaceAll("1212-3434", "****-****"));
		System.out.println(str4.replaceAll(str4.substring(4), "****-****"));			// 데이터는 계속 바뀐다... 
		System.out.println(str4.substring(0, 4).concat("****-****"));					// 붙여서 사용
	
		
		
		
		
		
	}

}
