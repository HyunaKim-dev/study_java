package src.homework2;

import java.util.Scanner;

public class StudentPoint {
	
	//변수,배열 선언
	static int n;
	static int[] sn;
	static String[] name;
	static int[][] score;
	static int[] tot;
	static double[] avg;	
		
	//입력 메소드
	static void getInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학생 수를 입력하세요. >>");
		n=sc.nextInt();
		
		sn=new int[n];
		name=new String[n];
		score = new int[n][3];
		tot=new int[n];
		avg=new double[n];
		
		for(int i=0; i<n; i++) {			
			System.out.print(i+1+"번째 학생의 학번을 입력하세요.(4자리) >>");
			sn[i]=sc.nextInt();
			System.out.print(i+1+"번째 학생의 이름을 입력하세요. >>");
			name[i]=sc.next();
			System.out.print(name[i]+"의 국어, 영어, 수학 점수를 입력하세요.>>");
			for(int j=0; j<3; j++) {		
			score[i][j]=sc.nextInt();
			tot[i]+=score[i][j];
			avg[i]+=tot[i]/3.0;
			}		
		}
		sc.close();
	}
	
	//출력 메소드
	static void printAll() {
		System.out.println("--------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<n; i++) {
			System.out.print(sn[i]+"\t"+name[i]+"\t");
			for(int j=0; j<3; j++) {
				System.out.print(score[i][j]+"\t");
				}
				System.out.printf("%d\t %.1f\t%n", tot[i], avg[i]);
		}
		System.out.println("--------------------------------------------------------");
	}
		
	//출력 메소드2
	static void printOne(int a) {
		
		System.out.println("--------------------------------------------------------");
		
		boolean b = false;
		for(int i=0; i<sn.length; i++) {
			if(sn[i]==a) {
			b=true;
			System.out.print(sn[i]+"\t"+name[i]+"\t");
			for(int j=0; j<3; j++) {
			System.out.print(score[i][j]+"\t");
			}
			System.out.printf("%d\t %.1f\t%n", tot[i], avg[i]);
			}
		}			
		if(b==false) {
				System.out.println("해당 학번에 해당하는 정보가 없습니다.");
			}
		System.out.println("--------------------------------------------------------");
	}
	
	
	public static void main(String[] args) {
		getInfo();
		printAll();
		printOne(1002);
	}
}
