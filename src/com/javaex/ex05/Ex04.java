package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		
		//방 개수 변경할때 for문에서 개수에 해당하는 부분 변경 먼저
		
		int[] no = new int[2];   //6-->8 
		
		for (int i=0; i<no.length;i++) {
			no[i]=(int)(Math.random()*45)+1;
		}
		for (int i=0;i<no.length;i++) {	//<=사용 주의
			System.out.println(no[i]);
		}

	}

}
