package model;

public class MachineGunHuntingType extends HuntingType {

	@Override
	public void hunt() {
		System.out.println("  firing: " + weaponName());
	}

}
