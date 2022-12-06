package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PanelMere extends JPanel implements ItemListener, ActionListener {
    JPanel currentPanel;
    PanelTranslation translation =new PanelTranslation();
    PanelFresque homotethie = new PanelFresque("Homotéthie");
    PanelFresque rotation = new PanelFresque("Rotation");
    PanelFresque sym_centrale = new PanelFresque("Symétrie Centrale");
    PanelFresque sym_axiale = new PanelFresque("Symétrie Axiale");
    JFrame frame;

    public PanelMere(JFrame frame) {
        this.frame = frame;
        setLayout(new BorderLayout());
        PanelOption panelOption = new PanelOption(this);
        add(panelOption, BorderLayout.NORTH);

        translation.setVisible(true);
        rotation.setVisible(true);
        sym_centrale.setVisible(true);
        sym_axiale.setVisible(true);
        homotethie.setVisible(true);

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println(e.getItem());

        if (currentPanel != null) this.remove(currentPanel);

        switch (e.getItem().toString()) {
            case "Homothétie" -> currentPanel = homotethie;
            case "Rotation" -> currentPanel = rotation;
            case "Symétrie Centrale" -> currentPanel = sym_centrale;
            case "Symétrie Axiale" -> currentPanel = sym_axiale;
            case "Translation" -> currentPanel = translation;
        }

        System.out.println(currentPanel);
        if (currentPanel != null) {
            this.add(currentPanel);
        }

        this.updateUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() != null ){
            JButton ajout = new JButton("Ajouter une image");

            //Cercle
            JLabel labelCercle = new JLabel("Cercle");
            JLabel centreCercleX = new JLabel("x : ");
            JLabel centreCercleY = new JLabel("y : ");
            JLabel Rayon = new JLabel("Rayon : ");

            //Ellipse
            JLabel labelEllipse = new JLabel("Ellipse");
            JLabel absiceEllipse = new JLabel("x : ");
            JLabel ordonneEllipse = new JLabel("y : ");

            //Polygone
            JLabel labelPolygone = new JLabel("Polygone");
            JLabel x = new JLabel("x : ");
            JLabel y = new JLabel("y : ");

            JDialog d = new JDialog(frame,"Créer un dessin");
            d.setLayout(new GridBagLayout());
            GridBagConstraints c = new GridBagConstraints();
            c.insets = new Insets(10,20,10,20);
            c.gridx = 0;
            c.gridy =0;
            d.add(labelCercle,c);
            c.gridx =1;
            d.add(centreCercleX,c);
            c.gridx = 2;
            d.add(centreCercleY,c);
            c.gridx=3;
            d.add(Rayon,c);

            c.gridx = 0;
            c.gridy =1;
            d.add(labelEllipse,c);

            c.gridx = 1;
            d.add(absiceEllipse,c);
            c.gridx = 2;
            d.add(ordonneEllipse,c);


            d.setModal(true);
            d.setLocationRelativeTo(null);
            d.setSize(200,200);
            d.setVisible(true);
        }
    }
}
