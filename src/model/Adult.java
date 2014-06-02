package model;

public class Adult extends Human {

	public Adult(String realName, String slaveName, Integer yearOfBirth) {
		super(realName, slaveName, yearOfBirth);
	}
	
	// Adults are able to do heavy work
	public Boolean isAbleToDoHeavyWork(){
		System.out.println(getSlaveName() + " is able to do work");
		return true;
	}
	
	public String toString (){
		return "Human " + this.getClass().getSimpleName();
	}

}
