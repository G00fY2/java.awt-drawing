package map_making;

import java.util.ArrayList;
import map_drawing.DisplayGrid;
import map_drawing.TwoDView;
import map_drawing.View;

public class MainClass {
	
	public static void main(String[] args) {
		
		int maxFields = 12; // number of tiles (x & y)
		int tileSize = 24; // pixel
		int viewType = 1; // 1=2D view; 2=isometric view (not implemented yet)
		boolean grid = true; // show grid overlay
		boolean debug = true; // console output

        View view = new TwoDView();

		while(tileSize%2!=0){tileSize--;} // get even number, cause Polygon objects only have int precision 

		ArrayList<ArrayList<Field>> map = MapGeneration.generateMap(maxFields, tileSize);
		DisplayGrid.displayGrid(view, maxFields, map, grid);
		
		if(debug) {
			System.out.println("DEBUG");

			for(ArrayList<Field> row : map) {
				for(Field f : row){
					if ((row.indexOf(f)) == 0){
						System.out.println("--" + (map.indexOf(row) + 1) + "--");
					}

					f.test();

					if ((row.indexOf(f) + 1) == row.size()) {
						System.out.println("");
					}
				}
			}
		}			
	}
	
}
