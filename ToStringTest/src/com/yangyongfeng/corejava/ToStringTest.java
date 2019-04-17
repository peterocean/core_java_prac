package com.yangyongfeng.corejava;

public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] person = new Person[2];
		
		person[0] = new Employee("Barry",50000,1999,2,2);
		person[1] = new Manager("Peter",60000,2000,1,1);
		
		for (Person p:person) {
			System.out.println(p.toString());
		}
		
	}

}
