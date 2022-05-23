package src.homework2;

import java.util.Scanner;

public class Product2 {
	private String num;//제품번호
	private String product;//제품명
	private String company;//제조사
	private String date;//제조일자
	private int price;//단가
	private int amount;//수량
	private int money;//금액
	private int vat;//부가가치세
	private boolean b;

	public Product2() {
		this.input();
	}

	public void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("제품정보를 입력하세요.(종료는 0 또는 exit)");
		System.out.print("제품번호 : ");
		String input=scan.next();

		if(input.equals("exit")||input.equals("0")) {
			b=false; 
			scan.close();
			return;
		}else num=input;

		System.out.print("제품명 : ");
		product=scan.next();
		System.out.print("제조사 : ");
		company=scan.next();
		System.out.print("제조일자 : ");
		date=scan.next();
		System.out.print("단가(만원) : ");
		price=(Integer.parseInt(scan.next())*10);
		System.out.print("수량 : ");
		amount=Integer.parseInt(scan.next());

		setMoney(price);
		b=true;	
	}

	public boolean isContinue() {
		return b;
	}

	public void getInfo() {
		System.out.println(getNum()+"\t"+getProduct()+"\t"+getCompany()+"\t"+getDate()+"\t"
				+String.format("%,d",getPrice())+"\t"+getAmount()+"\t"
				+String.format("%,d",getMoney()));
	}

	//setter getter
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int price) {
		setVat();
		this.money = price*amount+getVat();
	}
	public int getVat() {
		return vat;
	}
	public void setVat() {
		this.vat = (int)(price*amount*0.1);
	}
}