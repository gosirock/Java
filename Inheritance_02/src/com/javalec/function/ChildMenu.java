package com.javalec.function;


public class ChildMenu extends ParentsMenu{

	
	// Constructor
	public ChildMenu() {
		// TODO Auto-generated constructor stub
	}
	
	// Method
	
	public void makeHotDoen() {
		System.out.println("얼큰된장국");
	}
	
	//OverLord  여러게만들기
	public void makeHotDoen(String str1) {
		System.out.println("얼큰된장국");
	}
	
	@Override	
	public void makeChung() {
		System.out.println("냄새 없는 청국장");
	}
	
	
	
}
