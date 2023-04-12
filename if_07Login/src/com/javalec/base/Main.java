package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String id = "";    // ID
		String passwd = "";    // PassWord
		
		
		System.out.println("** Log In Check **");
		
		System.out.print("User ID : ");
		id = scanner.next();    // next로 받는건 문자다.
		
		System.out.print("Password : ");
		passwd = scanner.next();
		
		if(id.equals("root") && passwd.equals("1234")) {				//문자는 비교는 == 못쓴다  .equals 사용
			System.out.println("환영합니다.");
		}else {
			System.out.println("등록된 사용자가 아닙니다.");
		}
		
	}

}
