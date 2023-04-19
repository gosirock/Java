package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.MathAll;
import com.javalec.function.MathArray;
import com.javalec.function.MathyaConst;
import com.javalec.function.MathyaField;
import com.javalec.function.MathyaMethod;
import com.javalec.function.Gugudan;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	MathyaMethod mathya = new MathyaMethod();
	Scanner scanner = new Scanner(System.in);
	
	int total;
	int sub;
	int startNum;
	int endNum;	
	int multi;
	int divi;
	
	// -------------------------------------------------------
	System.out.print("첫번째 숫자를 입력하세요 : ");
	startNum = scanner.nextInt();
	System.out.print("번째 숫자를 입력하세요 : ");
	endNum = scanner.nextInt();	
	// -------------------------------------------------------
	System.out.println("**** Method 활용 ****");
	total = mathya.sum(startNum, endNum);
	System.out.println(startNum + " + " + endNum + " = : " + total);
	
	sub = mathya.sub(startNum, endNum);	
	System.out.println(startNum + " - " + endNum + " = : " + sub);
		
	multi = mathya.multi(startNum, endNum);
	System.out.println(startNum + " x " + endNum + " = : " + multi);
		
	divi = mathya.divi(startNum, endNum);	
	System.out.println(startNum + " / " + endNum + " = : " + divi);
		
	// -------------------------------------------------------
		
	System.out.println("**** Field 활용 ****");
	MathyaField mathyaField = new MathyaField();
	mathyaField.startNum = startNum;
	mathyaField.endNum = endNum;
	total = mathyaField.sum();
	System.out.println(startNum + " + " + endNum + " = : " + total);
	sub = mathyaField.sub();
	System.out.println(startNum + " - " + endNum + " = : " + sub);
	multi = mathyaField.multi();
	System.out.println(startNum + " * " + endNum + " = : " + multi);
	divi = mathyaField.divi();
	System.out.println(startNum + " / " + endNum + " = : " + divi);
	
	// -------------------------------------------------------
	System.out.println("**** Constructor 활용 ****");
	MathyaConst mathyaConst = new MathyaConst(startNum, endNum);
	
	total = mathyaConst.sum();
	System.out.println(startNum + " + " + endNum + " = : " + total);
	sub = mathyaConst.sub();
	System.out.println(startNum + " - " + endNum + " = : " + sub);
	multi = mathyaConst.multi();
	System.out.println(startNum + " * " + endNum + " = : " + multi);
	divi = mathyaConst.divi();
	System.out.println(startNum + " / " + endNum + " = : " + divi);
		
	// -------------------------------------------------------
	MathAll mathAll = new MathAll(startNum, endNum);

	// -------------------------------------------------------
	String[] result;
	MathArray mathArray = new MathArray(startNum, endNum);	
	
	result = mathArray.calc();
	
	for(int i = 0; i < result.length; i++) {
		System.out.println(result[i]);
	}
	
	String[] gugu;
	Gugudan gugudan = new Gugudan(startNum, endNum);
	
	gugu = gugudan.dan();
	
	for(int i = 0; i < gugu.length; i++) {
		System.out.println(gugu[i]);
	}
	
	}

}
