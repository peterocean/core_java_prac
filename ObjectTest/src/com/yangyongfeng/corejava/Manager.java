package com.yangyongfeng.corejava;

import java.util.Objects;

public class Manager extends Employee {
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name,salary,year,month,day);
		bonus = 0;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public double getSalary() {
		double baseSalary= super.getSalary();
		return baseSalary + bonus;
	}
	
	public boolean equals(Object otherObject) {
		if(!super.equals(otherObject))
			return false;
		
		Manager other = (Manager)otherObject;
		return this.getBonus() == other.getBonus();
	}
	
	public String toString() {
		return super.toString()
				+ "[ "
				+ "bonus = " + this.getBonus()
				+ "] ";
	}
}
