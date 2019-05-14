package corejava.yangyongfeng.com;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.Scanner;

public class FileInputTest {
	
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
	public static void WriteEmploy(Employee employee, DataOutputStream out) {
		try {
			out.writeChars(employee.getName());
			out.writeDouble(employee.getSalary());
			out.writeInt(employee.getHireDay().getYear());
			out.writeInt(employee.getHireDay().getMonthValue());
			out.writeInt(employee.getHireDay().getDayOfMonth());
		}catch(IOException  e){
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Employee employee = readEmploy(in);
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream("testfile"));
			WriteEmploy(employee, out);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
