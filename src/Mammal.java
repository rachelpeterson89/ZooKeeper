
public class Mammal {
	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	// getter
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	// setter
	public void setEnergyLevel(int energyLevelInput) {
		energyLevel = energyLevelInput;
	}
	
	public int displayEnergy() {
		System.out.println("Energy Level: " + energyLevel);
		return energyLevel;
	}
}
