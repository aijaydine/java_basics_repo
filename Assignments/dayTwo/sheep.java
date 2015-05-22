package dayTwo;

public class sheep {
	
	public String sheepName;
	public String sheepColour;
	public int sheepAge;
	public int sheepLegs;
	public double sheepWeight;
	public float sheepSize;


	public sheep(){
		sheepName= "Fatty";
		sheepColour= "Black";
		sheepAge= 2;
		sheepLegs= 4;
		sheepWeight= 2.0;
		sheepSize= 1;
		
	}


    public void walk(){
    	System.out.println("A sheep loves to walk with his" + sheepLegs);
    }
    
    public void eat(){
    	System.out.println("sheep love to eat");
    }
    
    public void run(){
    	System.out.println("A sheep loves to run");
    }
    
    public void sleep(){
    	System.out.println("sheep loves to sleep");
  
    }
    
    public void cry(){
    	System.out.println("sheep don't cry");
    }
    
    

}
