package KHJSON;

public class KHJSON {
	public final static String JSONStringToHexString(String s) {
		
		String tempStr = s;
		
		tempStr  = tempStr.replaceAll("\n", "");		/*���˻س���*/
		tempStr  = tempStr.replaceAll("\r", "");		/*���˻��з�*/
		tempStr  = tempStr.replaceAll(" ", "");			/*���˿ո�*/
		tempStr  = tempStr.replaceAll("\t", "");		/*tab��*/
		return HexBuilder.stringToHexString(tempStr); 
	}
}
