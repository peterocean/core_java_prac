package KHJSON;

public class KHJSON {
	public final static String JSONStringToHexString(String s) {
		
		String tempStr = s;
		
		tempStr  = tempStr.replaceAll("\n", "");		/*过滤回车符*/
		tempStr  = tempStr.replaceAll("\r", "");		/*过滤换行符*/
		tempStr  = tempStr.replaceAll(" ", "");			/*过滤空格*/
		tempStr  = tempStr.replaceAll("\t", "");		/*tab键*/
		return HexBuilder.stringToHexString(tempStr); 
	}
}
