
public class Bat extends Mammal {
	
	public Bat() {
		super();
	}
	
	public void changeBatEnergyLevel(int energyLevel) {
		super.setEnergyLevel(energyLevel);
	}
	
	//method prints message, decreases energy by 50
	public void fly() {
		energyLevel = energyLevel - 50;
		System.out.println("Bat flies away, decreasing energy by 50");
	}
	
	//method prints message, increases energy by 25
	public void eatHumans() {
		energyLevel = energyLevel + 25;
		System.out.println("Naughty bat eats a human, increasing energy by 25");
	}
	
	//method prints message, decreases energy by 100
	public void attackTown() {
		energyLevel = energyLevel - 100;
		System.out.println("Bad Bat attacks town, decreasing energy by 100");
	}
}
