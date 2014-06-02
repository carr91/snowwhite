package model;

import model.HuntingType;

public class Huntsman {

	private String realName;
	private HuntingType huntingType;
	
	public Huntsman(String realName, HuntingType huntingType) {
		this.realName = realName;
		this.huntingType = huntingType;
	}
	
	public void changeHuntingType(HuntingType huntingType){
		this.huntingType = huntingType;
	}
	
	public void hunt(){
		System.out.print(realName + " is hunting");
		huntingType.hunt();
	}
	
	public String getRealName(){
		return realName;
	}
	
	public String toString(){
		return this.getClass().getSimpleName() + ": " + getRealName();
	}

}
