package src.homework2;

public class RadioTest {
	public static void main(String[] args) {
		Radio rb = new Radio();
		rb.setOnOff(1);
		rb.setChannel(89.1);
		rb.setVolume(12);
		System.out.println("[브리츠 라디오]");
		System.out.println(rb.getOnOff()
				+"\n현재 채널은 "+rb.getChannel()+" 입니다.\n"
				+"볼륨은 "+rb.getVolume()+" 입니다.\n" );
		
		Radio ri = new Radio();
		ri.setOnOff(0);
		ri.setChannel(95.1);
		ri.setVolume(9);
		System.out.println("[아이리버 라디오]");
		System.out.println(ri.getOnOff()
				+"\n현재 채널은 "+ri.getChannel()+" 입니다.\n"
				+"볼륨은 "+ri.getVolume()+" 입니다." );
	}	
}
