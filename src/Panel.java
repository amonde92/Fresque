import Forme.Ellipse;
import Forme.Ligne;
import Forme.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Panel extends JPanel {
    JButton aire = new JButton ("Aire");
    JButton perimetre = new JButton ("Perimètre");
    JButton  homothetie= new JButton ("Homothétie");
    JButton translation = new JButton ("Translation");
    JButton rotation = new JButton ("Rotation");
    JButton sym_centrale = new JButton ("Symétrie Centrale");
    JButton sym_axiale = new JButton ("Symétrie Axiale");
    public Panel() {
        //Définition de sa couleur de fond
        this.setBackground(Color.ORANGE);
        add(aire);
        add(perimetre);
        add(homothetie);
        add(translation);
        add(rotation);
        add(sym_centrale);
        add(sym_axiale);

    }
    public void paintComponent (Graphics g){
        /*Ellipse e = new Ellipse(new Forme.Point(40,40),
                new Ligne(new Forme.Point(120,100),
                        new Forme.Point(400,500)),new Ligne(
                                new Forme.Point(600,700), new Forme.Point(300,200)));*/
        Ellipse e = new Ellipse(new Forme.Point(500,200),
                new Point(200,600),
                new Point(100,50));
        Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(Color.BLACK);
        g2.draw(new Ellipse2D.Double(e.getCenter().getX(),e.getCenter().getY() , e.getRayonA().Distance(), e.getRayonB().Distance()));

    }
}
