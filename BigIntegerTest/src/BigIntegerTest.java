import java.util.*;
import java.math.*;

public class BigIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		System.out.println("How many numbers do you need to draw? ");
		int k = in.nextInt();
		
		System.out.println("What is the highest number you can drwa? ");
		int n = in.nextInt();
		
		BigInteger lotterOdds = BigInteger.valueOf(1);
		for (int i = 1; i <= k; i++) {
			lotterOdds = lotterOdds.multiply(BigInteger.valueOf(n-i+1)).divide(BigInteger.valueOf(i));
		}
		System.out.println("You odss are 1 in " + lotterOdds + ". Good luck!");
	}

}
