package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CreateImage extends JDialog implements ItemListener {
    JFrame frame;
    JPanel panel = new JPanel();
    JPanel currentPanel;
    CreateCercle createC = new CreateCercle();
    CreateEllipse createE = new CreateEllipse();
    CreatePolygone createP = new CreatePolygone();
    CreateLigne createL = new CreateLigne();

    public CreateImage(JFrame frame) {
        this.frame = frame;
        JDialog creer_un_dessin = new JDialog(frame, "Créer une image");
        creer_un_dessin.setLayout(new GridBagLayout());
        GridBagConstraints contraint = new GridBagConstraints();
        String[] transfo = {"Cercle", "Ellipse", "Polygone", "Ligne"};

        JComboBox<String> transformation = new JComboBox<>(transfo);
        contraint.insets = new Insets(3, 20, 3, 20);
        contraint.gridx = 0;
        contraint.gridy = 0;
        //creer_un_dessin.add(labelCercle,contraint);
        creer_un_dessin.add(transformation, contraint);
        transformation.addItemListener(this);
        creer_un_dessin.add(panel);


        creer_un_dessin.setModal(true);
        creer_un_dessin.setLocationRelativeTo(null);
        creer_un_dessin.setSize(900, 400);
        creer_un_dessin.setVisible(true);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (currentPanel != null) panel.remove(currentPanel);
        ;
        switch (e.getItem().toString()) {
            case "Cercle" -> currentPanel = createC;
            case "Ellipse" -> currentPanel = createE;
            case "Polygone" -> currentPanel = createP;
            case "Ligne" -> currentPanel = createL;
        }

        System.out.println(currentPanel);
        if (currentPanel != null) {
            panel.add(currentPanel);
        }
        panel.updateUI();

    }


}