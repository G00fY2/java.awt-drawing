package map_drawing;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

import map_making.Field;
import map_making.Land;
import map_making.Ocean;

public class DisplayGrid {
	public static ArrayList<ArrayList<Field>> generateGrid(int maxFieldSize) {
		ArrayList<ArrayList<Field>> grid = new ArrayList<ArrayList<Field>>();
		Random random = new Random();
		
		for(int i = 0; i < maxFieldSize; i++){	
			ArrayList<Field> fieldList = new ArrayList<Field>();  
		
			for(int j = 0; j < maxFieldSize; j++){
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
	
	public static ArrayList<ArrayList<Field>> generateIsland(int minSize, int maxSize) {
		Field[][] island = new Field[maxSize][maxSize];
		
		// Fill map with ocean tiles
		for (int i = 0; i < maxSize; i++) {
			for (int k = 0; k < maxSize; k++) {
				island[i][k] = new Ocean();
			}
		}
		
		// Generate minimum land mass.
		//
		// The minimum land mass isn't centered, if its even and the grid itself
		// isn't and vice versa. So the minSize is decreased if it has to be resized.
		boolean resizeMinSize = minSize % 2 == 0 && maxSize % 2 != 0 || minSize % 2 != 0 && maxSize % 2 == 0;
		
		if (resizeMinSize) {
			minSize -= 1;
		}
		
		// Calculate starting index for land mass
		int landMassStartingIndex = (maxSize - minSize) / 2 - 1;
		
		// Create minimum land mass
		for (int i = landMassStartingIndex; i < landMassStartingIndex + minSize; i++) {
			for (int k = landMassStartingIndex; k < landMassStartingIndex + minSize; k++) {
				island[i][k] = new Land();
			}
		}
		
		// Convert arrays to ArrayList
		ArrayList<ArrayList> container = new ArrayList<ArrayList>();
		
		for (int i = 0; i < maxSize; i++) {
			container.add(new ArrayList<Field>(island[i]));
		}
		
		return new ArrayList<ArrayList<Field>>(island);
	}
	
	public static void displayGrid(int maxSize, int tileSize, ArrayList<ArrayList<Field>> map) {
		JFrame frame = new JFrame("Test");
    
		for(ArrayList<Field> m : map) {
			for(Field field : m) {
		    	Tile tile = new Tile(tileSize, field);
		    	frame.add(tile);
			}  
		}   
	
	    frame.pack();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new GridLayout(maxSize, maxSize));
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	    frame.setPreferredSize(new Dimension(tileSize*maxSize, tileSize*maxSize));
    }
}