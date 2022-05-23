package src.homework2;

public class Product {
	private String product;//제품명
	private String company;//제조사
	private String date;//제조일자
	private int price;//단가
	private int amount;//수량
	private int money;//금액
	
	public Product() {}
	public Product(String product, String company, String date, int price, int amount) {
		this.product = product;
		this.company = company;
		this.date = date;
		this.price = price;
		this.amount = amount;
		this.money = price*amount;
	}
	
	public void getInfo() {
		System.out.println(product+"\t"+company+"\t"+date+"\t"+price+"\t"+amount+"\t"+money);
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
	public void setMoney(int money) {
		this.money = price*amount;
	}	
}
