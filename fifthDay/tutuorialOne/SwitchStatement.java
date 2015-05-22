package tutuorialOne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchStatement {

	public static void main(String[] args) throws IOException {

//		InputStreamReader is = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(is);
//		 
//		System.out.println("Enter your score: ");
//		String score = br.readLine();
//		int convertedScore = Integer.parseInt(score);
		char convertedScore = 'F';
		
		switch(convertedScore){
			case 'A':
				System.out.println("This is the letter A");
				break;
			case 'B': 
				System.out.println("This is letter B");
				break;
			case 'C':
				System.out.println("This is letter C");
				break;
			case 'D':
				System.out.println("This is number D");
				break;
			case 'E':
				System.out.println("This is number E");
				break;
			default:
				System.out.println("This number does not exist");
				break;
		}

	}

}
