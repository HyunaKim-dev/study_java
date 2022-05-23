package src.homework2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

	public class EventColorAction implements ActionListener {
		private JFrame f;
		private Color c;
		private Container con;	
		
		public EventColorAction(JFrame f, Color c){
			this.f = f;
			con = f.getContentPane();
			this.c = c;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			con.setBackground(c);
		}
		
	}
