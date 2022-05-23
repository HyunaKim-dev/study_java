package src.homework2;

public class PersonUse {
public static void main(String[] args) {
	Person p1 = new Person();
	p1.setName();
	p1.setAge();
	p1.setMail();
	p1.setAddress();
	
	Person p2 = new Person();
	p2.setName();
	p2.setAge();
	p2.setMail();
	p2.setAddress();
	
	System.out.println("이름 : "+p1.getName()+"\n나이 : "+p1.getAge()+"\n이메일 : "
			+p1.getMail()+"\n주소 : "+p1.getAddress()+"\n");
	
	System.out.println("이름 : "+p2.getName()+"\n나이 : "+p2.getAge()+"\n이메일 : "
			+p2.getMail()+"\n주소 : "+p2.getAddress());	
	}
}
