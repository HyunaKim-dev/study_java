package src.homework2;

public class Student2 {
	private String name;
	private String num;//학번
	private String major;//전공
	private int year;//학년
	
	public Student2() {}
	
	public Student2(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	public void input(String name, String num, String major, int year) { 
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	

}
