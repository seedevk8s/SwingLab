package com.zesware.swing;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameTest extends JFrame{
	
	public JFrameTest() {
		super("JFrame �׽�Ʈ��!");
		
		JButton btn1 = new JButton("�߰�");
		JButton btn2 = new JButton("����");
		JTextField tf1 = new JTextField("JFrame �׽�Ʈ");
		
		Container container = this.getContentPane();
		container.add(btn1, "North");
		container.add(btn2, "Center");
		container.add(tf1, "South");
		
		setSize(400, 600);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JFrameTest();

	}

}



















