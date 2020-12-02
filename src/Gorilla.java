
public class Gorilla extends Mammal {
	
	//method prints message, decrease energy by 5 
	public int throwSomething() {
		energyLevel = energyLevel - 5;
		System.out.println("Gorilla throws something, decreasing energy by 5");
		return energyLevel;
	}
	
	//method prints message, increase energy by 10
	public void eatBananas() {
		energyLevel = energyLevel + 10;
		System.out.println("Gorilla eats bananas, increasing energy by 10");
	}
	
	//method prints message, decrease energy by 10
	public void climb() {
		energyLevel = energyLevel - 10;
		System.out.println("Gorilla climbs a tree, decreasing energy by 10");
	}
}
