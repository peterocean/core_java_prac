package corejava.yangyongfeng.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class RandomAccessTest {
	public static void main(String[] args) throws IOException
	{
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Carl", 75000, 1987, 12, 15);
		staff[1] = new Employee("Harry", 50000, 1989, 10, 1);
		staff[2] = new Employee("Tony", 40000, 1990, 3, 15);
		
		try(PrintWriter out = new PrintWriter("employee.txt","UTF-8"))
		{
			writeData(staff,out);
		}
		
		try(Scanner in = new Scanner(new FileInputStream("employee.txt"),"UTF-8"))
		{
			Employee[] newStaff = readData(in);
			for (Employee e:newStaff) {
				System.out.println(e);
			}
		}
	}
	
	public static void writeData(Employee[] employees,PrintWriter out  ) throws IOException
	{
		out.println(employees.length); 
		for (Employee e:employees) {
			writeEmployee(out, e);
		}
	}
	
	public static Employee[] readData(Scanner in) {
		int n = in.nextInt();
		in.nextLine();
		
		Employee[] employees = new Employee[n];
		for (int i = 0; i < n; i++) {
			employees[i] = readEmployee(in);
		}
		return employees;
	}
	
	public static void writeEmployee(PrintWriter out, Employee e) {
		out.println(e.getName() + "|" + e.getSalary() + "|" + e.getHireDay());
	}
	
	public static Employee readEmployee(Scanner in) {
		String line = in.nextLine();
		String[] tokens = line.split("\\|");
		String name = tokens[0];
		double salary = Double.parseDouble(tokens[1]);
		LocalDate hireDay = LocalDate.parse(tokens[2]);
		int year = hireDay.getDayOfYear();
		int month = hireDay.getMonthValue();
		int dayOfMonth = hireDay.getDayOfMonth();
		
		return new Employee(name,salary,year,month,dayOfMonth);
	}
}
