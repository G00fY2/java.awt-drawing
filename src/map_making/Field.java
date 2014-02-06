package map_making;

import java.awt.Color;

public abstract class Field {
	private boolean walkable;
	private int runspeed;
	private Color color;
	
	public Field(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	abstract public void test();
}