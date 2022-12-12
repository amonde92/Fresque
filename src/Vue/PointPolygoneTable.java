package Vue;

import Forme.Point;

import javax.swing.table.AbstractTableModel;

public class PointPolygoneTable extends AbstractTableModel {

    private final String[] entetes = { "X", "Y"};
    private final Point[] points;

    public PointPolygoneTable(Point[] points) {
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
        return points.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return switch (columnIndex) {
            case 0 -> points[rowIndex].getX();
            case 1 -> points[rowIndex].getY();
            default -> null;
        };
    }

}
