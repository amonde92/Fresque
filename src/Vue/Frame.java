package Vue;

import Dessin.Dessin;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    Dessin dessin;
    Dessin dessinBis;
    public Frame(String a, Dessin dessin, Dessin dessinBis){
        this.dessin = dessin;
        this.dessinBis = dessinBis;
        // Titre
        setTitle(a);
        // taille : 400 pixels largeur et 100 pixels hauteur
        setSize(1250, 650);
        // Au centre
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBackground(Color.cyan);
        // Fenetre visible
        PanelMereBis panel = new PanelMereBis(dessin, dessinBis);
        add(panel);
        panel.setVisible(true);
        setVisible(true);
    }
}
