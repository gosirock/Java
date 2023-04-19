package com.javalec.function;

public class Shop1 extends HQ{

	// field
	
	// Constructor
		
	public Shop1() {
		// TODO Auto-generated constructor stub
	}
	// Method
	@Override
	public void makeKimchi() {
		System.out.println("김치찌개 : 4,500원");
	}
	
	@Override
	public void makeBudae() {
		System.out.println("부대찌개 : 5,000원");
	}
	
	public void makeBibim() {
		System.out.println("비빔밥(HQ) : 6,000원");
	}
	
	@Override
	public void makeSoondae() {
		System.out.println("순대국 : 판매하지 않습니다.");
	}
	
	public void makeAir() {
		System.out.println("공기밥(HQ) : 1,000원");
	}

	
}
