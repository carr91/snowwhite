package application;

import java.util.Timer;
import java.util.TimerTask;

import model.Adult;
import model.BowArrowHuntingType;
import model.Child;
import model.Dwarf;
import model.Human;
import model.Huntsman;
import model.Slave;
import model.SupremacistTyrant;
import model.SwordHuntingType;
import model.slavegang;

public class SnowWhite {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {

		// create SupremacistTyrant
		//final SupremacistTyrant snowWhite = new SupremacistTyrant("Jane Smith", "Snow White");
		//final SupremacistTyrant pappaBear = new SupremacistTyrant("Jack Jones", "Pappa Bear");
		final SupremacistTyrant snowWhite = SupremacistTyrant.getInstance();
		snowWhite.name("Jane Smith", "Snow Whittle");
		// create huntsman
		
		Huntsman hmMark = new Huntsman("Mark", new SwordHuntingType());
		hmMark.hunt();
		hmMark.changeHuntingType(new BowArrowHuntingType());
		hmMark.hunt();
		
		// create slaves
		
		//Changed - Now only "human" - instead of child and adult
		final Slave georgie = new Human("George", "Georgie", 1963);
		final Slave maxine = new Human("Maxine", "Maxie", 2004);
		
		
		final Slave sneezy = new Dwarf("Bob", "Sneezy", 1994, "Longbeards");
		final Slave dopey = new Dwarf ("Steve", "Dopey", 1988, "Blacklocks");
		final Slave grumpy = new Dwarf("John", "Grumpy", 1945, "Ironfists");
		snowWhite.addSlave(georgie);
		snowWhite.addSlave(sneezy);

		final slavegang gang = new slavegang("gang");
		gang.add(sneezy);
		gang.add(dopey);
		
		//grumpy.worship();
	    //dopey.eat();
	    //georgie.worship();
	    
	    
		Timer movementTimer = new Timer();
		long delay = 17*1000;
		long period = 21*1000;
	
		movementTimer.scheduleAtFixedRate (new TimerTask() {
			 @Override
			  public void run() {
				
			    snowWhite.move();
			    georgie.eat();
			    maxine.eat();
			    sneezy.eat();
			  }
			}, delay, period);
	}

}
