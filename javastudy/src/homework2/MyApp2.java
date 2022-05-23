package src.homework2;

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MyApp2 extends JApplet implements 
MouseListener, MouseMotionListener, KeyListener, ActionListener  {
	public MyApp2() {
		
	}
	private Random random;
	private Font font;
	private FontMetrics fm;
	private String message;
	private Dimension dim;
	private int imgx, imgy, imgwid, imghei;
	private Image img;
	private boolean flag=false;
	private AudioClip audio;
	private JButton play,stop,loop;

	@Override
	public void init() {
		setSize(600,600);
		random=new Random();//배경
		
		message="검은 점을 클릭해보세요!";
		font=new Font("serif", Font.CENTER_BASELINE, 40);

		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("Y0jp.gif"));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		audio = getAudioClip(getClass().getResource("space_oddity.wav"));
		JPanel p = new JPanel();
		add(p, BorderLayout.SOUTH);
		p.setBackground(Color.gray);		
		stop = new JButton("stop");
		p.add(stop);
		stop.addActionListener(this);		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(150, 150, 20, 20);//검은점
		g.setColor(Color.black);
		for(int i=0; i<100; i++) {//배경
		int color1=random.nextInt(256);
		int color2=random.nextInt(256);
		g.setColor(new Color(color2, color1, color2));;
		int x=random.nextInt(500);
		int y=random.nextInt(500);
		g.drawArc(x, y, 100, 100, 0, 180);
		}//for
		g.setFont(font);
		g.drawString(message, 30, 30);
		if(flag) g.drawImage(img, imgx, imgy, this);
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {
		flag=true;
		imgx = e.getX();
		imgy = e.getY();
		message ="I Feel Good~";
		repaint();
		audio.loop();
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton)e.getSource();
		if(btn == stop) audio.stop();
	}
}
