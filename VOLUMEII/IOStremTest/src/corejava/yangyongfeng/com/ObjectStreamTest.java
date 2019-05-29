package corejava.yangyongfeng.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class ObjectStreamTest {

	public static void main(String[] args) {
		Employee harry = new Employee("Harry Hacker",50000,1989,10,1);
		
		Manager carl = new Manager("Carl Craker",80000,1987,12,15);
		carl.setSecretary(harry);
		
		Manager tony = new Manager("Tony Tester",40000,1990,3,15);
		tony.setSecretary(harry);
		
		Employee[] staff = new Employee[3];
		staff[0] = carl;
		staff[1] = harry;
		staff[2] = tony;
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employeeObj.dat")))
		{
			out.writeObject(staff);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("employeeObj.dat")))
		{
			Employee[] newstaff = (Employee[])in.readObject();
			newstaff[1].raiseSalary(10);
			for (Employee e: staff)
			{
				System.out.println(e);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
