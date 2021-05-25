package com.javaex.ex01;

public class Ex06 {
	public static void main(String[] args) {
		
		/*
		 * int num1 = (1); float num2 = (1.1F);
		 * 
		 * double result = (num1+num2);
		 */
		
		//자동형변환 룰을 알아야 자료형을 결정할수있다.
	 System.out.println(2+3.5);
	 double var01 = 2 + 3.5;
	 System.out.println(var01);
	 
	 //자동형변환2 (long + float)
	 long var02 = 12345L;
	 float var03 = 1.1F;
	 System.out.println(var02+var03); //test --> 실수(float)
	 
	 
	 float result01 = var02 + var03; //long-->float(실수)으로 자동변환
	 System.out.println(result01);
	 
	 System.out.println("=============================");
	 
	 //강제형변환
	 int var04 = (int)3.14;
	 System.out.println(var04);
	 
	 
	 //확대변환
	 byte var05 = 127;
	 int result02 = (int)var05;  // (강제형변환 확대변환 byte -> int)
	 System.out.println(result02);
	 
	 //축소변환
	 int var06 = 10;
	 byte result03 = (byte)var06; // (강제형변환 축소변환 int -> byte)
	 System.out.println(result03);
	 
	 //축소변환 비교
	 int var07 = 100001231;
	 byte result04 = (byte)var07;
	 System.out.println(result04);  // 출력되는값 이유확인 사용시 주의 
	 
	 //실수 -> 정수 형변환 소숫점 밑 버림
	 double var08 = 1235.57;
	 int result05 = (int)var08;
	 System.out.println(result05);
	 
	 //정수 -> 실수 형변환 소숫점이 x.0 으로 표현된다.
	 int var09 = 7;
	 double result06 = (double)var09;
	 System.out.println(result06);
	 
	 
	}
}
