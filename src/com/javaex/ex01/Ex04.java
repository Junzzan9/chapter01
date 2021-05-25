package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		
		//기본사용방법
		/*
		char ch01 = 'A';
		char ch02 = '안';
		
		System.out.println(ch01);
		System.out.println(ch02);
		*/
		
		//숫자로 대입이 된다. int와 헷갈릴 수 있다.
		
		 /*
		 * char ch03 = 65; System.out.println(ch03);
		 * 
		 * int ch04 = 65; //의도 정수 65 였으나 char를 쓴 상황에 오류X 
		 * System.out.println(ch04);
		 */
		
		//문자(1글자)는 char 문자열(1글자 이상)은 String
		
		/*
		 * char ch05 = '오'; String ch06 = "안녕하세용";
		 * 
		 * System.out.println(ch05); System.out.println(ch06);
		 */
		
		boolean c01 = true;
		String c02 = "true";
		
		System.out.println(c01);
		System.out.println(c02);
		
		if(c01) {
			System.out.println("if문실행");
		}
	}
	
}
