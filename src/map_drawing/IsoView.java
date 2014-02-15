package map_drawing;

import map_making.Field;
import javax.swing.*;
import java.awt.Dimension;
import java.util.ArrayList;

public class IsoView implements View {
    
	public void drawGrid(JPanel container, JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid, boolean minimap) {
		JPanel isomap = new JPanel();
		int space = maxFields * map.get(0).get(0).getTileSize(); //calc space for frame dimension
		
		isomap.setPreferredSize(new Dimension(minimap ? (int) (space*2)/4 : (space*2),minimap ? (int) (space*2)/4 : space*2));
        isomap.add(new IsoTile(space, maxFields, map, grid, minimap)).setPreferredSize(new Dimension(minimap ? (int) (space*2)/4 : (space*2),minimap ? (int) (space*2)/4 : space*2));
        container.add(isomap);   
	}

    public String getName() {
        return "Test Isometric-View";
    }
}
