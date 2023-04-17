package com.javalec.base;

public class Main {

	public static void main(String[] args) {

		//String
//		String str1 = "a";
		
//		long startTime1 = System.currentTimeMillis();
//				
//		for(int i=1; i<=500000; i++) {
//			str1 = str1 + "a";
//		}
//		
//		long endtime1 = System.currentTimeMillis();
//		
//		System.out.println("Term1 :" + (endtime1-startTime1));
		
		//StringBuilder
		
		StringBuilder stringBuilder = new StringBuilder("a");
		
		long startTime1 = System.currentTimeMillis();
		
		for(int i=1; i<=500000; i++) {
			stringBuilder.append("a");
		}
		
		long endtime1 = System.currentTimeMillis();
		
		System.out.println("Term1 :" + (endtime1-startTime1));
		
		
		
		
	}

}
