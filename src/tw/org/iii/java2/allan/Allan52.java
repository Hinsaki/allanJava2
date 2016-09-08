package tw.org.iii.java2.allan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Allan52 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(999);
			Socket socket = server.accept();
			FileOutputStream fout = new FileOutputStream("upload/brad.jpg");
			InputStream in = socket.getInputStream();
			int c;
			while ((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();

			fout.flush();
			fout.close();

			socket.close();
			System.out.println("Receive OK!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}