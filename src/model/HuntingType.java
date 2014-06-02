package model;

public abstract class HuntingType {

	private Weapon weapon;
	
	public HuntingType(){
		setWeapon();
	}
	
	protected void setWeapon(){
		if (this instanceof BowArrowHuntingType){
			this.weapon = new BowAndArrow();
		} else if (this instanceof MachineGunHuntingType){
			this.weapon = new MachineGun();
		} else if (this instanceof SwordHuntingType){
			this.weapon = new Sword();
		}
	}
	
	public String weaponName(){
		return weapon.toString();
	}
	
	public abstract void hunt();
}
