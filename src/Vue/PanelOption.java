package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * PanelOption qui va afficher les options possibles pour l'utilisateur
 */
public class PanelOption extends JPanel  {
    //JButton create = new JButton ("Créer une Image");
    String[] transfo = {"Transformation","Copie","Homothétie","Translation"};
    JComboBox<String> transformation = new JComboBox<>(transfo);

    //public JButton getCreate() {
        //return create;
    //}

    private PanelMereBis panelMereBis;
    private PanelFresque panelFresque;
    JButton aire = new JButton ("Aire");
    JButton perimetre = new JButton ("Périmètre");
    JLabel display_aire = new JLabel("Aire");
    JLabel display_perimetre = new JLabel ("Périmètre");

    public String[] getTransfo() {
        return transfo;
    }

    public void setTransfo(String[] transfo) {
        this.transfo = transfo;
    }

    public JButton getAire() {
        return aire;
    }

    public void setAire(JButton aire) {
        this.aire = aire;
    }

    public JButton getPerimetre() {
        return perimetre;
    }

    public void setPerimetre(JButton perimetre) {
        this.perimetre = perimetre;
    }

    public JLabel getDisplay_aire() {
        return display_aire;
    }

    public void setDisplay_aire(JLabel display_aire) {
        this.display_aire = display_aire;
    }

    public JLabel getDisplay_perimetre() {
        return display_perimetre;
    }

    public void setDisplay_perimetre(JLabel display_perimetre) {
        this.display_perimetre = display_perimetre;
    }

    public PanelOption(PanelMereBis panelMereBis, PanelFresque panelFresque) {
        setLayout(new GridBagLayout());
        setBackground(Color.BLUE);
        this.panelMereBis = panelMereBis;
        this.panelFresque = panelFresque;

        GridBagConstraints contraint = new GridBagConstraints();


        contraint.anchor = GridBagConstraints.NORTHEAST;

        contraint.gridx = 0;
        contraint.insets = new Insets(10,20,10,20);

        //add(create,contraint);
        //create.addActionListener(panelMere);

        //contraint.gridx = 0;
        add(transformation,contraint);
        transformation.addItemListener(panelFresque);
        transformation.setSelectedItem("Transformation");


        contraint.gridx = 1;
        add(aire,contraint);
        aire.addActionListener(panelMereBis);

        contraint.gridx = 2;
        add(display_aire,contraint);
        display_aire.setVisible(false);

        contraint.gridx = 3;
        add(perimetre,contraint);
        perimetre.addActionListener(panelMereBis);

        contraint.gridx = 4;
        add(display_perimetre,contraint);
        display_perimetre.setVisible(false);

        this.updateUI();

    }
}
