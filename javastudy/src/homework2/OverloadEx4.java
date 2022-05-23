package src.homework2;

public class OverloadEx4 {
	public static void main(String[] args) {
		print("홍길동",3000);

	}
	
	static void print(String name, int salary) {
		System.out.println("이름\t급여\t세금\t실수령액");
		System.out.println(name+"\t"+salary+"\t"
		+String.format("%d\t%d", (int)(salary*0.03), (int)(salary-salary*0.03)));
	}		
}