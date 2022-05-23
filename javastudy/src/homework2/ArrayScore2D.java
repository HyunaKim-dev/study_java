package src.homework2;

public class ArrayScore2D {
	public static void main(String[] args) {
		char grade = ' ';
		double avg = 0;
		int[][] score = {
				{100,100,100},
				{90,80,80},
				{90,60,100},
				{80,40,50},
				{65,80,70}
				};
		
				System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
				for (int i = 0; i < score.length; i++) {
					int tot = 0; // 선언 위치 따라 누적값 달라짐
					System.out.print(i + 1 + "\t");
					for (int j = 0; j < 3; j++) {
						System.out.print(score[i][j] + "\t");
						tot += score[i][j];
					}
					System.out.print(tot + "\t");
					avg = tot / 3.0;
					System.out.printf("%.1f\t", avg);
					if (avg >= 90) {
						grade = 'A';
					} else if (avg >= 80) {
						grade = 'B';
					} else if (avg >= 70) {
						grade = 'C';
					} else if (avg >= 60) {
						grade = 'D';
					} else {
						grade = 'F';
					}
					System.out.println(grade);
				} // outer for
				System.out.println("-----------------------------------------------------");
			}
		}