package Vue;

import Dessin.Dessin;
import Forme.*;
import Forme.Point;
import Image.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.geom.Ellipse2D;

public class PanelFresque extends JPanel implements ItemListener {
    PanelDessin panelDessin;
    Dessin dessin;
    Dessin dessinBis;
    Dessin d = new Dessin();

    PanelDessin panD;
    public PanelFresque (Dessin dessin, Dessin dessinBis ){
        this.dessin = dessin;
        this.dessinBis = dessinBis;
        GridLayout gridLayout = new GridLayout(1, 2, 5, 10);
        setLayout(gridLayout);
        panelDessin = new PanelDessin(dessin);
        panelDessin.setSize(500,500);
        add (panelDessin);
        panelDessin.setVisible(true);


        panD = new PanelDessin(d);
        add(panD);
        panD.setVisible(true);

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

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getItem()!=null){
            System.out.println(e.getItem().toString());
        }
        if (panD != null) this.remove(panD);

        switch (e.getItem().toString()) {
            case "Transformation" -> {
                panD = new PanelDessin(d);
            }
            case "Copie" -> {
                Dessin copie = dessin.copie();
                panD = new PanelDessin(copie);
            }
            case "Homothétie" -> {
                dessinBis.homothetie(2);
                panD = new PanelDessin(dessinBis);
            }
            case "Translation" -> {
                dessinBis.translation(new int[]{10, 10});
                panD = new PanelDessin(dessinBis);
            }
        }

        System.out.println(panD);
        if (panD != null) {
            this.add(panD);
            panD.setVisible(true);
        }
        this.updateUI();
    }
}
