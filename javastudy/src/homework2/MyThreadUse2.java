package src.homework2;

public class MyThreadUse2 {
	public static void main(String[] args) {
		
		MyThreadEx2 m1=new MyThreadEx2("스레드1**");
		MyThreadEx2 m2=new MyThreadEx2("스레드2++");
		MyThreadEx2 m3=new MyThreadEx2("스레드3##");
	
		Thread t1=new Thread(m1);
		Thread t2=new Thread(m2);
		Thread t3=new Thread(m3);
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

