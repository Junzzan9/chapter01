package com.javaex.ex05;

public class Ex06 {
	public static void main(String[] args) {
		int[] intArray = new int[3];
		
		intArray[0] = 11;
		intArray[1] = 3;
		//intArray[2] = 78;    //값을 넣지 않은 경우 정수형은-->0 으로 표기된다.
								//실수형,boolean,char 기본값은?? test
		
		System.out.println("========================");
		System.out.println(intArray.length);
		System.out.println("========================");
		
		
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		System.out.println("========================");
		
		//java.lang.ArrayIndexOutOfBoundsException --> 없는 방번호
		for(int i=0;i<=intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		
		
	}
}
