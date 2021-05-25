package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름을 입력 해주세요.");
		String name = scn.nextLine();
		
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		scn.close();

	}

}
