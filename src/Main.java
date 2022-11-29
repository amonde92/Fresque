import Forme.Cercle;
import Forme.Ellipse;
import Forme.Point;

import javax.swing.*;
import java.awt.*;

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


        Cercle c = new Cercle(new Point(300,400),new Point(600,500));

        System.out.println("Initiale :" +c.toString());
        System.out.println("Aire : "+ c.Aire());
        System.out.println("Perimètre : "+ c.Perimetre());

        c.homothetie(2);
        System.out.println("Homothétie :" + c);

        c.translation(new int[]{50, 100});
        System.out.println("Translation :" + c);

        c.symetrie_axiale();
        System.out.println("Symétrie axiale:" + c);

        c.symetrie_centrale();
        System.out.println("Symétire centrale :" + c);

        c.rotation();
        System.out.println("Rotation :" +c);








        Frame fen = new Frame("Fresque");
        Panel pan = new Panel();
        fen.add(pan);

    }
}