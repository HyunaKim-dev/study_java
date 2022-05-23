package src.homework2;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyEventColor extends JFrame {
	
	public MyEventColor() {
		setTitle("MyEventColor");
		setSize(300, 200);
		setVisible(true);
		
		JButton b1=new JButton("green"); //이름
		JButton b2=new JButton("yellow");
		JButton b3=new JButton("blue");
		JButton b4=new JButton("red");
		
		add(b1,"East");//위치
		add(b2,"West");
		add(b3,"South");
		add(b4,"North");
		
		b1.addActionListener(new EventColorAction(this, Color.green));
		b2.addActionListener(new EventColorAction(this, Color.yellow));
		b3.addActionListener(new EventColorAction(this, Color.blue));
		b4.addActionListener(new EventColorAction(this, Color.red));
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MyEventColor(); 
	}
}
//