package src.homework2;

public class MyThreadEx1 extends Thread {
	String str;
	public MyThreadEx1() {}
	public MyThreadEx1(String str) {
		this.str=str;
	}
	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println(str);
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}