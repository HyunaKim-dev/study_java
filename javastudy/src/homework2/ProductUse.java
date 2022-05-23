package src.homework2;

import java.util.ArrayList;
import java.util.List;
public class ProductUse {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		Product p1 = new Product("냉장고", "삼성", "20220101", 200, 4);
		list.add(p1);
		list.add(new Product("TV", "LG", "20220101", 300, 2)); 
		list.add(new Product("에어컨", "위니아", "20220101", 100, 2)); 

		System.out.println("---------------------------------------------------");
		System.out.println("제품명\t제조사\t제조일자\t   단가(만원)\t수량\t금액");
		System.out.println("---------------------------------------------------");
		for(Product p : list)
			p.getInfo();
		System.out.println("---------------------------------------------------");
	}
}
