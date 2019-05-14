package corejava.yangyongfeng.com;

import java.time.LocalDate;
import java.util.Scanner;

public class IOStreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		System.out.println("Please input Employee name:");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		
		System.out.println("Please input Employee salary:");
		double salary = in.nextDouble();
		
		System.out.println("Please input Employee hireday yymmdd:");
		int year = in.nextInt();
		int month = in.nextInt();
		int dayOfMonth = in.nextInt();
	
		e.setName(name);
		e.setSalary(salary);
		e.setHireDay(LocalDate.of(year, month, dayOfMonth));
		System.out.println(e);
	}

}
