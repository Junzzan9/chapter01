package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		int sum = 0;
		while (true) {
			int n = sc.nextInt();
			if(n==0) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				sum=sum+n;
				System.out.println("합계: "+sum);
			}
		}
		sc.close();
		*/
		
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int n;
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		do {
			n = sc.nextInt();
			sum=sum+n;
			System.out.println("합계: "+sum);
			}while(n!=0);
		System.out.println("종료");
		sc.close();
	}

}
