package com.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class hospitals implements ActionListener{
	JFrame frame = new JFrame();
	JPanel redpan = new JPanel();
	JButton backbutton = new JButton("Back");
	
	hospitals(){
		
		//header
		redpan.setBackground(new Color(123,6,8));
		redpan.setBounds(0,0,420,70);
		
		//backbutton
		backbutton.setBounds(10,35,80,20);
		backbutton.addActionListener(this);
		redpan.add(backbutton);
		
		redpan.setLayout(null);
		frame.add(redpan);
		frame.setSize(420, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == backbutton) {
			frame.dispose();
			home back = new home();
		}
		
	}
}
