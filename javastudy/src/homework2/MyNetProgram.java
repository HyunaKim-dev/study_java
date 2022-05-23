package src.homework2;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Enumeration;

public class MyNetProgram {
	public static void main(String[] args) {
				
		try {
			System.out.println("1) 나의 랜카드 정보 : ");
			Enumeration<NetworkInterface> enu = NetworkInterface.getNetworkInterfaces();
			while(enu.hasMoreElements()) {
				NetworkInterface net = enu.nextElement();
				System.out.println(net);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		try {
			System.out.println("\r\n2) naver.com의 서버들 : ");
			InetAddress[] address = InetAddress.getAllByName("naver.com");
			for(InetAddress i : address) 
				System.out.println(i);		
			InetAddress host = InetAddress.getByName("naver.com");
			System.out.println("\r\n3) naver.com의 호스트이름 : "+host.getHostName());
			System.out.println("메인 IP번호 : "+host.getHostAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("\r\n4) 나의 사용 port 번호들 : ");
		ServerSocket socket=null;
		for(int i=0; i<65535; i++) {
			try {
				socket=new ServerSocket(i);
				socket.close();
			} catch (Exception e) {
				System.out.println(i+"번 포트는 사용중입니다.");				
			}
		}		
	}
}
