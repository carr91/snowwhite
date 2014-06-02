package model;


public class Child extends Human {

	public Child(String realName, String slaveName, Integer yearOfBirth) {
		super(realName, slaveName, yearOfBirth);
	}

	// Children aren't able to do heavy work
	public Boolean isAbleToDoHeavyWork(){
		System.out.println(getSlaveName() + " is not able to do work");
		return false;
	}
	public String toString (){
		return "Human " + this.getClass().getSimpleName();
	}
}
