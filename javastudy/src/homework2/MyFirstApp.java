package src.homework2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyFirstApp extends JFrame {
	public MyFirstApp() {
		super("학습내용");
		setSize(500,150);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		
		JPanel panel2 = new JPanel();
		
		panel.setBackground(Color.yellow);
		panel1.setBackground(Color.cyan);
		panel2.setBackground(Color.green);
		
		JLabel label = new JLabel("오늘 무엇을 배웠나요?");
		panel1.add(label);
		
		JButton button1 = new JButton("레이아웃");
		JButton button2 = new JButton("이벤트처리");
		JButton button3 = new JButton("버튼 생성");
		JButton button4 = new JButton("종료");
		
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
				
		panel.add(panel1);
		panel.add(panel2);
		
		add(panel, "North");
		add(panel2, "South");
		setVisible(true);
		
		
		button1.addActionListener(new EventColorAction(this, Color.blue));
		button2.addActionListener(new EventColorAction(this, Color.red));
		button3.addActionListener(new EventColorAction(this, Color.pink));
		
		ActionListener handler = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("레이아웃")) {
					JOptionPane.showMessageDialog(null, 
							"Good!", "레이아웃", JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("이벤트처리")) {
					JOptionPane.showMessageDialog(null, "수고하셨어요.",
							"이벤트처리", JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("버튼 생성")) {
					JOptionPane.showMessageDialog(null, "내일도 화이팅!",
							"버튼 생성", JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("종료")) {
					JOptionPane.showMessageDialog(null, "프로그램을 정말 종료하시겠습니까?",
							"종료", JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}	
				
			}
		};
		
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);


	}
	public static void main(String[] args) {
		new MyFirstApp();
	}

}

