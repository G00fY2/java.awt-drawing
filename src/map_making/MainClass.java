package map_making;

import java.util.ArrayList;

import map_drawing.DisplayGrid;
import map_drawing.IsometricView;
import map_drawing.View;

public class MainClass {
	
	public static void main(String[] args) {
		
		int maxFields = 8; // number of tiles (x & y)
		int tileSize = 65; // pixel
		boolean grid = true; // show grid overlay
		boolean debug = true; // console output
		
		while(tileSize%2!=0){tileSize--;} // get even number, cause Polygon objects only have int precision 

        View view = new IsometricView();

		ArrayList<ArrayList<Field>> map = MapGeneration.generateMap(maxFields, tileSize);
		DisplayGrid.displayGrid(view, maxFields, map, grid);
		
		if(debug) {
			System.out.println("DEBUG");
			for(ArrayList<Field> m : map) {
				for(Field f : m){
					if ((m.indexOf(f)) == 0){
						System.out.println("--"+ (map.indexOf(m)+1) +"--");
					}			
					f.test();
					if ((m.indexOf(f) + 1) == m.size()) {
						System.out.println("");
					}
				}  
			}
		}			
	}
	
}
