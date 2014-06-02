package model;
//task 5 the slavecomponent acts as the abstract parent to both slaves and slavegangs (the component for a composite design)
public interface slavecomponent {
	public void add(slavecomponent SC);
	public void remove(slavecomponent SC);
	public slavecomponent getChild(int i);
	
	public void worship();
	public void eat();
	//do i need to have getreal name and getslave name?
}
