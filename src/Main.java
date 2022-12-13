import Forme.Cercle;
import Forme.Forme;
import Forme.Point;
import Forme.Polygone;
import Vue.CreateEllipse;
import Vue.Frame;
import Forme.Ellipse;
import Vue.PointPolygoneTable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Point A = new Point(0,0);
        Point B = new Point(1,0);
        Point C = new Point(1,1);
        Point D = new Point(0,1);
        ArrayList<Point> point = new ArrayList<>();
        point.add(A);
        point.add(B);
        point.add(C);
        point.add(D);
        Polygone P = new Polygone(point);
        P.Print();

        Frame fen = new Frame("Fresque");
        //fen.add(new JScrollPane(table));

    }
}