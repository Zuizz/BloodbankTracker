package com.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Nhospitals implements ActionListener{
	JFrame frame = new JFrame();
	JLabel back = new JLabel("⬅️");
	int fontsize = 24;
	String[] dybl = {"A" ,"A+", "B", "B+"};
	JLabel dydist = new JLabel("Distance: 500m");
	JLabel terdist = new JLabel("Distance: 5km");
	JLabel seadist = new JLabel("Distance: = 7km");
	
	JLabel dy = new JLabel("<html>"+"Dy Patil Hospital"+"<br>"+"Available"+"<br>"+"Types: "+"A A+ B B+"+"<br>"+"Distance: 500m"+"</html>");
	JLabel ter = new JLabel("<html>"+"Terna Hospital"+"<br>"+"Available"+"<br>"+"Types: A  B O O-"+"<br>"+"Distance: 5km"+"</html>");
	JLabel sea = new JLabel("<html>"+"Seawoods Hospital"+"<br>"+"Not Available"+"<br>"+"Types: NA"+"<br>"+"Distance: = 7km "+"</html>");
	JPanel redpan = new JPanel();
	
	Font font = new Font("Serif",Font.PLAIN,18);
	
	JPanel pan = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	JButton checkbutton = new JButton("Request");
	JButton checkbutton1 = new JButton("Request");
	JButton Notify = new JButton("Notify Me!"); 
	JLabel available = new JLabel("available");
	JLabel types = new JLabel("A,A+,B,O");
	
	
	Nhospitals(){
		
		dy.setFont(font);
		ter.setFont(font);
		sea.setFont(font);
		
		back.setForeground(Color.WHITE);
		back.setBounds(5,5,50,420);
		back.setFont(new Font("Serif",Font.PLAIN,32));
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked (MouseEvent e) {
				if(e.getSource() == back) {
					frame.dispose();
					home ho = new home();
				}
			}
		});
		
		
		redpan.add(back);
		
		//dy.setBorder(BorderFactory.createLineBorder(Color.black));
		dy.setBounds(5,3, 140, 120);
		checkbutton.setBackground(Color.red);
		checkbutton.setForeground(Color.white);
		checkbutton.addActionListener(this);
		
		checkbutton.setBounds(400,40,90,30);
		pan.setBounds(80,6,570,120);
		pan.setLayout(null);
		pan.add(checkbutton);
		pan.setBorder(BorderFactory.createLineBorder(Color.black));
		
		//nextpan
		
		checkbutton1.addActionListener(this);
		
		checkbutton1.setBackground(Color.red);
		checkbutton1.setForeground(Color.white);
		checkbutton1.setBounds(400,40,90,30);
		ter.setBounds(5,3, 140, 120);
		pan2.setBounds(80, 134, 570, 120);
		pan2.setLayout(null);
		pan2.add(ter);
		pan2.add(checkbutton1);
		pan2.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		Notify.setBackground(Color.red);
		Notify.setForeground(Color.white);
		Notify.setBounds(400,40,90,30);
		pan3.add(Notify);
		sea.setBounds(5,3, 140, 120);
		pan3.setBounds(80, 262, 570, 120);
		pan3.setLayout(null);
		
		pan3.add(sea);
		Notify.addActionListener(this);
		pan3.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		
		frame.add(pan3);
		frame.add(pan2);
		pan.add(dy);
		frame.add(pan);
		frame.add(redpan);
		redpan.setBounds(0,0,78,620);
		redpan.setBackground(new Color(123, 6, 8));
		frame.setSize(620,620);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);		
}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == Notify) {
			String type = JOptionPane.showInputDialog(frame,"Enter your requied blood type.");
			JOptionPane.showMessageDialog(frame, "You'll be notified when blood type "+type +" is available!!");
		}
		if(e.getSource() == checkbutton) {
			int choice = JOptionPane.showOptionDialog(frame, "Choose Blood type","Blood Groups",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,dybl,dybl[0]);
			JOptionPane.showMessageDialog(frame, "Request for Blood Type "+ dybl[choice]+" Has sent to the hospital");
		}
		if(e.getSource() == checkbutton1) {
			int choice = JOptionPane.showOptionDialog(frame, "Choose Blood type","Blood Groups",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,dybl,dybl[0]);
			JOptionPane.showMessageDialog(frame, "Request for Blood Type "+ dybl[choice]+" Has sent to the hospital");
		}
	
	}
	


	
	
}