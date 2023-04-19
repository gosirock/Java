package com.javalec.base;

import java.util.HashMap;

public class Main {

		public static void main(String[] args) {
			
		// Map, Dictionary : Key와 Value 구성  // index 번호가 없다 // 메모리가 ArrayList의 두배정도
		
		HashMap<String, String> hashMap = new HashMap<>();			// <Key(index) 도 String, Value(데이터) 도 String>
		
		hashMap.put("Apple", "사과");
		hashMap.put("Banan", "바나나");
		
		System.out.println(hashMap);
		System.out.println(hashMap.get("Apple"));					// key : apple 의 Value 사과 출력
		
		hashMap.remove("Apple");									// remove 삭제
		System.out.println(hashMap);
		
		}
		
}
