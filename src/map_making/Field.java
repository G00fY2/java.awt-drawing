package map_making;

import java.awt.Color;

public abstract class Field {
	private boolean walkable;
	private int runspeed;
	private Color color;
	
	public Color getColor() {
		return this.color;
	}
	
	abstract public void test();
}
