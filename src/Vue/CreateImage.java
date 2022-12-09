
package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CreateImage extends JDialog implements ItemListener {

    JFrame frame;

    public CreateImage(JFrame frame) {
        this.frame = frame;
        JDialog creer_un_dessin = new JDialog(frame, "Créer une image");
        creer_un_dessin.setLayout(new GridBagLayout());
        GridBagConstraints contraint = new GridBagConstraints();
        String[] transfo = {"Cercle", "Elipse", "Polygone", "Ligne"};

        JComboBox<String> transformation = new JComboBox<>(transfo);
        contraint.insets = new Insets(3, 20, 3, 20);
        contraint.gridx = 0;
        contraint.gridy = 0;
        //creer_un_dessin.add(labelCercle,contraint);
        creer_un_dessin.add(transformation, contraint);
        transformation.addItemListener(this);


        creer_un_dessin.setModal(true);
        creer_un_dessin.setLocationRelativeTo(null);
        creer_un_dessin.setSize(900, 400);
        creer_un_dessin.setVisible(true);
    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        if (frame != null) this.remove(frame);

        /*switch (e.getItem().toString()) {
            case "Cercle" -> frame =;
            case "Elipse" -> frame =;
            case "Polygone" -> frame =;
            case "Ligne" -> frame =;


            System.out.println("ca marche");*/


    }
}


