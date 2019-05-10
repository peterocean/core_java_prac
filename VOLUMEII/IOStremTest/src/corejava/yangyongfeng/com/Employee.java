
package corejava.yangyongfeng.com;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	public final static int NAME_SIZE = 30;
	public final static int RECORD_SIZE = NAME_SIZE*2 + 8 + 4 + 4 + 4;
		
	public Employee() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, double salary, int year, int month, int dayOfMonth) {
		this.name = name;
		this.salary = salary;
		this.hireDay = LocalDate.of(year, month, dayOfMonth);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getHireDay() {
		return hireDay;
	}
	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}
	
	public String toString() {
		return "name:" + getName() + ", " 
				+ "salary:" + getSalary() + ", "
				+ "hireDay:" + getHireDay().toString();
	}
	
}
