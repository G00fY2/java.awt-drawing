package map_drawing;

import java.awt.Dimension;
import javax.swing.JPanel;

public class Tile extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public Tile(int tileSize) {
        this.setOpaque(true);
        this.setPreferredSize(new Dimension(tileSize, tileSize));
	}	
}
