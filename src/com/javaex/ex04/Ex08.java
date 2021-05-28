package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {
		int c = 1;
		
		while (true) { 
			if (c%6==0&&c%14==0) {
				System.out.println(c);
				break;
			}
			else {
				c++;
			}
		
		}
		

	}

}
