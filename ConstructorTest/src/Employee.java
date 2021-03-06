import java.time.LocalDate;
import java.util.Random;

public class Employee {
	private static int nextId;
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	private int id;

	static 
	{
		Random generator  = new Random();
		nextId = generator.nextInt(10000);
	}
	{
		id = nextId;
		nextId++;
	}
	
	public Employee(String name, double salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
		id = nextId;
		nextId++;
	}
	
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(double salary) {
		this("Employee #" + nextId,salary);

	}
	
	public Employee() {
		this("Employee #" + nextId,0);
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public int getId() {
		return id;
	}

	public static int getNextId() {
		return nextId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setHireDay(LocalDate hireDay) {
		this.hireDay = hireDay;
	}

	public void raiseSalary(double percent) {
		double raise = salary * percent / 100;
		this.salary += raise;
	}
}
