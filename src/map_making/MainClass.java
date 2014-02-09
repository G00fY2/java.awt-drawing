package map_making;

import java.util.ArrayList;
import map_drawing.DisplayGrid;

public class MainClass {
	public static void main(String[] args) {		
		int maxFieldSize = 12; // Number of fields (x & y)
		int tileSize = 64; //Pixel
		
		ArrayList<ArrayList<Field>> map = DisplayGrid.generateGrid(maxFieldSize);
		
		System.out.println("DEBUG");
	
		for (ArrayList<Field> m : map){
			for (Field f : m) {
				if ((m.indexOf(f)) == 0) {
					System.out.println("--" + (map.indexOf(m) + 1) + "--");
				}
				
				f.test();
			
				if ((m.indexOf(f) + 1) == m.size()) {
					System.out.println("");
				}
			}  
		}
		
		DisplayGrid.displayGrid(maxFieldSize, tileSize, map);
	}
}
