package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Customer> customers = new ArrayList<>();		// customers s붙으며 ArrayList
		
		// Constructor로 만들기
		
		Customer customer = new Customer(1, "James", "010-1111-2222");
		customers.add(customer);
		System.out.println(customers.get(0).getName());
		
		// constructor 안쓰고 만들기
		Customer customer2 = new Customer();
		
		customer2.setNumber(2);
		customer2.setName("Cathy");
		customer2.setPhone("010-7777-8888");
		
		customers.add(customer2);
		System.out.println(customers.get(1).getName());
		System.out.println(customers.get(1).getPhone());
		
		// -------
		Customer customer3 = new Customer(3, "Maria", "010-3333-4444");
		customers.add(customer3);
		
		for(int i=0; i<customers.size(); i++) {
			System.out.print("|");
			System.out.print(customers.get(i).getNumber());
			System.out.print("|");
			System.out.print(customers.get(i).getName());
			System.out.print("|");
			System.out.print(customers.get(i).getPhone());
			System.out.println("|");
		}
		
		
		
	}

}
