package com.javalec.base;


import com.javalec.function.HQ;
import com.javalec.function.Shop1;
import com.javalec.function.Shop2;
import com.javalec.function.Shop3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		
//		System.out.println("HQ--------------------");
//		HQ hq = new HQ();
//		hq.makeKimchi();
//		hq.makeBudae();
//		hq.makeBibim();
//		hq.makeSoondae();
//		hq.makeAir();
//		
//		
//		System.out.println("\nShop1-----------------");
//		HQ shop1 = new Shop1();
//		shop1.makeKimchi();
//		shop1.makeBudae();
//		shop1.makeBibim();
//		shop1.makeSoondae();
//		shop1.makeAir();
//		
//		System.out.println("\nShop2-----------------");
//		HQ shop2 = new Shop2();
//		shop2.makeKimchi();
//		shop2.makeBudae();
//		shop2.makeBibim();
//		shop2.makeSoondae();
//		shop2.makeAir();
//		
//		System.out.println("\nShop3-----------------");
//		HQ shop3 = new Shop3();
//		shop3.makeKimchi();
//		shop3.makeBudae();
//		shop3.makeBibim();
//		shop3.makeSoondae();
//		shop3.makeAir();
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ반복문으로 부르기ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		HQ[] store =				// HQ에서 상속받았기때문에 같은타입으로 배열가능
			{new HQ(), new Shop1(), new Shop2(), new Shop3()};		

		for(int i = 0; i < store.length; i++) {
			store[i].makeKimchi();
			store[i].makeBudae();
			store[i].makeBibim();
			store[i].makeSoondae();
			store[i].makeAir();
		}
		
		
	}

}
