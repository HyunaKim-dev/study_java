package src.homework2;

import java.util.Scanner;

public class MyGame1 {
	int user;
	int com;
	String random;

	public MyGame1(){}
	
	public MyGame1(String in) {
		this.setUser(in);
		this.setCom();
		this.match();
	}

	void setUser(String in) {
		switch(in) {
		case "가위": user=1; break;
		case "바위": user=2; break;
		case "보": user=3; break;		
		}
	}

	void setCom() {
		com=(int)(Math.random()*3+1);		
		if(com==1) random= "가위";
		else if(com==2) random= "바위";
		else random= "보";
	}	

	void match() {		
		if(com==user) System.out.println("비기셨습니다.");
		else if((user==1&&com==3||user==2&&com==1||user==3&&com==2)) 
			System.out.println("이기셨습니다. 컴퓨터는 "+random+"입니다.");
		else System.out.println("지셨습니다. 컴퓨터는 "+random+"입니다.");
	}


	public static void main(String[] args) {		
		Scanner scan=new Scanner(System.in);
		while(true) {
			System.out.print("가위, 바위, 보 중 하나를 입력하세요(종료는 exit) : ");
			String in=scan.next();

			if(in.equals("가위")||in.equals("바위")||in.equals("보")) {
				MyGame1 game1=new MyGame1(in);	//게임 실행
				continue;
			}else if(in.equals("exit"))
				break;
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				continue;
			}

		}//end while
		System.out.println("Game Exit...");
		scan.close();
	}
}

