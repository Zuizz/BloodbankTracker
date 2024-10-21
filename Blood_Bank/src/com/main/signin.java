package com.main;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class signin implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton logbutton = new JButton("Login");
	JButton reset = new JButton("Reset");
	JTextField uid = new JTextField();
	JPasswordField pass = new JPasswordField();
	JLabel userid = new JLabel("Userid");
	JLabel password = new JLabel("Password");
	JLabel message = new JLabel("");
	
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	signin(HashMap<String,String> logininfooriginal){
		
		logininfo = logininfooriginal;
		
		userid.setBounds(50,100, 75, 25);
		password.setBounds(50,150, 75, 25);
		message.setBounds(125,250,250,25);
		uid.setBounds(100,100,75,25);
		pass.setBounds(125,150,75,25);
		logbutton.setBounds(110,200,75,25);
		logbutton.addActionListener(this);
		
		reset.setBounds(200,200,75,25);
		reset.addActionListener(this);
		
		frame.add(message);
		frame.add(logbutton);
		frame.add(reset);
		frame.add(uid);
		frame.add(pass);
		frame.add(userid);
		frame.add(password);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == reset) {
			uid.setText("");
			pass.setText("");
		}
		
		if(e.getSource() == logbutton) {
			String userID = uid.getText();
			String password = String.valueOf(pass.getPassword()); 
			
			if(logininfo.containsKey(userID)) {
				if(logininfo.get(userID).equals(password)) {
					message.setForeground(Color.green);
					message.setText("Login successful");
					frame.dispose();
					home homepage = new home();
				}
				else {
					message.setForeground(Color.red);
					message.setText("incorrect password");
				}
			}
			else {
				message.setForeground(Color.red);
				message.setText("incorrect username");
			}
			
		}
		
	}
	

}
