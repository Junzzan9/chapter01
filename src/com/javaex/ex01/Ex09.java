package com.javaex.ex01;

public class Ex09 {
	public static void main(String[] args) {
		//관계연산자 -> 결과 true false --> 결과 boolean
		int n01 = 5;
		int n02 = 3;
		int n03 = 5;
		
		System.out.println(n01<n02); //fasle
		System.out.println(n01>n02); //true
		System.out.println(n01<=n02); //false
		System.out.println(n01<=n03); //true
		System.out.println(n01>=n02); //true
		System.out.println(n01>=n03); //true
		
		System.out.println(n01 == n02); //false
		
		
	}
}
