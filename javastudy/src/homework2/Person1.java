package src.homework2;

public class Person1 {
		private String name;
		private int age;
		private String mail;
		private String adr;
		
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			if(age < 0 || age > 150	) {
				System.out.println("입력값이 정확하지 않습니다.");
			}else {
				this.age = age;
			}
		}
		
		public int getAge() {
			return age;
		}
		
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		public String getMail() {
			return mail;
		}
		
		public void setAddress(String adr) {
			this.adr = adr;
		}
		
		public String getAddress() {
			return adr;
		}
		
	}
