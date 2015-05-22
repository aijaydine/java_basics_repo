package dayOfTwo;

import java.io.IOException;

public class AnimalSpecies {

	public static void main(String[] args) throws IOException {
		
//		Animals animalspecies = new Animals();
//		
//		animalspecies.cry();
//		animalspecies.eat();
//		animalspecies.run();
//		animalspecies.sleep();
//		animalspecies.walk();

		Dog bingo = new Dog("Bingo the Jagaur", 4);
		bingo.eat();
		bingo.sleep();
		bingo.walk();
		
		System.out.println("******************");
		
		Dog shiwawa = new Dog("Shiwawa Akpuraka", 5);
		shiwawa.eat();
		shiwawa.sleep();
		shiwawa.walk();
	}

}
