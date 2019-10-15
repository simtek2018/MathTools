package com.simtek.java;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class AddNumFrm extends JFrame {
	private JButton addBtn;
	private JTextField num1Tf;
	private JTextField num2Tf;
	
	public AddNumFrm() {
		Container c = getContentPane();
		JPanel centerPnl = new JPanel();
		JPanel southPnl = new JPanel();
		JPanel num1Pnl = new JPanel();
		JPanel num2Pnl = new JPanel();
		EtchedBorder brdr = new EtchedBorder();
		centerPnl.setBorder(brdr);
		southPnl.setBorder(brdr);
		num1Pnl.setBorder(brdr);
		num2Pnl.setBorder(brdr);
		
		JLabel num1Lbl = new JLabel("1st Num:");
		JLabel num2Lbl = new JLabel("2nd Num:");
		num1Tf = new JTextField(10);
		num2Tf = new JTextField(10);
		addBtn = new JButton("Add");
		
		num1Pnl.add(num1Lbl);
		num1Pnl.add(num1Tf);
		num2Pnl.add(num2Lbl);
		num2Pnl.add(num2Tf);
	
	    centerPnl.add(num1Pnl);
	    centerPnl.add(num2Pnl);
	    southPnl.add(addBtn);
	
		c.add(centerPnl, BorderLayout.CENTER);
		c.add(southPnl, BorderLayout.SOUTH);
		
		
		setSize(300, 300);
		setVisible(true);
	}

}
