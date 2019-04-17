package com.yangyongfeng.corejava;

public class CalSum {
	

	public static  int calculateSum(String s) {
		int sum = 0;
		String str = s;
		
		int [] arrayTemp = HexBuilder.hexStringToArray(str);
		
		for (int index = 0; index < arrayTemp.length; index++) {
			sum += arrayTemp[index];
		}
		sum &= 0xff;
		return sum;
	}
}
