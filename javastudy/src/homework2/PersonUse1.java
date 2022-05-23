package src.homework2;

public class PersonUse1 {
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.setName("홍길동");
		p1.setAge(30);
		p1.setMail("hong@naver.com");
		p1.setAddress("서울 강남구 역삼동");
		
		Person1 p2 = new Person1();
		p2.setName("사임당");
		p2.setAge(23);
		p2.setMail("saimdang@daum.net");
		p2.setAddress("서울 강남구 개포동");
	
		
		System.out.println("이름 : "+p1.getName()+"\n나이 : "+p1.getAge()+"\n이메일 : "
				+p1.getMail()+"\n주소 : "+p1.getAddress()+"\n");
		
		System.out.println("이름 : "+p2.getName()+"\n나이 : "+p2.getAge()+"\n이메일 : "
				+p2.getMail()+"\n주소 : "+p2.getAddress());	
	}
}

