package com.javalec.base;

import java.util.Scanner;
import com.javalec.fuction.AddField;
import com.javalec.fuction.Div;
import com.javalec.fuction.MultC;
import com.javalec.fuction.SubField;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Div div = new Div();						// 제일 아래 상속자 Div 호출
		Scanner scanner = new Scanner(System.in);
		int startNum ;	// 첫번째 숫자
		int endNum ;	// 두번째 숫자
		
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		startNum = scanner.nextInt();				// 첫번째 출력값받기
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		endNum = scanner.nextInt();					// 두번째 출력값받기
		
		System.out.println("-------method------");
		SubField subField = new SubField();
		System.out.println(div.add(startNum, endNum));		// 메소드 이용출력
		System.out.println(div.sub(startNum, endNum));
		System.out.println(div.mult(startNum, endNum));
		System.out.println(div.div(startNum, endNum));
		
		System.out.println("-----field-------");
		subField.num1 = 10;
		subField.num2 = 20;
		subField.addfield();							// 필드이용출력
		subField.subField();
		
		System.out.println("-------Constructor------");
		MultC multc = new MultC(30, 40);
		multc.addition();
		multc.subtraction();
		multc.Multplication();
	}

}
