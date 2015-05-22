package tutuorialOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UsingInputReader {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader scan = new BufferedReader(isr);
		
		System.out.println("Enter your name: ");
		String name = scan.readLine();
		System.out.println("Enter your email address: ");
		String email = scan.readLine();
		
		
		System.out.println(name + " " + email);
		
		

	}

}
