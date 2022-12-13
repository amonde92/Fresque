package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CreateImage extends JDialog implements ItemListener, ActionListener {
    JFrame frame;
    JPanel panel = new JPanel();
    JPanel currentPanel;
    CreateCercle createC = new CreateCercle(this);
    CreateEllipse createE = new CreateEllipse(this);
    CreatePolygone createP = new CreatePolygone(this);
    CreateLigne createL = new CreateLigne(this);

    JComboBox<String> transformation;

    JButton validateCreateImage = new JButton("Créer image");



    public CreateImage(JFrame frame) {
        this.frame = frame;
        JDialog creer_un_dessin = new JDialog(frame, "Créer une image");
        creer_un_dessin.setLayout(new GridBagLayout());
        GridBagConstraints contraint = new GridBagConstraints();
        String[] transfo = {"Choisssez une forme à ajouter","Cercle", "Ellipse", "Polygone", "Ligne"};

        transformation = new JComboBox<>(transfo);
        contraint.insets = new Insets(3, 20, 3, 20);
        contraint.gridx = 0;
        contraint.gridy = 0;
        //creer_un_dessin.add(labelCercle,contraint);
        creer_un_dessin.add(transformation, contraint);
        transformation.addItemListener(this);
        transformation.setSelectedIndex(0);
        creer_un_dessin.add(panel);

        contraint.gridx = 1;
        contraint.gridy = 1;
        creer_un_dessin.add(validateCreateImage,contraint);
        validateCreateImage.addActionListener(this);


        creer_un_dessin.setModal(true);
        creer_un_dessin.setLocation(250,150);
        creer_un_dessin.setSize(800, 350);
        creer_un_dessin.setVisible(true);
    }

    public JButton getValidateCreateImage() {
        return validateCreateImage;
    }

    public void setValidateCreateImage(JButton validateCreateImage) {
        this.validateCreateImage = validateCreateImage;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (currentPanel != null) panel.remove(currentPanel);

        switch (e.getItem().toString()) {
            case "Choisssez une forme à ajouter" -> currentPanel = null;
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


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createP.getValidation() ){
            this.transformation.setSelectedIndex(0);
        }
        if (e.getSource() == createE.getValidation() ){
            this.transformation.setSelectedIndex(0);
        }
        if (e.getSource() == createC.getValidation() ){
            this.transformation.setSelectedIndex(0);
        }
        if (e.getSource() == createL.getValidation() ){
            this.transformation.setSelectedIndex(0);
        }
        if (e.getSource() == validateCreateImage){
            System.out.println("ferler");
            this.setVisible(false);
            this.dispose();
        }
    }
}