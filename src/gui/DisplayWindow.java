package gui;

import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import map_drawing.IsoView;
import map_drawing.TwoDView;
import map_making.Field;

public class DisplayWindow {
	
	public static void displayWindow(int space, int maxFields, ArrayList<ArrayList<Field>> map, Boolean grid, int miniscale) {
		JFrame frame = new JFrame();
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container,BoxLayout.X_AXIS));
	
		JPanel mapPanel = new JPanel();
		Dimension normalMap = new Dimension(space*2,space*2);
		mapPanel.add(new IsoView(space, maxFields, map, grid, 0)).setPreferredSize(normalMap);
		container.add(mapPanel);
    
		// Draw minimap
		JPanel miniPanel = new JPanel();
		Dimension miniMap = new Dimension((int)space/miniscale,(int)space/miniscale);
		miniPanel.add(new TwoDView(space, maxFields, map, grid, miniscale)).setPreferredSize(miniMap);
		container.add(miniPanel);
		
		frame.add(container);
		frame.pack();
		frame.setTitle("Map Generator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
		frame.setResizable(true);
	}
}
