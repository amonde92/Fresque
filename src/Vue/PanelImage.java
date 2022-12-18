package Vue;

import Forme.Forme;
import Image.Image;
import Forme.Cercle;
import Forme.Ellipse;
import Forme.Polygone;
import Forme.Ellipse;
import Forme.Ligne;

import javax.swing.*;
import java.awt.*;

/**
 * PanelImage qui va dessiner les formes selons les formes présentes dans les images,
 */
public class PanelImage extends JPanel {
    Image image;

    public PanelImage(Image image) {
        this.image = image;
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
        g.setColor(Color.RED);
        for (Forme forme : image.getListeForme()) {
            if (forme.getClass().equals(Cercle.class)) {
                System.out.println("Cercle");
                g.drawOval(((Cercle) forme).getCenter().getX(),((Cercle) forme).getCenter().getY(),
                        (int) ((Cercle) forme).getRay().Distance(), (int) ((Cercle) forme).getRay().Distance());

            } else if (forme.getClass().equals(Ligne.class)) {
                System.out.println("Ligne");
                g.drawLine(((Ligne) forme).getA().getX(),((Ligne) forme).getA().getY(),
                        ((Ligne) forme).getB().getX(),((Ligne) forme).getB().getY());

            } else if (forme.getClass().equals(Polygone.class)) {
                System.out.println("Polygone");
                for(Ligne ligne: ((Polygone) forme).getCote()){
                    g.drawLine(ligne.getA().getX(),ligne.getA().getY(),
                            ligne.getB().getX(),ligne.getB().getY());
                }

            } else if (forme.getClass().equals(Ellipse.class)) {
                System.out.println("Ellipse");
                g.drawOval(((Ellipse) forme).getCenter().getX(),((Ellipse) forme).getCenter().getY(),
                        (int) ((Ellipse) forme).getRayonA().Distance(), (int) ((Ellipse) forme).getRayonB().Distance());
            }
            else {
                System.out.println("erreur");
            }
        }
    }

}
