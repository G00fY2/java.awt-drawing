package map_drawing;

import java.util.ArrayList;
import javax.swing.JFrame;
import map_making.Field;

public class DisplayGrid {
	public static void displayGrid(View view, int maxFields, ArrayList<ArrayList<Field>> map, Boolean grid) {
		JFrame frame = new JFrame();

        view.drawGrid(frame, maxFields, map, grid);

        frame.setTitle(view.getName());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
		frame.setResizable(true);
    }
}