package com.zesware.swing;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTabTest extends JFrame{
	
	ImageIcon imageIcon, tabIcon;
	JLabel jLable;
	
	JPanel jPanel;
	JTextField jTextField;
	JButton jBtn1, jBtn2;
	
	JTextArea jTextArea;
	JTabbedPane jTabbedPane;
	
	public JTabTest() {
		imageIcon = new ImageIcon("palisade.jpg");
		jLable = new JLabel(imageIcon);		//1
		
		tabIcon = new ImageIcon("palisade2.jpg");	//3
		
		jPanel = new JPanel();						//3
		jTextField = new JTextField("제이텍스트필드임");
		jBtn1 = new JButton("제이버튼임");
		
		jPanel.add(jTextField);
		jPanel.add(jBtn1);
		
		jTextArea = new JTextArea(7,20);	//2
		jTextArea.setText("내용을 입력해 주세요!");
		
		jTabbedPane = new JTabbedPane();
		jTabbedPane.add("탭1", jLable);
		jTabbedPane.add("탭2", new JPanel().add(jTextArea));
		jTabbedPane.addTab("탭3",tabIcon,jPanel,"세번째 탭입니당!" );
		
		add(jTabbedPane);
		
		setBounds(0, 0, 400, 400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JTabTest();

	}

}

















