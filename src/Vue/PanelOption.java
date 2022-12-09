package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelOption extends JPanel implements ActionListener {
    JButton create = new JButton ("Créer une Image");
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

        GridBagConstraints contraint = new GridBagConstraints();


        contraint.anchor = GridBagConstraints.NORTHEAST;

        contraint.gridy = 0;

        contraint.gridx = 0;
        contraint.insets = new Insets(10,20,10,20);

        add(create,contraint);
        create.addActionListener(panelMere);

        contraint.gridx = 1;
        transformation.addItemListener(panelMere);
        transformation.setSelectedIndex(0);
        add(transformation,contraint);


        contraint.gridx = 2;
        add(aire,contraint);
        aire.addActionListener(this);

        contraint.gridx = 3;
        add(display_aire,contraint);
        display_aire.setVisible(false);

        contraint.gridx = 4;
        add(perimetre,contraint);
        perimetre.addActionListener(this);

        contraint.gridx = 5;
        add(display_perimetre,contraint);
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
