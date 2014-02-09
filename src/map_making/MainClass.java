package map_making;

import java.util.ArrayList;

import map_drawing.DisplayGrid;

public class MainClass {
	
	public static void main(String[] args) {
		
		int maxFields = 12; // number of tiles (x & y)
		int tileSize = 24; // pixel
		int viewType = 1; // 1=2D view; 2=isometric view (not implemented yet)
		boolean grid = true; // show grid overlay
		boolean debug = true; // console output
		
		ArrayList<ArrayList<Field>> map = MapGeneration.generateMap(maxFields, tileSize);
		DisplayGrid.displayGrid(viewType, maxFields, map, grid);
		
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
