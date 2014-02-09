package map_making;

import java.awt.Color;

public abstract class Field {
	private Color color;
	private int TileSize;
	
	public Field(Color color, int tileSize) {
		this.color = color;
		this.TileSize = tileSize;
	}
	
	public Color getColor() {
		return this.color;
	}

	public int getTileSize() {
		return this.TileSize;
	}
	
	abstract public void test();
}