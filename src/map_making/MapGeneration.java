package map_making;

import java.util.ArrayList;
import java.util.Random;


public class MapGeneration {
 	
 	public static ArrayList<ArrayList<Field>> generateMap(int maxFields, int tileSize) {
 		
  		ArrayList<ArrayList<Field>> map = new ArrayList<ArrayList<Field>>();
 		Random random = new Random();
  		
 		for(int i = 0; i < maxFields; i++){	
 			ArrayList<Field> fieldList = new ArrayList<Field>();  
  		
 			for(int j = 0; j < maxFields; j++) {
 					fieldList.add(random.nextBoolean() ? new Ocean(tileSize) : new Land(tileSize));
 			}
 			
 			map.add(fieldList);
 		}
  		
	return map;
	}
}

