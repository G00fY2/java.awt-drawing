package gui;

import java.util.ArrayList;
import map_making.Field;
import map_making.MapGeneration;

public class MainClass {
	
	public static void main(String[] args) {
		
		int maxFields = 16; // number of tiles (x & y)
		int tileSize = 24; // size per tile
		int miniscale = 4; // scaling of minimap (0 = no minimap)
		boolean grid = true; // show grid overlay
		boolean debug = false; // console output
		long startTime = System.currentTimeMillis();

		while(tileSize%2!=0){tileSize--;} // get even number, cause Polygon objects only have int precision 

		ArrayList<ArrayList<Field>> map = MapGeneration.generateMap(maxFields, tileSize);
		DisplayWindow.displayWindow(maxFields*tileSize, maxFields, map, grid, miniscale);
		
		long stopTime = System.currentTimeMillis();
		
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
		    System.out.println("RUNTIME: "+(stopTime-startTime)+" ms");
		}			
	}
	
}
