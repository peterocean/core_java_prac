package corejava.yangyongfeng.com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.ServerCloneException;
import java.util.Scanner;

public class EchoServer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		try (ServerSocket s = new ServerSocket(8189))
		{
			try(Socket inSocket = s.accept())
			{
				InputStream inStream = inSocket.getInputStream();
				OutputStream outStream = inSocket.getOutputStream();
				
				try(Scanner in = new Scanner(inStream,"UTF-8"))
				{
					PrintWriter out = new PrintWriter(new OutputStreamWriter(outStream, "UTF-8"),true);
					out.println("Hello! Enter BYE to exit.");	
					boolean done = false;
					while( !done && in.hasNextLine())
					{
						String line = in.nextLine();
						out.println("Echo:" + line);
						if (line.trim().equals("BYE"))
							done = true;
					}
				}
				inSocket.close();
			}
		}
	}
		

}
