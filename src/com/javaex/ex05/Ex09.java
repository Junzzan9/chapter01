package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {


		int[] arrA=new int[3];
		arrA[0]=10;
		arrA[1]=20;
		arrA[2]=30;
		
		int[] arrB=new int[3];
		arrB[0]=10;
		arrB[1]=30;
		arrB[2]=30;
		
		if(arrA.length==arrB.length) {
			for(int i=0;i<arrA.length;i++) {
				if(arrA[i]!=arrB[i]) {
					System.out.println(i+"번째 값은 다릅니다.");
				}
			}
		}
		else {
			System.out.println("두 배열의 개수가 다릅니다.");
		}

	}

}
