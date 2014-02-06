package map_making;

import java.awt.Color;

public class Ocean  extends Field {
	
	public static final Color color = Color.blue;
	boolean walkable;
	int runspeed;

	public void test() {
		System.out.println("ocean");
	}
	public Color getColor(){
		return color;
	}
}
