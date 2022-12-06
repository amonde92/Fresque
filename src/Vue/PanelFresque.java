package Vue;

import Forme.Cercle;
import Forme.Point;

import javax.swing.*;
import java.awt.*;

public class PanelFresque extends JPanel{
    Cercle cercle = new Cercle(new Point(0,0),new Point(100,100));
    JLabel titre;

    public PanelFresque (String t){
        titre = new JLabel(t);
        add(titre);
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(cercle.getCenter().getX(), cercle.getCenter().getY(), 100, 100);
    }
}
