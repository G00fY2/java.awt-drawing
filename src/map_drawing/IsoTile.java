package map_drawing;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

import map_making.Field;

public class IsoTile extends Tile {
	private static final long serialVersionUID = 1L;
	
	IsoTile(int space, Field field, int x, int y, Boolean grid) {
		super(space, field, x, y, grid);
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(space*2,space*2); //bigger frame for isometric view
    }
	
	//TODO: implement isometric view logic
	public void paint(Graphics g) {
		int size = field.getTileSize();
		Graphics2D g2 = (Graphics2D) g;
        int xCrd[] = { x*size,	size+x*size,	size+x*size,	x*size 		};
        int yCrd[] = { y*size,	y*size,			size+y*size, 	size+y*size };

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
