package map_drawing;

import map_making.Field;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.RenderingHints;
import java.util.ArrayList;

public class IsoView extends Tiles {

	private static final long serialVersionUID = 1L;
	int xCrd[] = new int[4];
	int yCrd[] = new int[4];
	
	public IsoView(int space, int maxFields, ArrayList<ArrayList<Field>> map, Boolean grid, int miniscale) {
		super(space, maxFields, map, grid, miniscale);
	}
	
	public void paint(Graphics g) {	
    	Graphics2D g2 = (Graphics2D) g;
    	g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
    	for(int x = 0; x < maxFields; x++){
            for(int y = 0; y < maxFields; y++) {
            	
            	this.field = map.get(x).get(y);        	
        		int size = field.getTileSize();	
        		size = miniscale > 0 ? (int) size/miniscale : size;

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
            	// draw tile
            	g2.setColor(field.getColor());
            	g2.fillPolygon(p);
            	// draw grid
            	if(grid){
            		g2.setStroke(new BasicStroke((int)size/32));
            		g2.setColor(Color.black);	
            	}
            	g2.drawPolygon(p);
            }
		}	
	}

}
