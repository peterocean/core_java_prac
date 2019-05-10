package corejava.yangyongfeng.com;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class VisitingDirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path path = Paths.get("D:\\company_work\\learn\\java");
		
		try(DirectoryStream<Path> entries =  Files.newDirectoryStream(path))
		{
			for (Path entry : entries)
				System.out.println(entry.toString());
		}
	}

}
