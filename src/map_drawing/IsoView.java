package map_drawing;

import map_making.Field;

import javax.swing.*;
import java.util.ArrayList;

public class IsoView implements View {
    
	public void drawGrid(JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid) {
        int space = maxFields * map.get(0).get(0).getTileSize(); //calc space for frame dimension
        frame.add(new IsoTile(space, maxFields, map, grid));
        frame.pack();
	}

    public String getName() {
        return "Test Isometric-View";
    }
}
