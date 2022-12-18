import Dessin.Dessin;
import Forme.Cercle;
import Forme.Forme;
import Forme.Point;
import Forme.Polygone;
import Forme.Ligne;
import Image.Image;
import Vue.*;
import Forme.Ellipse;

import javax.swing.*;
import java.util.ArrayList;
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

        /*Point ctr = new Point(5, 2);
        Point a = new Point(7, 2);
        Point b = new Point(5, 3);
        Ellipse e = new Ellipse(ctr, a, b);

        System.out.println("Initiale :" +e);
        System.out.println("Aire : "+ e.Aire());
        System.out.println("Perimètre : "+ e.Perimetre());*/

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

        /*Point puu = new Point(1,2);
        puu.rotation();
        System.out.println(puu);*/











        //FDD

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
        // P.translation(new int[]{1, 1});
        //P.Print();
        //Frame fen = new Frame("Fresque");


        //fen.add(new JScrollPane(table));

        //image 1
        Image image1 = new Image();

        //Ligne
        Point d1 = new Point(470,100);
        Point d2 = new Point(550,30);
        Ligne ligne1 = new Ligne(d1,d2);

        //Cercle
        Point center1= new Point(50,20);
        Point ray1 = new Point(150,20);
        Cercle cercle1 = new Cercle(center1,ray1);

        //Ellipse
        Point c1 = new Point(150,150);
        Point a1 = new Point(250,150);
        Point b1 = new Point(150,100);
        Ellipse ellipse1 = new Ellipse(c1,a1,b1);



        //Polygone
        Point e1 = new Point(350,120);
        Point f1 = new Point(400,150);
        Point g1 = new Point(400,200);
        Point h1 = new Point(350,230);
        Point i1 = new Point(300,200);
        Point j1 = new Point(300,150);
        ArrayList<Point> listPoint1 = new ArrayList<>();
        listPoint1.add(e1);
        listPoint1.add(f1);
        listPoint1.add(g1);
        listPoint1.add(h1);
        listPoint1.add(i1);
        listPoint1.add(j1);
        Polygone polygone1 = new Polygone(listPoint1);

        image1.addFormes_geo(cercle1);
        image1.addFormes_geo(ligne1);
        image1.addFormes_geo(polygone1);
        image1.addFormes_geo(ellipse1);


        Image image2 = new Image();

        //Ligne
        Point z1 = new Point(30,30);
        Point z2 = new Point(120,100);
        Ligne ligne2 = new Ligne(z1,z2);

        //Cercle
        Point center2= new Point(150,150);
        Point ray2 = new Point(250,150);
        Cercle cercle2 = new Cercle(center2,ray2);

        //Ellipse
        Point c2 = new Point(380,50);
        Point a2 = new Point(550,50);
        Point b2 = new Point(380,0);
        Ellipse ellipse2 = new Ellipse(c2,a2,b2);



        //Polygone
        Point e2 = new Point(350,120);
        Point f2 = new Point(400,150);
        Point g2 = new Point(400,200);
        Point h2 = new Point(350,230);
        Point i2 = new Point(300,200);
        Point j2 = new Point(300,150);
        ArrayList<Point> listPoint2 = new ArrayList<>();
        listPoint2.add(e2);
        listPoint2.add(f2);
        listPoint2.add(g2);
        listPoint2.add(h2);
        listPoint2.add(i2);
        listPoint2.add(j2);
        Polygone polygone2 = new Polygone(listPoint2);

        image2.addFormes_geo(cercle2);
        image2.addFormes_geo(ligne2);
        image2.addFormes_geo(polygone2);
        image2.addFormes_geo(ellipse2);




        Dessin dessin = new Dessin();
        dessin.addImage(image1);
        dessin.addImage(image2);

        Image image3 = new Image();

        //Ligne
        Point x1 = new Point(470,100);
        Point x2 = new Point(550,30);
        Ligne ligne3 = new Ligne(x1,x2);

        //Cercle
        Point center3= new Point(50,20);
        Point ray3 = new Point(150,20);
        Cercle cercle3 = new Cercle(center3,ray3);

        //Ellipse
        Point c3 = new Point(150,150);
        Point a3 = new Point(250,150);
        Point b3 = new Point(150,100);
        Ellipse ellipse3 = new Ellipse(c3,a3,b3);



        //Polygone
        Point e3 = new Point(350,120);
        Point f3 = new Point(400,150);
        Point g3 = new Point(400,200);
        Point h3 = new Point(350,230);
        Point i3 = new Point(300,200);
        Point j3 = new Point(300,150);
        ArrayList<Point> listPoint3 = new ArrayList<>();
        listPoint3.add(e3);
        listPoint3.add(f3);
        listPoint3.add(g3);
        listPoint3.add(h3);
        listPoint3.add(i3);
        listPoint3.add(j3);
        Polygone polygone3 = new Polygone(listPoint3);

        image3.addFormes_geo(cercle3);
        image3.addFormes_geo(ligne3);
        image3.addFormes_geo(polygone3);
        image3.addFormes_geo(ellipse3);


        Image image4 = new Image();

        //Ligne
        Point y1 = new Point(30,30);
        Point y2 = new Point(120,100);
        Ligne ligne4 = new Ligne(y1,y2);

        //Cercle
        Point center4= new Point(150,150);
        Point ray4 = new Point(250,150);
        Cercle cercle4 = new Cercle(center4,ray4);

        //Ellipse
        Point c4 = new Point(380,50);
        Point a4 = new Point(550,50);
        Point b4= new Point(380,0);
        Ellipse ellipse4 = new Ellipse(c4,a4,b4);



        //Polygone
        Point e4 = new Point(350,120);
        Point f4 = new Point(400,150);
        Point g4 = new Point(400,200);
        Point h4 = new Point(350,230);
        Point i4 = new Point(300,200);
        Point j4 = new Point(300,150);
        ArrayList<Point> listPoint4 = new ArrayList<>();
        listPoint4.add(e4);
        listPoint4.add(f4);
        listPoint4.add(g4);
        listPoint4.add(h4);
        listPoint4.add(i4);
        listPoint4.add(j4);
        Polygone polygone4 = new Polygone(listPoint4);

        image4.addFormes_geo(cercle4);
        image4.addFormes_geo(ligne4);
        image4.addFormes_geo(polygone4);
        image4.addFormes_geo(ellipse4);



        Dessin dessinBis = new Dessin();
        dessinBis.addImage(image3);
        dessinBis.addImage(image4);


        Frame fen = new Frame("Fresque", dessin, dessinBis);

        /*Point A = new Point(8,10);
        Point A1 = new Point(8,10);
        Point B = new Point(8,8);
        Point B1 = new Point(8,8);
        Point D = new Point(10,10);
        Point D1 = new Point(10,10);
        Point C = new Point(10,8);
        Point C1 = new Point(10,8);
        Point E = new Point(8,12);*/

    }
}