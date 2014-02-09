package map_drawing;

import java.util.ArrayList;
import javax.swing.JFrame;
import map_making.Field;

public class DisplayGrid{
	
	public static void displayGrid(int viewType, int maxFields, ArrayList<ArrayList<Field>> map, Boolean grid) {
		
		JFrame frame = new JFrame();
		switch( viewType ) {
			case 1:
				drawGrid(viewType, frame, maxFields, map, grid);
				frame.setTitle("Test (2D View)");
				break;
			case 2:
				drawGrid(viewType, frame, maxFields, map, grid);
				frame.setTitle("Test (Isometric View)");
				break;
		}
			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);		
		frame.setVisible(true);
		frame.setResizable(true);
    }
	
	
	private static void drawGrid(int viewType, JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, Boolean grid) {
		int space = maxFields * map.get(0).get(0).getTileSize(); //calc space for frame dimension
		for(int i = 0; i < maxFields; i++){	 
 			for(int j = 0; j < maxFields; j++) {
 				if(viewType == 1){
 					frame.add(new TwoDTile(space, map.get(i).get(j), i, j, grid));
 					frame.pack();
 				}
 				else{
 					frame.add(new IsoTile(space, map.get(i).get(j), i, j, grid));
 					frame.pack();
 				}
 			}
		}
	}
	
}