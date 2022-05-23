package src.homework2;

public class BankUse {
	public static void main(String[] args) {
		MyBank bank=new MyBank();
		BankPlayer hong = new BankPlayer(10,"홍길동",bank);
		BankPlayer sim = new BankPlayer(20,"신사임당",bank);
		BankPlayer lee = new BankPlayer(30,"이몽룡",bank);
		
		hong.start();	
		sim.start();
		lee.start();
	}
}
