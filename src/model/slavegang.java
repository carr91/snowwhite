package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//task 5 - This is the composite class, containing a number of slaves.
public class slavegang implements slavecomponent {
	private String name;
	
	
	public slavegang(String name){
		this.name = name;
	}
	List<slavecomponent> slaves = new ArrayList<slavecomponent>();
	public void add(slavecomponent SC) {
		slaves.add(SC);
	}

	public void remove(slavecomponent SC) {
		slaves.remove(SC);
		
	}

	public slavecomponent getChild(int i) {
		return slaves.get(i);
	}
	//use an iterator because each slave worships in its own way - 
	public void worship() {
		Iterator<slavecomponent> slavesIterator = slaves.iterator();
		while (slavesIterator.hasNext()){
			slavecomponent sc = slavesIterator.next();
			sc.worship();
		}
		
	}
	//use an iterator because each slave eats in its own way - 
	public void eat() {
		Iterator<slavecomponent> slavesIterator = slaves.iterator();
		while (slavesIterator.hasNext()){
			slavecomponent sc = slavesIterator.next();
			sc.eat();
		}
		
	}
}
