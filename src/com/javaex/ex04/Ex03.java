package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan;
		System.out.println("몇 단을 외워 볼까요.");
		System.out.print("단: ");
		dan = sc.nextInt();
		
		for(int i=0;i<9;i++) {
			System.out.println(dan+" * "+(i+1)+" = "+(dan*(i+1)) );
		}
		
		sc.close();

	}
}
