package map_making;

import java.awt.Color;

public class Land extends Field {
	public Land(int tileSize) {
		super(Color.green, tileSize);
	}
	
	public void test() {
		System.out.println("land");
	}
}
