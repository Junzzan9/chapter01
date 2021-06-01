package com.javaex.ex05;
//java Ex11.java --> Ex11.class
//java Ex11  (Ex11.class)


//java Ex11
//java Ex11 I am Oh jun sik

// java --> String[] args=new String[5]
public class Ex11 {

	public static void main(String[] args) {
		
		if(args.length>0) {
			if(args[0].equals("-version")) { // 배열 1개
				System.out.println("Ex11 버전 : 3.4343");
			}
			else if(args[0].equals("-help")) { // 배열 1개
				System.out.println("지금부터 도움말을 보여 드리겠습니다.");
				System.out.println("[-version] : 버전 정보를 확인할 수 있습니다.");
				System.out.println("[-help] : 도음말을 확인할 수 있습니다.");
			}
			else {
				for(int i=0;i<args.length;i++) {
					System.out.println(args[i]);
				}
			}

		}
	}
}