package map_drawing;

import map_making.Field;
import javax.swing.*;
import java.awt.Dimension;
import java.util.ArrayList;

public class TwoDView implements View {
    
	public void drawGrid(JPanel container, JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid, boolean minimap) {
        JPanel twodmap = new JPanel();
		int space = maxFields * map.get(0).get(0).getTileSize(); //calc space for frame dimension
		
		twodmap.setPreferredSize(new Dimension(minimap ? space/4 : space,minimap ? space/4 : space));
        twodmap.add(new TwoDTile(space, maxFields, map, grid, minimap)).setPreferredSize(new Dimension(minimap ? (int) space/4 : space,minimap ? (int) space/4 : space));
        container.add(twodmap);
    }

    public String getName() {
        return "Test 2D-View";
    }
}
