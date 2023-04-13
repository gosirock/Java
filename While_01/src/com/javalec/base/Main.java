package com.javalec.base;

public class Main {

	public static void main(String[] args) {


	// for문은 데이터의 범위를 알아야 처리 (S시작값 ; E끝값; s증가치)
	// while문은 불특정, 언제끝날지 모를때 DB에서 가져올때 유동적인 경우
		
	// 1부터 100까지 합계 구하기
		
	// ------------------------------ for문 ------------------------------
	int tot = 0;
		
	for(int i=1; i<=100; i++) {
		tot += i;
	}
	System.out.println("tot : " + tot);
		
	// while 문 ------------------------------
	tot = 0;
	
	int i = 1;
	
	while(i <= 100) {
		tot+=i;
		i++;
	}
	System.out.println("tot : " + tot);
		
	// ------------------------------ while 문 실사용 ------------------------------
	tot = 0;
	i = 1;
	while(true) {
		tot+=i;
		i++;
		if(i>100) {
			break;									// break는 반복문을 끝낸다는 표현 if문끝내겠다가아님
		}
	}
	System.out.println(tot);
		
	// ------------------------------ break ------------------------------
	for(int j=1; j<1000000; j++) {
		if(j == 10) {
			System.out.println("Find");
			break;									// 찾았으면 빠져나와라! 아니면 100만번 돌고있다.
		}
	}
	
	// ------------------------------ continue ------------------------------
	for(int j=1; j<=10; j++) {
		if(j == 5) {
			continue;								// 다시 반복문으로 올라가라
		}
		System.out.println(j);
	}
	}

}
