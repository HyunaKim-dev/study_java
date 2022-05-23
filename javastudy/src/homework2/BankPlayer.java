package src.homework2;

public class BankPlayer extends Thread {
	int money;
	MyBank mybank;
	String name;
	
	public BankPlayer() {}
	
	public BankPlayer(int money, String name, MyBank mybank){
		this.money=money;
		this.name=name;
		this.mybank=mybank;
	}
	
	@Override
	public void run() {
		mybank.Account(money, name);
	}
}