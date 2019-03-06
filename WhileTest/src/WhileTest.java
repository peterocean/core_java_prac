import java.util.*;
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you want to retire? ");
		double gogal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		
		System.out.println("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		while (balance < gogal) {
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			year++;
		}
		System.out.println("You can retire in " + year + "years");
	}

}
