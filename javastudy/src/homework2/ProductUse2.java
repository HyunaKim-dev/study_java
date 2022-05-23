package src.homework2;

import java.util.ArrayList;
import java.util.List;

public class ProductUse2 {
	public static void main(String[] args) {
		List<Product2> list = new ArrayList<>();
		for(;;) {
			Product2 p = new Product2();
			if(p.isContinue()) {
				list.add(p);				
			}else break;			
		}
		
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("제품번호\t제품명\t제조사\t제조일자\t   단가(천원)\t수량\t금액");
		System.out.println("---------------------------------------------------------------------------");
		for(Product2 pr : list)
			pr.getInfo();
		System.out.println("---------------------------------------------------------------------------");
		System.out.println("프로그램을 종료합니다.");
	}
}
