package Vue;

import Forme.Point;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PointPolygoneTable extends AbstractTableModel {

    private final String[] entetes = { "X", "Y"};
    private final ArrayList<Point> points;

    public PointPolygoneTable(ArrayList<Point> points) {
        this.points = points;
    }

    @Override
    public int getColumnCount() {
        return entetes.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
    @Override
    public int getRowCount() {
        return points.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> points.get(rowIndex).getX();
            case 1 -> points.get(rowIndex).getY();
            default -> null;
        };
    }

}
