package corejava.yangyongfeng.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class TextFileSave {

	public static Employee readEmploy(Scanner in) {
		String line = in.nextLine();
		String[] tokens = line.split(",");
		if (tokens == null) 
			return null;
		String name = tokens[0];
		double salary = Double.parseDouble(tokens[1]);
		LocalDate hireDay = LocalDate.parse(tokens[2]);
		int year = hireDay.getYear();
		int month = hireDay.getMonthValue();
		int dayOfMonth = hireDay.getDayOfMonth();
		return new Employee(name,salary,year,month,dayOfMonth);
	}
	
	public static void writeEmployeeData(Employee employee, PrintWriter out)
	{
		out.println(employee.getName() + "|" + employee.getSalary() + "|" + employee.getHireDay().toString());
		return;
	}
	
	public static void main(String[] args) {
		Employee employee = readEmploy(new Scanner(System.in));
		try(PrintWriter out = new PrintWriter("employee.txt","UTF-8")) {
			writeEmployeeData(employee, out);
		}catch (IOException  e) {
			e.printStackTrace();
		}
	}

}
