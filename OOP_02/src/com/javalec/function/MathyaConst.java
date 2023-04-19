package com.javalec.function;

public class MathyaConst {

		
		
		
		
			// --- Field
		
		private int startNum = 0;
		private int endNum = 0;
		private int sum = 0;
		private int sub = 0;
		private int multi = 0;
		private int divi = 0;
		
		
		
			// --- Constructor

		public MathyaConst() {
			// TODO Auto-generated constructor stub
		}
		
		
		public MathyaConst(int startNum, int endNum) {
			super();
			this.startNum = startNum;
			this.endNum = endNum;
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
