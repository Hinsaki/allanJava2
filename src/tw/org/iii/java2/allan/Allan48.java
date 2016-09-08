package tw.org.iii.java2.allan;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Allan48 {

	public static void main(String[] args) {
		try {
			InetAddress IP = InetAddress.getByName("www.microsoft.com");
			System.out.println(IP.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println("UnknownHost");
		}

	}

}
