package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List Type Collection
		// ArrayList 
		// < > Generic 제너릭이라고 한다
		// ArrayList<종류>
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("str1");							// .add 배열에 추가
		arrayList.add("str2");				
		arrayList.add("str3");				
		arrayList.add("str4");				
		
		System.out.println(arrayList);
		System.out.println(arrayList.size());			// .size배열의 길이
		
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));		// .get ()몇번째껄 가져오겠다
		}
		
		arrayList.set(1, "str22");						// .set 수정 ()번째 , "str22"로 변경
		System.out.println(arrayList);
		
		arrayList.remove(1);							// .remove ()번째 삭제
		System.out.println(arrayList);
		
		arrayList.add(0, "AAA");						// .add ()번째, "" 삽입
		System.out.println(arrayList);
		
		arrayList.clear();								// .clear 전체삭제
		System.out.println(arrayList);
		
	}

}
