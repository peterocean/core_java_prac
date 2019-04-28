package corejava.yangyongfeng.com;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private double salary;
	PUBL LocalDate hireDay;
	
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
	
	
}
