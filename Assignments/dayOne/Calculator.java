package dayOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Calculator {
	int x = 9;
	int y = 5;
	String firstResult;
	String name;
	
		public Calculator() throws IOException{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			
			System.out.println("Enter your first number :");
			String firstResult = br.readLine();
			this.firstResult = firstResult;
			int x = Integer.parseInt(firstResult);
			this.x = x;
			
			System.out.println("Enter your second number :");
			String secondResult = br.readLine();
			int y = Integer.parseInt(secondResult);
			this.y = y;
		}
	

		
	
		public void add(){
			System.out.println(firstResult);
			int answer = x+y;
			System.out.println(answer);
			
		}
		
		public void subtract(){
			int answer = x-y;
			System.out.println(answer);
			String name = "Edwin";
			this.name = name;
		}
		
		public void multiply(){
			int answer = x*y;
			System.out.println(answer);
			System.out.println(name);
		}
		
		public void division(){
			int answer = x/y;
			System.out.println(answer);
		}
		
		public void remainder(){
			int answer = x%y;
			System.out.println(answer);
		}
		
		
		
		
		
		

	
	
}
