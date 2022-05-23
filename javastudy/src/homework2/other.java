package src.homework2;

import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;

// 설명 : 랜덤으로 나타나는 이미지를 클릭하면 소리가 나는 앱이지만.. 소리가 나지 않는다.

public class other extends JApplet implements MouseListener, ActionListener{
	//오디오
	private AudioClip audio;
	private JButton play;
	//이미지
	private int x,y, a,b; //x,y는 이미지좌표   a,b는 마우스좌표
	private int width, height;
	private Image img;
	//랜덤
	 
	Random random = new Random();
	
	@Override
	public void init() {
		setSize(300,300);
		//파일 불러오기
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		this.addMouseListener(this);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		width = img.getWidth(null);
		height=img.getHeight(null);	
		System.out.println(width + "," + height);
		
		g.drawImage(img, x,y,this);
		x=random.nextInt(200);
		y=random.nextInt(200);
		System.out.println("그림 좌표 x : "+x+", y : "+y);
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		a=e.getX();
		b=e.getY();
		System.out.println("마우스 좌표 move : a:"+a+" ,b:"+b);
		audio.play();
		repaint();
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	}
	
	
}
