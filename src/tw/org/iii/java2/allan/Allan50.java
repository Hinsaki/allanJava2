package tw.org.iii.java2.allan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Allan50 {

	public static void main(String[] args) {
		while(true){
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = 
				new DatagramSocket(8888);
			DatagramPacket packet = 
				new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			InetAddress url=packet.getAddress();
			byte[] massage=packet.getData();
			int len=packet.getLength();
			
			System.out.println(url.getHostAddress()+":"+new String(massage,0,len));
		} catch (Exception e) {
			System.out.println("fail");
		}
	}
	}

}
