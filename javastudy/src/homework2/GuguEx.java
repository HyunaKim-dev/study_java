package src.homework2;

import java.util.Scanner;

public class GuguEx {
	
	static void gugu(int n) {
		for(int i=1; i<10; i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
		System.out.println();
	}
	static void guguAll() {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요(모든 단은 0)>>");
		int n = sc.nextInt();
		sc.close();
		if(n==0) {
			System.out.println("==구구단 전체==");
			guguAll();
		}else {
			System.out.println("=="+n+"단==");
			gugu(n);
		}		
	}
}
