package map_drawing;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import map_making.Field;

public abstract class Tile extends JComponent{	
	private static final long serialVersionUID = 1L;
	
	protected int space;
	protected Field field;
	protected int x;
	protected int y;
	protected Boolean grid;
	Tile(int space, Field field, int x, int y, Boolean grid){
		this.field = field;
		this.x = x;
		this.y = y;
		this.space = space;
		this.grid = grid;
	}
	
	abstract public Dimension getPreferredSize();	
	abstract public void paint(Graphics g);	
	
}
