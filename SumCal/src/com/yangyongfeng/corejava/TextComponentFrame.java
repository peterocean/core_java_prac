package com.yangyongfeng.corejava;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextComponentFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int TEXTAREA_ROWS  = 8;
	public static final int TEXTAREA_COLUMNS = 20;
	private int screenWidth = 300;
	private int  screenHeight = 200;
	
	public TextComponentFrame()
	{
		Toolkit kit = Toolkit.getDefaultToolkit();		/*设置默认尺寸*/
		Dimension screenSize = kit.getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeight = screenSize.height;
		
		setSize(screenWidth*3/4,screenHeight*3/4);
		setLocation((screenSize.width - screenWidth)/2, (screenSize.height - screenHeight)/2);
		
		JTextField textField = new JTextField(screenWidth * 3 /4);
		JButton calSumButton = new JButton("计算校验和");
		
		JPanel panel = new JPanel();
		panel.add(textField);
		panel.add(calSumButton);
		add(panel,BorderLayout.CENTER);
		pack();

	}
}
