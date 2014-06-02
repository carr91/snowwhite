package model;


public class Dwarf extends Slave {

	private String tribe;
	
	public Dwarf(String realName, String slaveName, Integer yearOfBirth, String tribe) {
		super(realName, slaveName, yearOfBirth);
		this.tribe = tribe;
	}

	public String getTribe(){
		return tribe;
	}
	
	@Override
	protected void batheFeet() {
		System.out.println("  " + getSlaveName() + " is bathing the Tyrant's feet in blessed water");

	}

	@Override
	protected void burnIncence() {
		System.out.println("  " + getSlaveName() + " is burning Sandalwood");

	}

	@Override
	protected void singPraises() {
		System.out.println("  " + getSlaveName() + " sings: all praise to the tall and beautiful one!");

	}

	@Override
	public void respondToMovement() {
		System.out.println("  " + getSlaveName() + ": Make way for the Royal Highness!");
		
	}

	@Override
	public void eat(){
		if (isTimeToEat()){
			System.out.println(getSlaveName() + " is eating a set portion of food");
		} else {
			System.out.println("Sorry, it's not yet time for " + getSlaveName() + " to eat");
		}
	}
}
