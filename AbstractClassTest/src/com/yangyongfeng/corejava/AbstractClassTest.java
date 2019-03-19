package com.yangyongfeng.corejava;

public class AbstractClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people= new Person[2];
		
		people[0] = new Employee("Harry", 50000, 1999,1,1);
		people[1] = new Student("Maria","History");
		
		for (Person p:people) {
			System.out.println(p.getName() + "," + p.getDescription());
		}
	}

}
