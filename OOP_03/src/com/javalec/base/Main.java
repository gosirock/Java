package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Car car1 = new Car();
		
		car1.company = "기아자동차";
		
		System.out.println(car1.company);
		
		Car car2 = new Car();
		car2.company = "기아자동차";
		
		System.out.println(car2.company);
		
		System.out.println(car1 == car2);
		System.out.println(car1.company == car2.company);
	
		Car car3 = car1;
		System.out.println(car1 == car3);
		
	Scanner scanner = new Scanner(System.in);
	int num = 0;
	System.out.println("숫자내놔");
	num = scanner.nextInt();
	
	Car car = new Car(num);
	
	
	
	}

}
