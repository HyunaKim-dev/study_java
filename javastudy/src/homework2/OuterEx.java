package src.homework2;

public class OuterEx {
	int num=2;
	String name="사임당";
	String email="saim@gmail.com";		
	private String addr="서울시 강남구 역삼동";
	class InnerEx{	
		void info() {
			System.out.println("---------------------");
			System.out.println("고객번호 : "+num);
			System.out.println("이름 : "+name);
			System.out.println("이메일 : "+email);
			System.out.println("주소 : "+addr);
			System.out.println("---------------------");			
		}
	}
}


