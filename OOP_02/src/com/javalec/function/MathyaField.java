package com.javalec.function;

public class MathyaField {
	
	
	
	
		// --- Field
	
	public int startNum = 0;
	public int endNum = 0;
	public int sum = 0;
	public int sub = 0;
	public int multi = 0;
	public int divi = 0;
	
	
	
		// --- Constructor
		
	public MathyaField() {
		// TODO Auto-generated constructor stub
	}
	
		// --- Method
		
		public int sum() {
			sum = startNum + endNum;
			return sum;
		}
		
		public int sub() {
			
			sub = startNum - endNum;
			return sub;
		}
		
		public int multi() {
			
			multi = startNum * endNum;
			return multi;
		}
		
		public int divi() {
			
			divi = startNum / endNum;
			return divi;
		}
		
		
	


}
