import Forme.Cercle;
import Forme.Forme;
import Forme.Point;
import Forme.Polygone;
import Vue.Frame;
import Forme.Ellipse;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*Ellipse e = new Ellipse(new Forme.Point(600,300),
                new Forme.Point(200,600),
                new Point(100,50));
        System.out.println("Initiale :" +e.toString());
        System.out.println("Aire : "+ e.Aire());
        System.out.println("Perimètre : "+ e.Perimetre());

        e.homothetie(2);
        System.out.println("Homothétie :" + e);

        e.translation(new int[]{50, 100});
        System.out.println("Translation :" + e);

        e.symetrie_axiale();
        System.out.println("Symétrie axiale:" + e);

        e.symetrie_centrale();
        System.out.println("Symétire centrale :" + e);

        e.rotation();
        System.out.println("Rotation :" +e);*/


        /*Cercle c = new Cercle(new Point(300,400),new Point(600,500));
        Cercle b = new Cercle(new Point(300,400),new Point(600,500));

        TreeSet<Forme> f =new TreeSet<>();
        //f.add(c);
        f.add(b);

        for (Forme p:f){
            System.out.println("eee");
            System.out.println(p.toString()+"\n");
        }*/

        Point ctr = new Point(5, 2);
        Point a = new Point(7, 2);
        Point b = new Point(5, 3);
        Ellipse e = new Ellipse(ctr, a, b);

        System.out.println("Initiale :" +e);
        System.out.println("Aire : "+ e.Aire());
        System.out.println("Perimètre : "+ e.Perimetre());

        /*e.homothetie(2);
        System.out.println("Homothétie :" + e);

        e.translation(new int[]{50, 100});
        System.out.println("Translation :" + e);

        e.symetrie_axiale();
        System.out.println("Symétrie axiale:" + e);

        e.symetrie_centrale();
        System.out.println("Symétire centrale :" + e);*/

        /*Point ctr = new Point(0, 0);
        Point a = new Point(5, 0);
        Cercle c = new Cercle(ctr,a);

        System.out.println("Initiale :" +c);
        System.out.println("Aire : "+ c.Aire());
        System.out.println("Perimètre : "+ c.Perimetre());

        c.homothetie(2);
        System.out.println("Homothétie :" + c);

        c.translation(new int[]{50, 100});
        System.out.println("Translation :" + c);

        c.symetrie_axiale();
        System.out.println("Symétrie axiale:" + c);

        c.symetrie_centrale();
        System.out.println("Symétire centrale :" + c);*/

        int [][] T = new int[][]{{1,2}, {3,4}, {-3,7}, {6,1},{4,0}};
        Polygone P = new Polygone(T);


        System.out.println(P.Aire());


        System.out.println(P.getClass().equals(P.getClass()));







        //FDD
        Frame fen = new Frame("Fresque");

    }
}