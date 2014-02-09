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
	int xCrd[] = new int[4];
	int yCrd[] = new int[4];
	
	IsoTile(int space, Field field, int x, int y, Boolean grid) {
		super(space, field, x, y, grid);
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(space*2,space*2); //bigger frame for isometric view
    }
	
	public void paint(Graphics g) {
		int size = field.getTileSize();
		Graphics2D g2 = (Graphics2D) g;
		// draw tiles in rows
		if(y==0){
        	xCrd[0] = space-size + size*x;
        	xCrd[1] = space + size*x;
        	xCrd[2] = space+size + size*x;
        	xCrd[3] = space + size*x;
        		
    	    yCrd[0] = space/2+size/2 + (size/2)*x;
    	    yCrd[1] = space/2+0 + (size/2)*x;
    	    yCrd[2] = space/2+size/2 + (size/2)*x;
    	    yCrd[3] = space/2+size + (size/2)*x;
        }
        // draw tiles in colum
        else{
        	xCrd[0] = space-size - size*y + size*x;
        	xCrd[1] = space - size*y + size*x;
        	xCrd[2] = space+size - size*y + size*x;
        	xCrd[3] = space - size*y + size*x;
        		
    	    yCrd[0] = space/2+size/2 + (size/2)*y + (size/2)*x;
    	    yCrd[1] = space/2+0 + (size/2)*y + (size/2)*x;
    	    yCrd[2] = space/2+size/2 + (size/2)*y + (size/2)*x;
    	    yCrd[3] = space/2+size + (size/2)*y + (size/2)*x;
        }

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
