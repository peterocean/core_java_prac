package corejava.yangyongfeng.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkFileTest {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		try(PrintWriter out = new PrintWriter("D:\\company_work\\learn\\java\\core_java_prac\\VOLUMEII\\WorkFile\\employee.txt","UTF-8"))
		{
			out.print("test");
		}
		Path workRelative = Paths.get("D:\\\\company_work\\\\learn\\\\java\\\\core_java_prac\\\\VOLUMEII\\\\WorkFile\\\\employee.txt","employee.txt");
		System.out.println(workRelative.toString());
		Path path = workRelative.getRoot();
		if(path != null)
			System.out.println(workRelative.getRoot().toString());
		Path relative = Paths.get("myprot", "conf","user.properties");
		System.out.println(relative.toString());
		
		Path p = Paths.get("\\home", "fred","myprog.properties");
		System.out.println(p.toString());
		Path parent = p.getParent();
		System.out.println(parent.toString());
		Path file = p.getFileName();
		System.out.println(file.toString());
		Path root = p.getRoot();
		System.out.println(root.toString());
	}

}
