package com.javalec.base;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
//		System.out.println(random.nextInt(10));
	
		for(int j=1; j<=6; j++){
			int i = random.nextInt(45);
			System.out.println(i+1);
		}
		
		
		
		
	
	}

}
