package fxmlexample;

public class CalSum {
	

	public static  String calculateSum(String s) {
		int sum = 0;
		String str = s;
		
		int [] arrayTemp = HexBuilder.hexStringToArray(str);
		
		if (arrayTemp == null)
			return null;
		for (int index = 0; index < arrayTemp.length; index++) {
			sum += arrayTemp[index];
		}
		sum &= 0xff;
		String temp = Integer.toHexString(sum);
		if (temp.length() < 2)
			return "0"+ temp;
		else
			return temp;
	}
}
