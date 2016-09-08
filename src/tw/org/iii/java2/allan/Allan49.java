package tw.org.iii.java2.allan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Allan49 {

	public static void main(String[] args) throws UnknownHostException {
		String data ="可是我看不到人家打的內容耶";
		byte[] buf = data.getBytes();
		try {
			DatagramSocket socket = 
				new DatagramSocket();
			DatagramPacket packet =
				new DatagramPacket(buf, buf.length,
					InetAddress.getByName("10.1.6.83"),8888);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
