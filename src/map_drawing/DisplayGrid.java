package map_drawing;

import map_making.Field;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DisplayGrid{
	
	public static void displayGrid(View view, int maxFields, ArrayList<ArrayList<Field>> map, Boolean grid, int miniscale) {
		JFrame frame = new JFrame();
		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container,BoxLayout.X_AXIS));

        view.drawGrid(container, frame, maxFields, map, grid, 0);
        
        // draw minimap always as 2D
        if(miniscale > 0){
        	View miniview = new TwoDView();
        	miniview.drawGrid(container, frame, maxFields, map, grid, miniscale);
        }
        
        frame.add(container);
        frame.pack();
        frame.setTitle(view.getName());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
		frame.setResizable(true);
    }
}