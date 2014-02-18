package map_drawing;

import map_making.Field;
import javax.swing.*;
import java.awt.Dimension;
import java.util.ArrayList;

public class IsoView implements View {
    
	public void drawGrid(JPanel container, JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid, int miniscale) {
		JPanel isomap = new JPanel();
		int space = maxFields * map.get(0).get(0).getTileSize(); //calc space for frame dimension
		
		isomap.setPreferredSize(new Dimension(miniscale > 0 ? (int) (space*2)/miniscale : (space*2),miniscale > 0 ? (int) (space*2)/miniscale : space*2));
        isomap.add(new IsoTile(space, maxFields, map, grid, miniscale)).setPreferredSize(new Dimension(miniscale > 0 ? (int) (space*2)/miniscale : (space*2),miniscale > 0 ? (int) (space*2)/miniscale : space*2));
        container.add(isomap);   
	}

    public String getName() {
        return "Test Isometric-View";
    }
}
