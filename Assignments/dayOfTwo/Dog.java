package dayOfTwo;

public class Dog {
	private String dogName ;
	private int legs;
	
	
	
	public Dog(String dogName, int legs){
		this.dogName = dogName;
		this.legs = legs;
	}
	
	
	
	public void walk(){
		System.out.println(dogName + " can walk and it show that is healthy");
	}
	

	public void eat(){
		System.out.println(dogName + " can eat and show that it is healthy with" + legs);
	}
	
	public void sleep(){
		System.out.println(dogName + " can sleep normal 6 hour as every other healthy dog");
	}
}
