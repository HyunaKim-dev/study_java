package src.homework2;

public class OuterInnerEx {
	public static void main(String[] args) {
		System.out.println("---------------------");
		OuterEx2.InnerStatic sc= new OuterEx2.InnerStatic();
		System.out.println("고객번호 : "+sc.num);
		System.out.println("이름 : "+OuterEx2.InnerStatic.name);
		OuterEx2 oc = new OuterEx2();
		OuterEx2.InnerEx ic = oc.new InnerEx();
		System.out.println("이메일 : "+ic.email);
		System.out.println("주소 : "+oc.myMethod());
		System.out.println("---------------------");

	}
}
