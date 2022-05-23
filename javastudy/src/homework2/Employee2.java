package src.homework2;

public class Employee2 {
	public String einum;//사원번호
	public String name;
	private String address;
	public String email;
	private int salary;
	private String rrn;
	
	public Employee2() {}
	
	public Employee2(String name, String einum, String address, 
			String email, int salary, String rrn) {
		this.einum=einum;
		this.name=name;
		this.address=address;
		this.email=email;
		this.salary=salary;
		this.rrn=rrn;		
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getRrn() {
		return rrn;
	}

	@Override
	public String toString() {
		return "Employee2 [einum=" + einum + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", salary=" + salary + ", rrn=" + rrn + "]";
	}	
}
