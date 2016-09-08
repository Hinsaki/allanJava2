package tw.org.iii.java2.allan;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Allan55 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.1.6.52/add.php?cname=123&tel=123&birthday=2016-02-03");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			conn.getInputStream();
			System.out.println("OK");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
