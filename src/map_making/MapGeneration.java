package map_making;

import java.util.ArrayList;
import java.util.Random;


public class MapGeneration {
 	
 	public static ArrayList<ArrayList<Field>> generateGrid(int maxFieldSize) {
 		
  		ArrayList<ArrayList<Field>> grid = new ArrayList<ArrayList<Field>>();
 		Random random = new Random();
  		
 		for(int i = 0; i < maxFieldSize; i++){	
 			ArrayList<Field> fieldList = new ArrayList<Field>();  
  		
 			for(int j = 0; j < maxFieldSize; j++) {
 				if(i == 0 || j == 0 || i == maxFieldSize - 1 || j == maxFieldSize - 1) {
 					fieldList.add(new Ocean());
 				}
 				else {
 					fieldList.add(random.nextBoolean() ? new Ocean() : new Land());
 				}
 			}
 			
 			grid.add(fieldList);
 		}
  		
	return grid;
	}
}

