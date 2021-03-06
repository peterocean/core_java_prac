import java.time.LocalDate;

public class Employee {
	
	private String name;
	private double salary;
	private LocalDate hireDay;
	private static int nextId = 1;
	private int id ;
	
	public Employee(String name, double salary,int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDay = LocalDate.of(year, month, day);
		id = nextId;
		nextId++;
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
		double raise = salary*percent/100;
		this.salary += raise;
	}
	
	
}
