package com.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class home implements ActionListener{
	JFrame frame = new JFrame();
	
	

	JLabel welcomeLabel = new JLabel("Welcome to BloodTrak");
	JLabel head = new JLabel("Welcome to Bloodtrack");
	JLabel Nlabel = new JLabel("<html>"+"Nerul"+"<br>"+"Maharashtra"+"<br>"+"Pincode:400706"+"</html>");
	JLabel Vlabel = new JLabel("<html>"+"Vashi"+"<br>"+"Maharashtra"+"<br>"+"Pincode:400706"+"</html>");
	JLabel Blabel = new JLabel("<html>"+"Belapur"+"<br>"+"Maharashtra"+"<br>"+"Pincode:400706"+"</html>");
	
	JPanel redpan = new JPanel();
	
	
	
	Border blackline = BorderFactory.createLineBorder(Color.black); 
	
	JLabel lab = new JLabel("Select locality to check blood availibility.");
	JButton nbutton = new JButton();
	JButton bbutton = new JButton();
	JButton vbutton = new JButton();
	home(){

		
		
		lab.setBounds(10,73,420,30);

		
		//buttons
		
		nbutton.setBounds(0,100,420,60);
		bbutton.setBounds(0,160,420,60);
		vbutton.setBounds(0,220,420,60);
		bbutton.addActionListener(this);
		nbutton.addActionListener(this);		
		vbutton.addActionListener(this);
		
		
		//header
		head.setBounds(0,25,60,20);
		welcomeLabel.setBounds(0, 0, 200, 25);
		redpan.setBounds(0,0,420,70);
		
	

		//button labels
		
		Nlabel.setBounds(0,73,70,40);
		Blabel.setBounds(0, 133, 70, 40);
		Vlabel.setBounds(0,193,60,40);
		nbutton.add(Nlabel);
		bbutton.add(Blabel);
		vbutton.add(Vlabel);
		
		
		frame.add(lab);
		frame.add(vbutton);
		frame.add(bbutton);
		redpan.add(head);
		frame.setForeground(Color.black);
		redpan.setBackground(new Color(123, 6, 8));
		frame.add(nbutton);
		frame.add(redpan);
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(420,420);
		frame.setVisible(true);
				
		
		
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bbutton ) {
			frame.dispose();
			hospitals direct = new hospitals();
		}
		else if(e.getSource() == nbutton) {
			frame.dispose();
			Nhospitals direct = new Nhospitals();
		}
		else if(e.getSource() == vbutton) {
			frame.dispose();
			hospitals direct = new hospitals();
		}
		
		
	}
}
