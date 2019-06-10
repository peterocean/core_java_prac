
package KHJSON;

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
	public final static char hexTochar(int i)
	{
		char c = 0;
		
		c = (char)(i & 0x0f);
		if (c >= 0 && c <= 9)
			c = (char) (c + '0');
		else if (c >= 10 && c <= 16)
			c = (char) (c - 0x0A + 'A');
		else
			c = '0';
		return c;
	}
	
	public final static String hexToString(int i){
		
		char c = 0;
		StringBuilder sb  = new StringBuilder();
		
		c = hexTochar((i & 0xf0) >> 4);
		sb.append(c);
		
		c = hexTochar(i & 0x0f);
		sb.append(c);
		
		sb.append(" ");
		return sb.toString();
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
	
	public final static  String intArrayToHexString(int[] intArray) {
		StringBuilder sb = new StringBuilder(intArray.length*2);
		for(int i:intArray) {
			sb.append(hexToString(i));
		}
		return sb.toString();
	}
	
	public static int[] charArrayToIntArray(char[] ch) {
		int index = 0;
		int[] intArray = new int[ch.length];
		
		for (char c:ch) {
			intArray[index++] = (int)c;
		}
		return intArray;
	}
	
	public final static String charArrayToHexString(char[] ch) {
		int[] array = charArrayToIntArray(ch);
		return intArrayToHexString(array);
	}
	
	public final static String stringToHexString(String s) {
		
		char[] chArray = s.toCharArray();
		return charArrayToHexString(chArray);
	}
}
