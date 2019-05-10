package corejava.yangyongfeng.com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ThreadEchoServer {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Socket[] inSocket = new Socket[10];
		
		try(ServerSocket s = new ServerSocket(8189))
		{
			int i = 0;
			while(true) {
				inSocket[i] = s.accept();
				System.out.println("Spawning" + i);
				Thread t = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try(InputStream inStream = inSocket[i].getInputStream();
							OutputStream outStream = inSocket[i].getOutputStream())
						{
							Scanner in = new Scanner(inStream,"UTF-8");
							PrintWriter out = new PrintWriter(new OutputStreamWriter(outStream,"UTF-8"),true);
							
							out.println("Hello! Enter BYE to exit!");
							
							//echo client input
							boolean done = false;
							while(!done && in.hasNextLine())
							{
								String line = in.nextLine();
								out.println("Echo: " +line);
								if (line.trim().equals("BYE")) {
									done = true;
								}
							}
						}catch(IOException e){
							e.printStackTrace();
						}
					}
				});
				t.start();
			}
		} 
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			for (Socket s:inSocket)
			{
				if (s != null)
				{
					s.close();
				}
			}
		}
	}

}
