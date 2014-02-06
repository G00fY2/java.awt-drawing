package map_making;

import java.awt.Color;


public abstract class Field {


	boolean walkable;
	int runspeed;
	
	abstract public void test();
	abstract public Color getColor();
	
	
}
