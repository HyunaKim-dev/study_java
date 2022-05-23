package src.homework2;

public class CarTest {
public static void main(String[] args) {
	Car myCar = new Car();
	myCar.setColor("흰색");
	myCar.speedUp(120);
	myCar.speedDown(20);	
	myCar.changeGear(5);
	
	System.out.println("차량 색상 : " + myCar.getColor());
	System.out.println("차량 속도 : " + myCar.getSpeed()+" km/h");
	System.out.println("차량 기어단수 : "+myCar.getGear());
}
}
