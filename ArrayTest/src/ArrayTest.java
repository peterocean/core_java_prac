import java.util.Arrays;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] smallPrimes = {2,3,5,7,11,13};
		int[] luckyNumbers = smallPrimes;
		
		for (int elem:smallPrimes) {
			System.out.println(elem);
		}
		System.out.println("\n");
		
		luckyNumbers[2] = 6;
		for (int elem:smallPrimes) {
			System.out.println(elem);
		}
		
		int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);
		copiedLuckyNumbers[2] = 10;
		System.out.println("copiedLuckyNumbers value:");
		System.out.println(Arrays.toString(copiedLuckyNumbers));
		
		System.out.println("luckyNumbers value:");
		System.out.println(Arrays.toString(luckyNumbers));
	}

}
