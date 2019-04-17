package com.yangyongfeng.corejava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.ensureCapacity(100);
		for (int i = 0; i < 100; i++) {
			staff.add(new Employee("Employee"+i,4000 + i*1000, 1999, 1,1 ));
		}
		
		for  (Iterator<Employee> s = staff.iterator(); s.hasNext();) {
			Employee temp = s.next();
			System.out.println("name = "+ temp.getName() 
					+ ",salary = "+ temp.getSalary()
					+"\n");
		}
		staff.ensureCapacity(100);
		
		if(staff.add(new Employee("Employee" + 100,5000, 2000,1,1)))
			System.out.println("num 100 Employee add success.");
		else
			System.out.println("num 100 Employee add fail!");
		System.out.println(staff.size());
		
		
		for (int i = 0; i < staff.size(); i++) {
			System.out.println("name = "+ staff.get(i).getName()
								+ ",salary = " + staff.get(i).getSalary());
		}
		
		for  (Iterator<Employee> s = staff.iterator(); s.hasNext();) {
			Employee temp = s.next();
			System.out.println("name = "+ temp.getName() 
					+ ",salary = "+ temp.getSalary()
					+"\n");
		}
	}
}
