package src.homework2;

public class MyBank {

	public synchronized void Account(int money, String name) {
		for(int i=0; i<5; i++) {
			System.out.println(name+"님의 통장잔고는 " +money+ " 만원입니다.");
			money+=10;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
}