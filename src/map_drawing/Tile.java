package map_drawing;

import java.awt.Dimension;
import javax.swing.JPanel;
import map_making.Field;

public class Tile extends JPanel{
	private static final long serialVersionUID = 1L;
	
	public Tile(int tileSize, Field field) {
		this.setBackground(field.getColor());
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(tileSize, tileSize));
	}
	
}
