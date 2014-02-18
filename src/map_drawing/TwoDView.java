package map_drawing;

import map_making.Field;
import javax.swing.*;
import java.awt.Dimension;
import java.util.ArrayList;

public class TwoDView implements View {
    
	public void drawGrid(JPanel container, JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid, int miniscale) {
        JPanel twodmap = new JPanel();
		int space = maxFields * map.get(0).get(0).getTileSize(); //calc space for frame dimension
		
		twodmap.setPreferredSize(new Dimension(miniscale > 0 ? space/miniscale : space,miniscale > 0 ? space/miniscale : space));
        twodmap.add(new TwoDTile(space, maxFields, map, grid, miniscale)).setPreferredSize(new Dimension(miniscale > 0 ? (int) space/miniscale : space,miniscale > 0 ? (int) space/miniscale : space));
        JCheckBox gridbox = new JCheckBox("Gitter");
        JButton generate = new JButton("Generate");
        twodmap.add(gridbox);
        twodmap.add(generate);
        container.add(twodmap);
    }

    public String getName() {
        return "Test 2D-View";
    }
}
