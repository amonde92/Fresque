package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOption extends JPanel implements ActionListener {
    JButton create = new JButton ("Créer un dessin");
    String[] transfo = {"Transformation","Homothétie","Translation","Rotation","Symétrie Centrale","Symétrie Axiale"};
    JComboBox<String> transformation = new JComboBox<>(transfo);

    private PanelMere panelMere;
    JButton aire = new JButton ("Aire");
    JButton perimetre = new JButton ("Périmètre");
    JLabel display_aire = new JLabel("Aire");
    JLabel display_perimetre = new JLabel ("Périmètre");

    public PanelOption(PanelMere panelMere) {
        setLayout(new GridBagLayout());
        setBackground(Color.BLUE);
        this.panelMere = panelMere;

        GridBagConstraints c = new GridBagConstraints();


        c.anchor = GridBagConstraints.NORTHEAST;

        c.gridy = 0;

        c.gridx = 0;
        c.insets = new Insets(10,20,10,20);

        add(create,c);
        create.addActionListener(panelMere);

        c.gridx = 1;
        transformation.addItemListener(panelMere);
        add(transformation,c);


        c.gridx = 2;
        add(aire,c);
        aire.addActionListener(this);

        c.gridx = 3;
        add(display_aire,c);
        display_aire.setVisible(false);

        c.gridx = 4;
        add(perimetre,c);
        perimetre.addActionListener(this);

        c.gridx = 5;
        add(display_perimetre,c);
        display_perimetre.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== aire) {
            display_aire.setVisible(true);
        }
        if (e.getSource()== perimetre) {
            display_perimetre.setVisible(true);
        }
    }
}
