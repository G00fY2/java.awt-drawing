package map_drawing;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

import map_making.Field;


public class DisplayGrid{
	
	
	public static void displayGrid(int maxSize, int tileSize, ArrayList<ArrayList<Field>> map) {

    JFrame frame = new JFrame("Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.setLayout(new GridLayout(maxSize, maxSize));
    
    
	for(ArrayList<Field> m : map){
		for(Field field : m)
		{
	    	Tile tile = new Tile(tileSize);
	    	tile.setBackground(field.getColor());
	        frame.add(tile);
		}  
	}   

    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setPreferredSize(new Dimension(tileSize*maxSize, tileSize*maxSize));}
	
}


