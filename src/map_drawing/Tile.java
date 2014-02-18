package map_drawing;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;
import map_making.Field;

public abstract class Tile extends JComponent {
	private static final long serialVersionUID = 1L;
	
	protected int space;
	protected int maxFields;
	protected int miniscale;
	protected ArrayList<ArrayList<Field>> map;
	protected Boolean grid;
	protected Field field;

	Tile(int space, int maxFields, ArrayList<ArrayList<Field>> map, Boolean grid, int miniscale){
        this.space = space;
        this.map = map;
		this.grid = grid;
		this.maxFields = maxFields;
		this.miniscale = miniscale;
	}
	
	abstract public void paint(Graphics g);
}
