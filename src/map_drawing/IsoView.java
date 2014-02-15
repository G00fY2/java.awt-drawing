package map_drawing;

import map_making.Field;

import javax.swing.*;

import java.util.ArrayList;

public class IsoView implements View {
    
	public void drawGrid(JPanel container, JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid, boolean minimap) {
		JPanel isomap = new JPanel();
		int space = maxFields * map.get(0).get(0).getTileSize(); //calc space for frame dimension
		
		
        isomap.add(new IsoTile(space, maxFields, map, grid, minimap));
        container.add(isomap);        
	}

    public String getName() {
        return "Test Isometric-View";
    }
}
