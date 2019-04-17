package com.yangyongfeng.corejava;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = CalSum.calculateSum("    97 68 80 00 00 01 01 08 17 00 00 97 00 00 00 40 FE 0C");
		System.out.println(Integer.toHexString(sum));
		
		TextComponentFrame textComponentFrame = new TextComponentFrame();
		textComponentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textComponentFrame.setVisible(true);
	}

}
