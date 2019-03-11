package com.yangyongfeng.corejava;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[4];

		staff[0] = new Employee("peter", 1000, 2019, 3, 11);

		for (Employee e : staff) {
			if (e != null) {
				System.out.println("name:" + e.getName() + ",salary:" + e.getSalary() + ",hireDay:" + e.getHireDay());
			}
		}
	}

}
