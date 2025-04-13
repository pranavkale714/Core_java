package Socket_Programming;

import java.io.*;
import java.net.*;

public class Echo_Server {

	public static void main(String[] args) {
		try {
			System.out.println("Waiting for connection");
			ServerSocket ss = new ServerSocket(9806);
			Socket soc = ss.accept();
			System.out.println("Connection established");

			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str = in.readLine();

			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println("Server says: " + str);

			soc.close();
			ss.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
