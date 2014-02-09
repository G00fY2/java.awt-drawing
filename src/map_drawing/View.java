package map_drawing;

import map_making.Field;

import javax.swing.*;
import java.util.ArrayList;

public interface View {
    public void drawGrid(JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid);
    public String getName();
}
