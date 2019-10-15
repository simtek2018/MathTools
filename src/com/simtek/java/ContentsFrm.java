package com.simtek.java;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

public class ContentsFrm extends JFrame implements ActionListener {
	private AddNumFrm addNumFrm;
	private JButton addNumBtn;
	
	
	public ContentsFrm() {
		// Create Panels
		Container c = getContentPane();
		JPanel northPnl = new JPanel();
		JPanel centerPnl = new JPanel();
		EtchedBorder brdr = new EtchedBorder();
		northPnl.setBorder(brdr);
		centerPnl.setBorder(brdr);
		
		
		// Create UI Components
		addNumBtn = new JButton("Add Numbers");
		
		
		// Add Listeners
		addNumBtn.addActionListener(this);
		
		// Add components to panels
		centerPnl.add(addNumBtn);
		c.add(northPnl, BorderLayout.NORTH);
		c.add(centerPnl, BorderLayout.CENTER);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ContentsFrm();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == addNumBtn) {
			System.out.println("Add Numbers!!");
			if (addNumFrm == null) {
				addNumFrm = new AddNumFrm();
			} 
			addNumFrm.setVisible(true);
		}
		
	}

}
