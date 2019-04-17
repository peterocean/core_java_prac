
package fxmlexample;

public class HexBuilder {
	
	public static int charToHex(char ch) {
		int temp = 0;
		if (ch >= '0' && ch <= '9') {
			temp = ch - '0';
		} else if (ch >= 'A' && ch <= 'F'){
			temp = ch - 'A' + 0x0A;
		} else if (ch >= 'a' && ch <= 'f') {
			temp = ch - 'a' + 0x0A;
		} else {
			temp = 0;
		}
		return temp;
	}

	public static int[] hexStringToArray(String s) {
		String strTemp = s;
		
		strTemp = strTemp.replaceAll(" ", "");		/*过滤空格， 逗号，数字前缀*/
		strTemp = strTemp.replaceAll(",", "");		/*过滤逗号，数字前缀*/
		strTemp = strTemp.replaceAll("0x", "");		/*过滤16进制前缀*/
		strTemp = strTemp.replaceAll("0X", "");		/*过滤16进制前缀*/
		strTemp = strTemp.replaceAll("\n", "");		/*过滤换行符*/
		strTemp = strTemp.replaceAll("\r", "");		/*过滤回车符*/
		
		if (strTemp.length() % 2 != 0)
			return null;
		int[] arrayTemp = new int[strTemp.length()/2];
		
		for (int index = 0; index < strTemp.length()/2; index++) {
			arrayTemp[index] = (charToHex(strTemp.charAt(index*2)) << 4) | charToHex(strTemp.charAt(index*2+1));
		}
		return arrayTemp;
	}
	
}
