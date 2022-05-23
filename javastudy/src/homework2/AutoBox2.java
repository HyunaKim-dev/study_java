package src.homework2;

public class AutoBox2 {	
	public static void main(String[] args) {
		int num1=30;
		double num2=40.3;
		int num3=50;
		
		Integer i1=num1;
		Double d=num2;
		Integer i2=new Integer(num3);
		System.out.println("기본자료형 : "+num1+", 객체자료형 : "+i1);
		System.out.println("기본자료형 : "+num2+", 객체자료형 : "+d);
		System.out.println("기본자료형 : "+num3+", 객체자료형 : "+i2);
	}	
}                                                                                     
