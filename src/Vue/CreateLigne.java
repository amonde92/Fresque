package Vue;

import Forme.Ligne;
import Forme.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateLigne extends JPanel implements ActionListener {
    private Ligne ligne; // permet de créer une ligne pour la récupérer autre part
    JButton validation = new JButton("validation"); // créer le bouton pour valider la ligne
    JLabel X1 = new JLabel("X1 : "); // permet d'afficher ce qui est entre guillemet
    JLabel Y1 = new JLabel("Y1 : "); // permet d'afficher ce qui est entre guillemet
    JLabel X2 = new JLabel("X2 : "); // permet d'afficher ce qui est entre guillemet
    JLabel Y2 = new JLabel("Y2 : "); // permet d'afficher ce qui est entre guillemet
    JTextField X1_Enter = new JTextField(5); // permet d'entrer des valeurs
    JTextField Y1_Enter = new JTextField(5); // permet d'entrer des valeurs
    JTextField X2_Enter = new JTextField(5); // permet d'entrer des valeurs
    JTextField Y2_Enter = new JTextField(5); // permet d'entrer des valeurs

    CreateImage createImage;
    /**
     * la fonction CreateLingne permet de créer les éléments qui seront dans la fenêtre
     * dans le cas ou celle-ci est sélectionné.
     */
    public CreateLigne(CreateImage c) {
        this.createImage = c;
        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints(); // permet de créer des contrainte pour séparer des éléments
        contrainte.insets= new Insets(10,10,10,10); // définit l'espace entre chaque élément
        contrainte.gridx = 0; // déplace la contrainte dans l'axe des X
        contrainte.gridy = 0; // déplace la contrainte dans l'axe des Y
        add(X1,contrainte); // ajout de l'élément avec une certaine contrainte
        contrainte.gridx = 1; // déplace la contrainte dans l'axe des X
        add(X1_Enter, contrainte); // ajout de l'élément avec une certaine contrainte

        contrainte.gridx = 2; // déplace la contrainte dans l'axe des X
        add(Y1,contrainte); // ajout de l'élément avec une certaine contrainte
        contrainte.gridx = 3; // déplace la contrainte dans l'axe des X
        add(Y1_Enter, contrainte); // ajout de l'élément avec une certaine contrainte

        contrainte.gridx = 0; // déplace la contrainte dans l'axe des X
        contrainte.gridy = 1; // déplace la contrainte dans l'axe des Y
        add(X2,contrainte); // ajout de l'élément avec une certaine contrainte
        contrainte.gridx = 1; // déplace la contrainte dans l'axe des X
        add(X2_Enter, contrainte); // ajout de l'élément avec une certaine contrainte

        contrainte.gridx = 2; // déplace la contrainte dans l'axe des X
        add(Y2,contrainte); // ajout de l'élément avec une certaine contrainte
        contrainte.gridx = 3; // déplace la contrainte dans l'axe des X
        add(Y2_Enter, contrainte); // ajout de l'élément avec une certaine contrainte

        contrainte.gridy = 2; // déplace la contrainte dans l'axe des Y
        add(validation,contrainte); // ajout de l'élément avec une certaine contrainte
        validation.addActionListener(this); // ajout d'un listener sur le bouton
    }

    public JButton getValidation() {
        return validation;
    }

    public void setValidation(JButton validation) {
        this.validation = validation;
    }

    /**
     *          permet de récupérer les valeur mis dans les textfield
     *          et de créer la forme que l'on veux
     */


        @Override
        public void actionPerformed (ActionEvent e){
            if (e.getSource()== validation) {


                int Y1 = Integer.parseInt(String.valueOf(Y1_Enter.getText()));
                int X1 = Integer.parseInt(String.valueOf(X1_Enter.getText()));
                int Y2 = Integer.parseInt(String.valueOf(Y2_Enter.getText()));
                int X2 = Integer.parseInt(String.valueOf(X2_Enter.getText()));
                ligne = new Ligne(new Point(X1, Y1), new Point(X2, Y2));

            }
        }

    public void setLigne(Ligne ligne) {this.ligne = ligne;}
    public Ligne getLigne() {return ligne;}
}

