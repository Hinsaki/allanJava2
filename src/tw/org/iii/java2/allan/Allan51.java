package tw.org.iii.java2.allan;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Allan51 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			File sendFile = new File("dir2/GINHOW.jpg");
			byte[] buf = new byte[(int)sendFile.length()];
			FileInputStream fin = 
					new FileInputStream(sendFile);
			fin.read(buf);
			fin.close();
			
			
			Socket socket = new Socket(
				InetAddress.getByName("10.1.6.91"), 999);
			
			OutputStream out = socket.getOutputStream();
			out.write(buf);
			out.flush();
			out.close();
			
			socket.close();
			System.out.println(System.currentTimeMillis()-start);
			System.out.println("Send OK!");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}

}
