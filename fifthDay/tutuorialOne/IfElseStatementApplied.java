package tutuorialOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseStatementApplied {
	
	/*Write a program that will ask a student for his/her score and 
	 * tell them what grade they have achieved in particular course
	 */

	public static void main(String[] args) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		 
		System.out.println("Enter your score: ");
		String score = br.readLine();
		int convertedScore = Integer.parseInt(score);
		
		if(convertedScore >= 0 && convertedScore <=49){
			System.out.println("You failed the exam with F grade!");
		}else if(convertedScore >=50 && convertedScore <=59){
			System.out.println("You passed the exam with D");
		}else if(convertedScore >=60 && convertedScore <= 69){
			System.out.println("You passed the exam with B");
		}else if(convertedScore>=70 && convertedScore <=100){
			System.out.println("You passed the exam with an Alpha");
			if(convertedScore >= 90 && convertedScore<=100){
				System.out.println("And also won a scholarship from the F. Govt");
			}else{
				System.out.println("But you don't have a scholarship");
			}
		}else{
			System.out.println("The score does not exist");
		}
		
	}

}
