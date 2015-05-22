package anambraState;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QueenOfTheRosaryCollege {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter your WAEC score ");
		String score = br.readLine();
		int declaredScore = Integer.parseInt(score);
	 
		
		if(declaredScore >=1 && declaredScore <=29){
			System.out.println("You have an F");
		}else if(declaredScore >=30 && declaredScore <=39){
			System.out.println("You have a E");
		}else if(declaredScore >= 40 && declaredScore <=49){
			System.out.println("You have a D");
		}else if(declaredScore >=50 && declaredScore<=59){
			System.out.println("You have an C");
		}else if(declaredScore >=60 && declaredScore <=69){
			System.out.println("You have a B");
		}else if(declaredScore >=70 && declaredScore <= 100){
			System.out.println("You have an A");
			System.out.println("Congrationlations");
			
			if(declaredScore >=90 && declaredScore<=100){
//				System.out.println("You have an A");
				System.out.println("You have done excellently well");
				System.out.print("You are qualified for a scholarship");
			}
		}else{
			System.out.print("Sorry you have no grade");
		}
				

		}
		
		
		
		
		

	}


