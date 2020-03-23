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
		jTextField = new JTextField("�����ؽ�Ʈ�ʵ���");
		jBtn1 = new JButton("���̹�ư��");
		
		jPanel.add(jTextField);
		jPanel.add(jBtn1);
		
		jTextArea = new JTextArea(7,20);	//2
		jTextArea.setText("������ �Է��� �ּ���!");
		
		jTabbedPane = new JTabbedPane();
		jTabbedPane.add("��1", jLable);
		jTabbedPane.add("��2", new JPanel().add(jTextArea));
		jTabbedPane.addTab("��3",tabIcon,jPanel,"����° ���Դϴ�!" );
		
		add(jTabbedPane);
		
		setBounds(0, 0, 400, 400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JTabTest();

	}

}

















