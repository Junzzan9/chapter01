package com.javaex.ex01;

public class Ex07 {
	public static void main(String[] args) {
		
		double v01 = 5/4;		 //  int/int = int.
        System.out.println(v01); //1.25 답은 1.0 생각해보니 뒤에 값은 정수로 계산해서 double 씌우니 1.0

        double v02 = (double)5/4 ;  // 1.25  5.0 / 4 --> 5.0 / 4.0 실수로 따라감
        System.out.println(v02);

        double v03 = 5/(double)4 ; // 1.25   5 / 4.0 --> 5.0 / 4.0 실수로 따라감
        System.out.println(v03);

        double v04 = (double)5/(double)4 ;  // 1.25  5.0 / 4.0 실수 실수 실수하지마
        System.out.println(v04);

        int v05 = (int)1.3 +(int)1.8 ;  // 2  3아님
        System.out.println(v05);
	}
}

