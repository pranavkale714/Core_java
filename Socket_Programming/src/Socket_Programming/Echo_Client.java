package Socket_Programming;

import java.io.*;
import java.net.*;

public class Echo_Client {
	public static void main(String[] args) {
		try {
			Socket soc = new Socket("localhost", 9806);

			BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter a string:");
			String str = userInput.readLine();

			PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
			out.println(str);

			BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String response = in.readLine();
			System.out.println("Server replied: " + response);

			soc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
