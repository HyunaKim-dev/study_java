package src.homework2;

import java.util.Scanner;

public class ArrayScanScore {
	public static void main(String[] args) {
		// (배열, 스캐너, for-each문 활용)

		Scanner sc = new Scanner(System.in);
		System.out.print("성적처리할 학생수를 입력하세요 :");
		int i = sc.nextInt();

		int[] score;
		score = new int[i];
		int tot = 0;
		double avg;

//		for(i=0; i<score.length; i++) {
//		System.out.print("성적을 입력하시오 :");
//		score[i] = sc.nextInt();
//		tot += score[i];
//		}
		
		for (int s : score) {
			System.out.print("성적을 입력하시오 :");
			s = sc.nextInt();
			tot += s;
		}
		sc.close();
		
		avg = tot / (double) score.length;
		System.out.println("총점은 " + tot + "점 입니다.");
		System.out.printf("평균 성적은 %.1f 점 입니다.", avg);
	}
}
