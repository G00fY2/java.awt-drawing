package map_drawing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import map_making.Field;

public class TwoDTile extends Tile {
	private static final long serialVersionUID = 1L;
	int xCrd[] = new int[4];
	int yCrd[] = new int[4];
	
	TwoDTile(int space, Field field, int x, int y, Boolean grid) {
		super(space, field, x, y, grid);
	}

	public Dimension getPreferredSize() {
        return new Dimension(space,space);
    }

	public void paint(Graphics g) {
		int size = field.getTileSize();
		Graphics2D g2 = (Graphics2D) g;
        xCrd[0] = 0 + x*size;
        xCrd[1] = size + x*size;
        xCrd[2] = size + x*size;
        xCrd[3] = 0 + x*size;
        
        yCrd[0] = 0 + y*size;
        yCrd[1] = 0 + y*size;
        yCrd[2] = size + y*size;
        yCrd[3] = size + y*size;

		Polygon p = new Polygon(xCrd, yCrd, xCrd.length);
		//draw tile
		g2.setColor(field.getColor());
		g2.fillPolygon(p);
		//draw grid
		if(grid){
			g2.setStroke(new BasicStroke((int)size/50));
			g2.setColor(Color.black);
			g2.drawPolygon(p);
		}
	}

}