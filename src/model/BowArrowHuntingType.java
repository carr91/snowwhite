package model;

public class BowArrowHuntingType extends HuntingType {


	@Override
	public void hunt() {
		System.out.println(" drawing and releasing a " + weaponName());
	}

}
