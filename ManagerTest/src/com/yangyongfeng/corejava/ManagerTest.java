package com.yangyongfeng.corejava;

public class ManagerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager boss = new Manager("Carl Craker",90000,1999,9,1);
		boss.setBonus(10000);
		
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("peter", 50000, 1998,12,1);
		staff[2] = new Employee("Bob", 40000, 2000, 1, 1);
		
		for (Employee e:staff) {
			System.out.println("name" + e.getName() + ",salary" + e.getSalary());
		}
	}

}
