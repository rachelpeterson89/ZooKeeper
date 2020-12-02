
public class BatTest {
	public static void main(String[] args) {
		Bat b = new Bat();
		b.changeBatEnergyLevel(300);
		b.displayEnergy();
		b.attackTown();
		b.attackTown();
		b.attackTown();
		b.eatHumans();
		b.eatHumans();
		b.fly();
		b.fly();
		b.displayEnergy();
	}
}
