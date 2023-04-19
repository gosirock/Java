package com.javalec.function;

public class Shop3 extends HQ{

	// field
	
	// Constructor
	public Shop3() {
		// TODO Auto-generated constructor stub
	}
			
	// Method
	@Override
	public void makeKimchi() {
		System.out.println("김치찌개 : 6,000원");
	}
	
	@Override
	public void makeBudae() {
		System.out.println("부대찌개 : 7,000원");
	}
	
	@Override
	public void makeBibim() {
		System.out.println("비빔밥 : 7,000원");
	}
	
	@Override
	public void makeSoondae() {
		System.out.println("순대국 : 6,000원");
	}
	
	public void makeAir() {
		System.out.println("공기밥(HQ) : 1,000원");
	}
}
