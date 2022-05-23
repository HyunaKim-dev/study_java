package src.homework2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapListCardEx {
	public static void main(String[] args) {
		Map<String, Object> map=new HashMap<>();
		List<CardEx> list=new ArrayList<>();

		list.add(new CardEx(1234, "2022-05-13", "티셔츠", "삼성", "3791826268", 55900));
		list.add(new CardEx(2345, "2022-04-11", "컴퓨터", "롯데", "1591839468", 2555000));
		list.add(new CardEx(3456, "2022-05-05", "커  피", "현대", "2791850668",  1200));

		map.put("list", list);
		print(map);
	}
	
	static void print(Map map) {
		ArrayList<CardEx> list2=(ArrayList<CardEx>)map.get("list");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("주문번호\t\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("--------------------------------------------------------------------------");
		for(CardEx s : list2) {
			System.out.println(s.getNo()+"\t\t"+s.getOrderDate()+"\t"+s.getProduct()
			+"\t"+s.getCardName()+"\t"+s.getCardNo()+"\t"+String.format("%,d",s.getPay()));	
		System.out.println("--------------------------------------------------------------------------");
		}
	}
}
