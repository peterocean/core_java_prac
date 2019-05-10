package corejava.yangyongfeng.com;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InetAddress[] address = InetAddress.getAllByName("www.baidu.com");
		for (InetAddress a :address) {
			System.out.println(a);
		}
		InetAddress localHostAddress = InetAddress.getLocalHost();
		System.out.println(localHostAddress);
	}

}
