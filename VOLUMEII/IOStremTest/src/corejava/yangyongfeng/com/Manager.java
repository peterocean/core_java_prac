package corejava.yangyongfeng.com;

public class Manager extends Employee {
	private double bonus;
	private Employee secretary;
	
	public Manager(String name, double salary, int year, int month, int dayOfMonth)
	{
		super(name,salary,year,month,dayOfMonth);
		this.bonus = 0;
	}
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {
		double baseSalary = super.getSalary();
		return baseSalary + bonus;
	}
	
	public void setSecretary(Employee e) {
		this.secretary = e;
	}
	
	public Employee  getSecretary() {
		return secretary;
	}
}
