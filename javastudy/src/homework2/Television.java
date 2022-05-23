package src.homework2;

public class Television {
	//멤버변수(전역변수)
	int channel; //채널
	int volume; //음크기
	boolean onOff; //전원상태
	
	void print() {
		if(onOff) {
		System.out.println("TV 상태 : On");
		System.out.println("채널은 "+channel + "이고 볼륨은 "+ volume + "입니다.");
		}else System.out.println("TV 상태 : OFF");
	}	
	
	void setChannel(int ch) {
		channel = ch; //ch는 local변수. 멤버변수 = 로컬변수 값을 저장.
	}
	void setVolume(int vl) {
		volume = vl;
	}
	
	void setOnOff(int t) {
		if(t==1) onOff = true;
		else onOff = false;
	}
}
