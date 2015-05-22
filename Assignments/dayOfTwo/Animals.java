package dayOfTwo;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Animals {

		
	 String name;
	 String animalColour;
	 int animalAge;
	 int animalLegs;
	// double animalWeight;
	// float animalSize;


//	public Animals(){
//		String animal = "dog";
//		String animalColour;
//		int animalAge;
//		int animalLegs;
//		double animalWeight;
//		float animalSize;
//		
//	}
	
	
	
	public Animals()throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter the animal name:");
		String name = br.readLine();
		this.name=name;
		
		
		System.out.println("Enter the animal colour:");
		String colour = br.readLine();
		this.animalColour=colour;
		

		System.out.println("Enter the animal age:");
		String animal = br.readLine();
		int animalAge = Integer.parseInt(animal);
		this.animalAge=animalAge;
		
		
		System.out.println("Enter the animal legs:");
		String legs = br.readLine();
		int animalLegs = Integer.parseInt(legs);
		this.animalLegs=animalLegs;
		
		
	}
	
	
	
	
	  public void walk(){
		  
	    	System.out.println(name+" loves to walk ");
	    	System.out.println(animalColour+" is beautiful");
	    }
	  
	    
	    public void eat(){
	    	System.out.println( name + " loves to eat");
	    }
	    
	    public void run(){
	    	System.out.println( name +" loves to run");
	    	System.out.println(name+"is young at"+animalAge); 
	    }
	    
	    public void sleep(){
	    	System.out.println( name +" loves to sleep");
	  
	    }
	    
	    public void cry(){
	    	System.out.println( name +" don't cry");
	    }
	
	

}
