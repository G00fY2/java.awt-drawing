package map_making;

import java.util.ArrayList;
import java.util.Random;
import map_drawing.DisplayGrid;


public class MainClass {
	
	
	public static void main(String[] args) {
		
		int maxFieldSize = 5; // Number of fields (x & y)
		int tileSize = 128; //Pixel
		final Random random = new Random();
		ArrayList<ArrayList<Field>> map = new ArrayList<ArrayList<Field>>();
		

	for(int i=0; i<maxFieldSize; i++){
			
		ArrayList<Field> fieldList = new ArrayList<Field>();  
		for(int j=0; j<maxFieldSize; j++){
				   
			if(i==0 || i==maxFieldSize-1){
				fieldList.add(new Ocean());
			}
			else{
				if(j==0 || j==maxFieldSize-1){
					fieldList.add(new Ocean());
				}
				else{
					boolean randomBool = random.nextBoolean();
					if (randomBool){
						fieldList.add(new Land());
					}
					else{
					fieldList.add(new Ocean());
					}
				}
			}
		}  
			   
		map.add(fieldList);
   
	}
		
		System.out.println("DEBUG");
		for(ArrayList<Field> m : map){
			for(Field f : m)
			{
				if ((m.indexOf(f)) == 0){
					  System.out.println("--"+ (map.indexOf(m)+1) +"--");
				}			
				f.test();
				if ((m.indexOf(f)+1) == m.size()){
					System.out.println("");
				}
			}  
		}
		
		DisplayGrid.displayGrid(maxFieldSize, tileSize, map);
	}

}
