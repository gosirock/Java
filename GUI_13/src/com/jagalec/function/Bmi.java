package com.jagalec.function;

import com.javalec.base.Main;

public class Bmi {
	
	int height;
	int weight;
	
	public Bmi() {
		// TODO Auto-generated constructor stub
	}

	public Bmi(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	
	public String clac() {
		
		String result = "";
		
		double bmi = (double)weight / ((height*0.01)*(height*0.01));
		
		if (bmi >= 30) 	result = "귀하의 bmi지수는 "+ String.format("%.2f", bmi) + "이고 고도비만 입니다.";
		else if(bmi >= 25) 	result = "귀하의 bmi지수는 "+ String.format("%.2f", bmi) + "이고 비만 입니다.";
		else if(bmi >= 23)	result = "귀하의 bmi지수는 "+ String.format("%.2f", bmi) + "이고 과체중 입니다.";
		else if(bmi >= 18.5) result = "귀하의 bmi지수는 "+ String.format("%.2f", bmi) + "이고 정상체중 입니다.";
		else result = "귀하의 bmi지수는 "+ String.format("%.2f", bmi) + "이고 저체중 입니다.";
		
		return result;
		
		
	}
	
	
	
	
	

}
