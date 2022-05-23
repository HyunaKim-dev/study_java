package src.homework2;

import java.util.Scanner;

public class ArrayScore2D_Scan_other {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int people;
	
	int tot = 0;
	double avg = 0.0;
	
	System.out.println("학생 수를 입력하세요.");
	people=sc.nextInt();
	System.out.println("국 영 수 점수를 각각 입력하세요.");
	int score[][]=new int [people][3];
	
	for(int i=0; i<people; i++) {
		System.out.println(i+1 +"번 학생의 점수");
		for(int j=0; j<3;j++) {
			score[i][j]=sc.nextInt();
		}
	}// 입력 끝
	
//출력	
	System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
	for(int i=0; i<score.length; i++) {
		System.out.print(i+1 +"\t");
		
		for(int j=0; j<3;j++) {
			System.out.print(score[i][j] + "\t");
		}
		
		tot=score[i][0]+score[i][1]+score[i][2];
		System.out.print(tot+"\t");
		avg=tot/3;
		System.out.print(String.format("%.1f\t",avg));
		if(avg>=90)System.out.println("A");
		else if(avg>=80)System.out.println("B");
		else if(avg>=70)System.out.println("C");
		else if(avg>=60)System.out.println("D");
		else System.out.println("F");
		
	}
	
	
	sc.close();
}
}
