package com.main;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nhospitals {
	JFrame frame = new JFrame();
	JLabel dy = new JLabel("<html>"+"Dy Patil"+"<br>"+"Available"+"<br>"+"Types: A A+ B B+"+"</html>");
	JLabel ter = new JLabel("<html>"+"Terna"+"<br>"+"Available"+"<br>"+"Types: A  B O O-"+"</html>");
	JPanel redpan = new JPanel();
	JPanel pan = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	JButton checkbutton = new JButton("Request");
	JButton checkbutton1 = new JButton("Request");
	JLabel available = new JLabel("available");
	JLabel types = new JLabel("A,A+,B,O");
	
	
	Nhospitals(){
		
		
		
		//dy.setBorder(BorderFactory.createLineBorder(Color.black));
		dy.setBounds(5,5, 100, 50);
		checkbutton.setBackground(Color.red);
		checkbutton.setForeground(Color.white);

		checkbutton.setBounds(290,20,90,30);
		pan.setBounds(30,0,390,60);
		pan.setLayout(null);
		pan.add(checkbutton);
		pan.setBorder(BorderFactory.createLineBorder(Color.black));
		
		//nextpan
		
		checkbutton1.setBackground(Color.red);
		checkbutton1.setForeground(Color.white);
		checkbutton1.setBounds(290,20,90,30);
		ter.setBounds(5,5, 100, 50);
		pan2.setBounds(30, 64, 390, 60);
		pan2.setLayout(null);
		pan2.add(ter);
		pan2.add(checkbutton1);
		pan2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		
		frame.add(pan2);
		pan.add(dy);
		frame.add(pan);
		frame.add(redpan);
		redpan.setBounds(0,0,30,420);
		redpan.setBackground(new Color(123, 6, 8));
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
}
}