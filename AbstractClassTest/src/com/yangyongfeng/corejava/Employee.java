package com.yangyongfeng.corejava;

import java.time.LocalDate;

public class Employee extends Person{
	private double salary;
	private LocalDate hireDay; 
	
	public Employee(String name, double salary, int year, int month, int day) {
		super(name);
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
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
	
	public void raisesSalary(double percent) {
		double raise = salary*percent /100;
		salary += raise;
	}
	
	public   String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}
}
