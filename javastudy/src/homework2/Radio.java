package src.homework2;

public class Radio{

	boolean onOff;
	double channel;
	int volume;	
	
	void setOnOff(int onOff) {
		if(onOff==1) this.onOff = true;
		else this.onOff = false;
	}
	
	void setChannel(double channel) {
		this.channel = channel;
	}
	
	void setVolume(int volume) {
		this.volume = volume;
	}
	
	String getOnOff() {
		if(onOff) return "라디오가 켜져 있습니다.";
		else return "라디오가 꺼져 있습니다.";
	}
	
	double getChannel() {
		return channel;
	}
	
	int getVolume() {
		return volume;
	}
}
