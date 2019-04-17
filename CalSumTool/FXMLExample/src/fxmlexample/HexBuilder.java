
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
		
		strTemp = strTemp.replaceAll(" ", "");		/*���˿ո� ���ţ�����ǰ׺*/
		strTemp = strTemp.replaceAll(",", "");		/*���˶��ţ�����ǰ׺*/
		strTemp = strTemp.replaceAll("0x", "");		/*����16����ǰ׺*/
		strTemp = strTemp.replaceAll("0X", "");		/*����16����ǰ׺*/
		strTemp = strTemp.replaceAll("\n", "");		/*���˻��з�*/
		strTemp = strTemp.replaceAll("\r", "");		/*���˻س���*/
		
		if (strTemp.length() % 2 != 0)
			return null;
		int[] arrayTemp = new int[strTemp.length()/2];
		
		for (int index = 0; index < strTemp.length()/2; index++) {
			arrayTemp[index] = (charToHex(strTemp.charAt(index*2)) << 4) | charToHex(strTemp.charAt(index*2+1));
		}
		return arrayTemp;
	}
	
}
