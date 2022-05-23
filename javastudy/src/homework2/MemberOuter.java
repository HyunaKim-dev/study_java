package src.homework2;

public class MemberOuter {
	int num=1;
	String name="홍길동";
	String email="hong@gmail.com";
	class TestInner{
		void print() {
			System.out.println("고객번호 : "+num+"\n이름 : "+name+"\n이메일 : "+email);
		}
	}

	public static void main(String[] args) {
		MemberOuter obj=new MemberOuter();
		MemberOuter.TestInner in = obj.new TestInner(); 
		System.out.println("-----------------------");
		in.print();
		System.out.println("-----------------------");

	}
}//외부클래스
