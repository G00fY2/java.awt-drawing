package map_drawing;

import map_making.Field;

import javax.swing.*;
import java.util.ArrayList;

public class IsometricView implements View {
    public void drawGrid(JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid) {
        int space = maxFields * map.get(0).get(0).getTileSize(); //calc space for frame dimension

        for(int i = 0; i < maxFields; i++){
            for(int j = 0; j < maxFields; j++) {
                frame.add(new IsoTile(space, map.get(i).get(j), i, j, grid));
                frame.pack();
            }
        }
    }

    public String getName() {
        return "Test Isometric-View";
    }
}
