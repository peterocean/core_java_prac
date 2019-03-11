
public class ParamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Employee[] staff = new Employee[3];
				
				staff[0] = new Employee("Carl", 10000, 2019, 3, 11);
				staff[1] = new Employee("Harry", 11000, 2019, 3, 12);
				staff[2] = new Employee("Carl", 12000, 2019, 3, 13);
				
				for (Employee e:staff) {
					System.out.println("name:" + e.getName() 
					+ ",ID:" + e.getId()
					+ ",salary:" + e.getSalary() 
					+ ",hireDay:" + e.getHireDay());
					
				}
				
				int n = Employee.getNextId();
				System.out.println("Next available id=" + n);
				
				for(Employee e : staff) {
					e.raiseSalary(e,10);
				}
				for (Employee e:staff) {
					System.out.println("name:" + e.getName() 
					+ ",ID:" + e.getId()
					+ ",salary:" + e.getSalary() 
					+ ",hireDay:" + e.getHireDay());
					
				}
				
				Employee.swap(staff[0], staff[1]);
				for (Employee e:staff) {
					System.out.println("name:" + e.getName() 
					+ ",ID:" + e.getId()
					+ ",salary:" + e.getSalary() 
					+ ",hireDay:" + e.getHireDay());
					
				}
				
				Employee.swapName(staff[0], staff[1]);
				for (Employee e:staff) {
					System.out.println("name:" + e.getName() 
					+ ",ID:" + e.getId()
					+ ",salary:" + e.getSalary() 
					+ ",hireDay:" + e.getHireDay());
					
				}
	}

}
