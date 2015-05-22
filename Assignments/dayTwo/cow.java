package dayTwo;

public class cow {
	public String cowName;
	public String cowColour;
	public int cowAge;
	public int cowLegs;
	public double cowWeight;
	public float cowSize;


	public cow(){
		cowName= "Fatty";
		cowColour= "Black";
		cowAge= 2;
		cowLegs= 4;
		cowWeight= 2.0;
		cowSize= 1;
		
	}


    public void walk(){
    	System.out.println("A cow loves to walk with his" + cowLegs);
    }
    
    public void eat(){
    	System.out.println("cow love to eat");
    }
    
    public void run(){
    	System.out.println("A cow loves to run");
    }
    
    public void sleep(){
    	System.out.println("cow loves to sleep");
  
    }
    
    public void cry(){
    	System.out.println("cow don't cry");
    }
    
    
	
	
	
	
	
	
	
	
}
