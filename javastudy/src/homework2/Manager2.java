package src.homework2;

public class Manager2 extends Employee2 {
	private int bonus;

	public Manager2() {}
	public Manager2(String name, String einum, String address, 
			String email, int salary, String rrn, int bonus) {
		super(name, einum, address, email, salary, rrn);
		this.bonus=bonus;
	}
	public int getBonus() {
		return bonus;
	}
	
	void test() {
		System.out.println("-------------------------");
		System.out.println("사원번호 : "+ einum);
		System.out.println("이름 : "+ name);
		System.out.println("주소 : "+ getAddress());
		System.out.println("이메일 : "+ email);
		System.out.println("연봉 : "+ getSalary());
		System.out.println("주민번호 : "+ getRrn());
		System.out.println("보너스 : "+ bonus);
		System.out.println("-------------------------");
	}
}
