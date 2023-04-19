package com.javalec.function;

public class Shop2 extends HQ {

	// field
	
	// Constructor
	public Shop2() {
		// TODO Auto-generated constructor stub
	}
			
	// Method
	
	public void makeKimchi() {
		System.out.println("김치찌개(HQ) : 5,000원");
	}
	
	@Override
	public void makeBudae() {
		System.out.println("부대찌개 : 5,000원");
	}
	
	@Override
	public void makeBibim() {
		System.out.println("비빔밥 : 5,000원");
	}
	
	@Override
	public void makeSoondae() {
		System.out.println("순대국 : 4,000원");
	}
	
	@Override
	public void makeAir() {
		System.out.println("공기밥 : 무료입니다.");
	}
}
