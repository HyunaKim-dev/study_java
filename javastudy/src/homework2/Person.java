package src.homework2;

import java.util.Scanner;

public class Person {
	private String name;
	private int age;
	private String mail;
	private String adr;
	Scanner sc = new Scanner(System.in);
	
	public void setName() {

		System.out.print("이름을 입력하세요.");
		name = sc.next();
	
	}
	public String getName() {
		return name;
	}
	public void setAge() {
		for(;;) {
		System.out.print("나이를 입력하세요.");
		int a = sc.nextInt();
		if(a < 0 || a > 150	) System.out.println("입력값이 정확하지 않습니다.");
		else {
			age = a;
			break;
		}
		}
	}
	
	public int getAge() {
		return age;
	}
	
	public void setMail() {
		System.out.print("메일을 입력하세요.");
		mail = sc.next();
		
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setAddress() {
		System.out.print("주소를 입력하세요.");
		adr = sc.next();

	}
	
	public String getAddress() {
		return adr;
	}
	
}
