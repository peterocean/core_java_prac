
public class ContructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[4];
		
		staff[0] = new Employee("carl", 10000, 2019, 3, 1);
		staff[1] = new Employee("peter", 11000);
		staff[2] = new Employee(12000);
		staff[3] = new Employee();
		
		for (Employee e: staff) {
			System.out.println("name:" + e.getName()
			+ ",salary:" + e.getSalary()
			+ ",id:" + e.getId());
		}
	}

}
 