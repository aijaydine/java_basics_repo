package tutuorialOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppliedConditionalStatement {

	public static void main(String[] args) throws IOException {
//		String FirstName = "Edwin";

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		 
		System.out.println("Select your browser choice: enter ie for internet explorer, ff for firefox, gc for google chrome: ");
		String browserChoice = br.readLine();
		
		if(browserChoice.equals("ie")){
			System.out.println("Test Running on the internet explorer...");
		}else if(browserChoice.equals("ff")){
			System.out.println("Test Running on the firefox...");
		}else if(browserChoice.equals("gc")){
			System.out.println("Test Running on the google chrome...");
		}else{
			System.out.println("There is no such browser");
		}
		
		
		
		
		
		


	}

}
