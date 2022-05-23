package src.homework2;

public class OuterEx2 {
	
	static class InnerStatic{
		int num=2;
		static String name="사임당";
		}
	
	class InnerEx{
		String email="saim@gmail.com";
	}
	
	String myMethod() {
		class LocalInnerEx{
			String addr="서울시 강남구 역삼동";
		}
		LocalInnerEx li= new LocalInnerEx();
		return li.addr;
	}
}
	

