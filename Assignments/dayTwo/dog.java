package dayTwo;

public class dog {
	
	public String dogName;
	public String dogColour;
	public int dogAge;
	public int dogLegs;
	public double dogWeight;
	public float dogSize;


	public dog(){
		dogName= "Fatty";
		dogColour= "Black";
		dogAge= 2;
		dogLegs= 4;
		dogWeight= 2.0;
		dogSize= 1;
		
	}


    public void walk(){
    	System.out.println("A dog loves to walk with his" + dogLegs);
    	
    }
    
    public void eat(){
    	System.out.println("Dogs love to eat");
    }
    
    public void run(){
    	System.out.println("A dog loves to run");
    }
    
    public void sleep(){
    	System.out.println("Dogs loves to sleep");
  
    }
    
    public void cry(){
    	System.out.println("Dogs don't cry");
    }
    
    
    
}
    
    
   
