package map_making;

import java.awt.Color;

public class Land extends Field {
	
	public static final Color color = Color.green;
	boolean walkable;
	int runspeed;

	public void test() {
		System.out.println("land");
	}
	public Color getColor(){
		return color;
	}
	
}
