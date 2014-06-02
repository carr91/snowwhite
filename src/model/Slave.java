package model;

import java.util.Calendar;
//task 5 - the "slave" class is now a leaf node for the composite design pattern
public abstract class Slave implements slavecomponent{
	private String realName;
	private String slaveName;
	protected Integer yearOfBirth; // All slaves have their birthday on the 1st of January -changed to protected so it can be accessed by subclasses
	
	public Slave(String realName, String slaveName, Integer yearOfBirth){
		this.realName = realName;
		this.slaveName = slaveName;
		this.yearOfBirth = yearOfBirth;
	}
	
	protected abstract void batheFeet();
	protected abstract void burnIncence();
	protected abstract void singPraises();
	
	public void worship(){
		batheFeet();
		burnIncence();
		singPraises();
	}
	
	public String getRealName(){
	 return realName;	
	}
	
	public String getSlaveName(){
		return slaveName;
	}
	//task 5 added composite functions, but they do nothing due to the class being a leaf
	public void add(slavecomponent SC) {
	}
	public void remove(slavecomponent SC) {
	}
	public slavecomponent getChild(int i) {
		return null;
	}
	
	
	
	protected Boolean isTimeToEat(){
		
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		switch(hour) {
		case 9: return true; // breakfast
		case 12: return true; // lunch
		case 18: return true; // tea
		default: return false;
		}
	}
	
	public abstract void eat();
	
	protected Integer getAge(){
		Calendar cal = Calendar.getInstance();
		Integer thisYear = cal.get(Calendar.YEAR);
		return thisYear - yearOfBirth;
	}
	
	public abstract void respondToMovement();
	
	public String toString(){
		return this.getClass() + "; realname: " + realName + ", slaveName: " + slaveName;
	}
}
