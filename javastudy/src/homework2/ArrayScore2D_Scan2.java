package src.homework2;

import java.util.Scanner;

public class ArrayScore2D_Scan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char grade = ' ';
		double avg = 0;
		
		//입력
		System.out.print("학생수를 입력하세요 : ");
		n = sc.nextInt();		
		System.out.println("국 영 수 점수를 각각 입력하세요 : ");
		int[][] score = new int[n][3];
	
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "번 학생의 점수 : ");
			for (int j = 0; j < 3; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i = 0; i < score.length; i++) {
			int total = 0;
			System.out.print(i + 1 + "\t");
			for (int j = 0; j < 3; j++) {
				System.out.print(score[i][j] + "\t");
				total += score[i][j];
			}
			
			System.out.print(total + "\t");
			avg = total / 3.0;
			System.out.printf("%.1f\t", avg);
			if (avg >= 90) grade = 'A';
			 else if (avg >= 80) grade = 'B';
			 else if (avg >= 70) grade = 'C';
			 else if (avg >= 60) grade = 'D';
			 else grade = 'F';
			System.out.println(grade);
		}
		System.out.println("-----------------------------------------------------");
	}
}
