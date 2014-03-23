package map_making;

import java.util.ArrayList;
import java.util.Random;

public class MapGeneration {
 	
 	public static ArrayList<ArrayList<Field>> generateMap(int maxFields, int tileSize) {
 		
  		ArrayList<ArrayList<Field>> map = new ArrayList<ArrayList<Field>>();
 		Random random = new Random();
 		double center = (double) maxFields/2;
 		
 		for(int i = 0; i < maxFields; i++){
 			
 			double probI = Math.abs(center-(i<center ? (i==center-0.5 ? i+0.5 : i+1) : i)); //position to be land/water (min = 0 | max = center-1)
 			
 			ArrayList<Field> fieldList = new ArrayList<Field>();  
  		
 			for(int j = 0; j < maxFields; j++) {			
 	 			double probJ = Math.abs(center-(j<center ? (j==center-0.5 ? j+0.5 : j+1) : j)); //position to be land/water (min = 0 | max = center-1)		
 	 		
 	 			double randomDouble = random.nextDouble()*(center-1);
 	 			fieldList.add(randomDouble < probI+probJ ? new Ocean(tileSize) : new Land(tileSize));
 			}
 			
 			map.add(fieldList);
 		}
  		
	return map;
	}
}

