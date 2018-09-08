package virtualpet;

public class VirtualPet {

//Name, Type of Animal, Hunger, Thirst, Disposition, Energy
//Let (Name) Decide, Energy Determines Rebellion, Abandon Pet.

	public String name = "<Default>";
	public String animal = "<Animal>";
	private int hunger = 20;
	private int thirst = 20;
	private int dispo = 25;
	private int energy = 50;
	
	public VirtualPet() {
	}
	
	public VirtualPet(String Name, String Pet) {
		name = Name;
		animal = Pet;
	}
	
	public void feedPet(int i) {
		hunger -= i;
	}
	
	public String getHunger() {
		if (hunger > 39 && hunger < 50) { // 40 to 49
			return "Starving";
		}
		else if (hunger > 10 && hunger < 40) { // 11 to 39
			return "Hungry";
		}
		else if (hunger > 49) { // 50+
			return "Dead";
		}
		else { // 0 to 10
			return "Full";
		}
	}

//	public void giveWater() {
//		thirst -= 10;
//	}
//	
//	public int getThirst() {
//		return thirst;
//	}
//	
//	public void setDispo(int i) {
//		dispo = i;
//	}
//	
//	public int getDispo() {
//		return dispo;
//	}
//	
//	public void setEnergy(int i) {
//		energy = i;
//	}
//	
//	public int getEnergy() {
//		return energy;
//	}
	
	public void tick() {
		if (hunger > 0) {
			hunger -= 5;
		}
		if (thirst > 0) {
			thirst -= 5;
		}
		if (dispo < 50) {
			dispo -= 5;
		}
		if (energy < 50) {
			energy -= 5;
		}
	}
}

