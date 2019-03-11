
public class MultiArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double STARTRATE = 10;
		final int NRATES = 6;
		final int NYEARS = 10;
		
		
		double[] interestRate = new double[NRATES];
		for (int i = 0; i <interestRate.length; i++) {
			interestRate[i] = (STARTRATE + i) / 100.0;
		}
		
		double[][] balances = new double[NYEARS][NRATES];
		
		for (int i = 0; i < balances[0].length; i++) {
			balances[0][i] = 10000;
		}
		
		//compute interest for future years
		for (int i = 1; i < balances.length; i++) {
			for (int j = 0; j < balances[i].length; j++) {
				double oldBalance = balances[i - 1][j];
				
				//compute interest
				double interest = oldBalance * interestRate[j];
				//compute this year's balance
				balances[i][j] = oldBalance + interest;
			}
		}
		
		//print one row interest rates
		for (int j = 0; j < interestRate.length; j++) {
			System.out.printf("%9.0f",100 * interestRate[j]);
		}
		System.out.println();
		
		for (double[] row:balances) {
			for (double b: row) {
				System.out.printf("%10.2f",b);
			}
			System.out.println();
		}
	}

}
