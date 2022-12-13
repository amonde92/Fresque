package Vue;

import Forme.Cercle;
import Forme.Ellipse;
import Forme.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class PanelFresque extends JPanel{
    Cercle cercle = new Cercle(new Point(0,0),new Point(100,100));
    //Ellipse e =new Ellipse(new Point(0,100),new Point(500,80),new Point(70,150));


    Point ctr = new Point(0, 0);
    Point a = new Point(50, 10);
    Point b = new Point(30, 15);
    Ellipse e = new Ellipse(ctr, a, b);
    JLabel titre;

    public PanelFresque (String t){
        titre = new JLabel(t);
        add(titre);
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(Color.RED);
        g2.setStroke(new BasicStroke(5.0f));
        g2.draw(new Ellipse2D.Double(e.getCenter().getX(), e.getCenter().getY(),e.getRayonA().Distance(), e.getRayonB().Distance()));

        //e.translation(new int[]{100,200});
        //e.
        //g2.draw(new Ellipse2D.Double(e.getCenter().getX(), e.getCenter().getY(),e.getRayonA().Distance(), e.getRayonB().Distance()));
        }

    public void getCenter() {
        // Obtenir les dimensions du panel
        Dimension dim = this.getSize();
        int largueurPanel = dim.width;
        int hauteurPanel = dim.height;

        // Calculer les coordonnées du milieu du panel
        int x = largueurPanel / 2;
        int y = hauteurPanel / 2;

        // Retourner un objet Point contenant les coordonnées du milieu du panel
        System.out.println(x + "aa "+y);
    }

}
