package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		
		//대입연산자
		System.out.println("대입연산자----------------------");
		int a = 7; // 7 -> a
		int b = 2; 
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("산술연산자----------------------");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b);  //몫
		System.out.println(a%b);  //나머지
		
		//산술연산자  / %
		
		System.out.println("산술연산자 /  %-------------------   ");
		System.out.println(7.0/2.0);
		System.out.println(7.0%2.0);
		
		
		//부호연산자
		System.out.println("부호연산자 -------------------------");
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		var = -var;
		System.out.println(var);
		System.out.println(pVar);	//+1*x
		System.out.println(mVar);	//-1*x
		
		//증감연산자 
		System.out.println("증감연산자 앞-------------------------");
		System.out.println(a); //a-->7  b-->2
		System.out.println(++a);
		System.out.println(a);  // a 변했어? -> ㅇㅇ
		
		System.out.println(b); 
		System.out.println(--b);
		System.out.println(b);  //b 변했어? -> ㅇㅇ 
		
		System.out.println("증감연산자 뒤-------------------------");
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(b); 
		System.out.println(b--);
		System.out.println(b);
		
		System.out.println("증감연산자 연습문제-------------------------");
		int num = 5;
		
		System.out.println(num);
		
		//System.out.println(++num);
		
		//System.out.println(num++);
		
		System.out.println(num++*10);
		
		System.out.println(num);
		
		
		
		
	}
	
}
