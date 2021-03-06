package virtualpet;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {
	
	@Test
	public void createVirtualPet() {
		VirtualPet dog = new VirtualPet();
	}
	
	@Test
	public void createVirtualPetWithName() {
		VirtualPet dog = new VirtualPet("Fido", "Dog");
		assertTrue(dog.name.equals("Fido"));
		assertTrue(dog.animal.equals("Dog"));
	}
	
	@Test
	public void setThenGetHunger() {
		VirtualPet dog = new VirtualPet();
		assertTrue(dog.getHunger().equals("Hungry"));
		dog.feedPet(-15); //Sets hunger to 40
		assertTrue(dog.getHunger().equals("Starving"));
		dog.feedPet(-10); //Sets hunger to 50
		assertTrue(dog.getHunger().equals("Dead"));
		dog.feedPet(40); //Sets hunger to 10
		assertTrue(dog.getHunger().equals("Full"));
	}
	
	@Test
	public void setThenGetThirst() {
		VirtualPet dog = new VirtualPet();
		assertTrue(dog.getThirst().equals("Thirsty"));
		dog.tick(); dog.tick(); dog.tick(); dog.tick(); //Sets thirst to 45
		assertTrue(dog.getThirst().equals("Dehydrated"));
		dog.giveWater(); dog.giveWater(); dog.giveWater(); //Sets thirst to 0
		assertTrue(dog.getThirst().equals("Hydrated"));
	}
	
	@Test
	public void setThenGetDispo() {
		VirtualPet dog = new VirtualPet();
		assertTrue(dog.getDispo().equals("Content"));
		dog.selfServe(); //Energy should be lowest value
		assertTrue(dog.getEnergyNum() == 30);
		dog.selfServe(); //Thirst should be lowest value
		assertTrue(dog.getThirst().equals("Hydrated"));
		dog.selfServe(); //Energy should be lowest value
		dog.selfServe(); //Hunger should be lowest value
		assertTrue(dog.getHunger().equals("Full"));
		dog.feedPet(100);
		assertTrue(dog.getDispo().equals("Loved"));
	}
	
	@Test
	public void setThenGetEnergy() {
		VirtualPet dog = new VirtualPet();
		assertTrue(dog.getEnergy().equals("Active"));
		dog.giveWater(); dog.giveWater(); dog.giveWater(); //Sets energy 5
		assertTrue(dog.getEnergy().equals("Tired"));
		dog.takeNap(4); //Sets energy to 4
		assertTrue(dog.getEnergy().equals("Full of Energy"));
	}
	
}
