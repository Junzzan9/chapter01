package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		int[] no = new int[6];
		
		for (int i=0; i<6;i++) {
			no[i]=(int)(Math.random()*45)+1;
		}
		for (int i=0;i<6;i++) {	//<=사용 주의
			System.out.println(no[i]);
		}

	}

}
