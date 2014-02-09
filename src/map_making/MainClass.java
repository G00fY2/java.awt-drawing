package map_making;

import java.util.ArrayList;
import map_drawing.*;



public class MainClass {
	
	
	public static void main(String[] args) {
		
		int maxFieldSize = 48; // Number of fields (x & y)
		int tileSize = 16; //Pixel
		ArrayList<ArrayList<Field>> map = MapGeneration.generateGrid(maxFieldSize);
		
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
		
	DisplayGrid.displayGrid(maxFieldSize, tileSize, map);
	}

}
