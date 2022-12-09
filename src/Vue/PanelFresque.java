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


    Point ctr = new Point(200, 200);
    Point a = new Point(500, 100);
    Point b = new Point(300, 150);
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
        e.symetrie_axiale();
        g2.draw(new Ellipse2D.Double(e.getCenter().getX(), e.getCenter().getY(),e.getRayonA().Distance(), e.getRayonB().Distance()));

    }
}
