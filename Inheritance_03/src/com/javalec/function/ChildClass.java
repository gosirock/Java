package com.javalec.function;

public class ChildClass extends ParentsClass{

	
	
	// Constructor
	
	public ChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("Child Class");
		this.method();										// this는 지금 class에 있는 값 Class 호출시 메소드도 실행시키기
		super.method();										// 상위클라스의 값의 메소드
		
	}
	
	// Method
	
	@Override
	public void method() {
		System.out.println("Child Method");
		super.method();										// 상위클라스의 Method불러오기 슈퍼s
		
	}
}
