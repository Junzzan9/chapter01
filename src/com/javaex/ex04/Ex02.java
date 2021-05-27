package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int i = 0;//초기화
		int dan;
		System.out.println("몇 단을 외워 볼까요.");
		System.out.print("단: ");
		dan = sc.nextInt();
		
		while (i<9) { //반복조건
			System.out.println(dan+" * "+(i+1)+" = "+(dan*(i+1)) );
			
			i++;  //증감식
		}
		
		sc.close();
		
		
		
		
		
	}

}
