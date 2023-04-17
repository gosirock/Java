package com.javalec.base;


public class Main {

	public static void main(String[] args) {

		String str1 = new String("abc");									// String 메모리과소비로 나온 빌더
		StringBuilder stringBuilder = new StringBuilder("abcdefg");			// stringBuilder = 할당안해줘도 들어감.
		stringBuilder.append("hijklmn");									// .append 붙이기
		System.out.println(stringBuilder);
		
		stringBuilder.insert(3, "zzz");										// .insert 삽입
		System.out.println(stringBuilder);
		
		stringBuilder.delete(3, 6);											// .delete 3번부터~ 6번까지 삭제
		System.out.println(stringBuilder);
		
	}

}
