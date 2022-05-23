package src.homework2;

import java.util.Scanner;

public class ArrayScore2D_Scan {
	public static void main(String[] args) {
		int n;
		//입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("학생수를 입력하세요 : ");
		n = sc.nextInt();
		//배열 생성
		int[] num = new int[n];
		int[][] score = new int[n][3];
		int[] total = new int[n];
		double[] avg = new double[n];
		char[] grade = new char[n];
		//배열에 값 입력
		System.out.println("국 영 수 점수를 각각 입력하세요 : ");
		for (int i = 0; i < score.length; i++) {
			System.out.println(i + 1 + "번 학생의 점수 : ");
			for (int j = 0; j < 3; j++) {
				score[i][j] = sc.nextInt();
			}
		}
		sc.close();
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < 3; j++) {
				total[i] += score[i][j];
				avg[i] = total[i] / 3.0;
				if (avg[i] >= 90) {
					grade[i] = 'A';
				} else if (avg[i] >= 80) {
					grade[i] = 'B';
				} else if (avg[i] >= 70) {
					grade[i] = 'C';
				} else if (avg[i] >= 60) {
					grade[i] = 'D';
				} else {
					grade[i] = 'E';
				} // if
			}
			num[i] = i + 1;
		}
		//출력
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		for (int i = 0; i < n; i++) {
			System.out.print(num[i] + "\t");
			for (int j = 0; j < 3; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.printf("%d\t%.1f\t%c%n", total[i], avg[i], grade[i]);
		}
		System.out.println("-----------------------------------------------------");

	}// main
}
