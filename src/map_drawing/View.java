package map_drawing;

import map_making.Field;
import javax.swing.*;
import java.util.ArrayList;

public interface View {
    public void drawGrid(JPanel container, JFrame frame, int maxFields, ArrayList<ArrayList<Field>> map, boolean grid, int minisclae);
    public String getName();
}
