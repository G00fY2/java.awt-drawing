package map_making;

import java.awt.Color;

public class Ocean extends Field {
	public Ocean(int tileSize) {
		super(Color.blue, tileSize);
	}
	
	public void test() {
		System.out.println("ocean");
	}
}
