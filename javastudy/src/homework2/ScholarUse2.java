package src.homework2;

public class ScholarUse2 {
	public static void main(String[] args) {
		Scholar2 s1 = new Scholar2();
		
		s1.input("사임당", "2203", "컴공", 1, "1종", 250);
		s1.print();
		
		s1.input("홍길동", "2002", "전자", 3); 
		s1.print2();
		
	}
}
