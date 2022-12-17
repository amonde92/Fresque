package Vue;

import Forme.Cercle;
import Forme.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateCercle extends JPanel implements ActionListener {
    /**
     * création des textes et de l'affiche du panel
     */
    private Cercle cercle;
    JButton validation = new JButton("validation");
    JLabel Centre_X = new JLabel("X : ");
    JLabel Centre_Y = new JLabel("Y : ");
    JLabel Rayon = new JLabel("R : ");
    JTextField RayonEnter = new JTextField(6);
    JTextField Centre_XEnter = new JTextField(6);
    JTextField Centre_YEnter = new JTextField(6);
    CreateImage createImage;


    /**
     * la fonction CreateCercle permet de créer les éléments qui seront dans la fenêtre
     * dans le cas ou celle-ci est sélectionné.
     */
    public CreateCercle (CreateImage c){
        this.createImage = c;
        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();
        contrainte.gridx = 0;
        contrainte.gridy = 0;
        add(Centre_X,contrainte);
        contrainte.gridx = 1;
        add(Centre_XEnter,contrainte);

        contrainte.gridx = 0;
        contrainte.gridy = 1;
        add(Centre_Y,contrainte);
        contrainte.gridx = 1;
        add(Centre_YEnter,contrainte);

        contrainte.gridx = 0;
        contrainte.gridy = 2;
        add(Rayon,contrainte);
        contrainte.gridx = 1;
        add(RayonEnter,contrainte);

        contrainte.gridx = 0;
        contrainte.gridy = 3;
        add(validation,contrainte);
        validation.addActionListener(c);

    }

    public JButton getValidation() {
        return validation;
    }

    /**
     * si le boutton de validation est appuyé on récupère les valeurs missent dans les texts
     * et on créé la forme en question
     */

    public void setValidation(JButton validation) {
        this.validation = validation;
    }

    public JLabel getCentre_X() {
        return Centre_X;
    }

    public void setCentre_X(JLabel centre_X) {
        Centre_X = centre_X;
    }

    public JLabel getCentre_Y() {
        return Centre_Y;
    }

    public void setCentre_Y(JLabel centre_Y) {
        Centre_Y = centre_Y;
    }

    public JLabel getRayon() {
        return Rayon;
    }

    public void setRayon(JLabel rayon) {
        Rayon = rayon;
    }

    public JTextField getRayonEnter() {
        return RayonEnter;
    }

    public void setRayonEnter(JTextField rayonEnter) {
        RayonEnter = rayonEnter;
    }

    public JTextField getCentre_XEnter() {
        return Centre_XEnter;
    }

    public void setCentre_XEnter(JTextField centre_XEnter) {
        Centre_XEnter = centre_XEnter;
    }

    public JTextField getCentre_YEnter() {
        return Centre_YEnter;
    }

    public void setCentre_YEnter(JTextField centre_YEnter) {
        Centre_YEnter = centre_YEnter;
    }

    public CreateImage getCreateImage() {
        return createImage;
    }

    public void setCreateImage(CreateImage createImage) {
        this.createImage = createImage;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== validation) {

            int Y1 = Integer.parseInt(String.valueOf(Centre_XEnter.getText()));
            int X1 = Integer.parseInt(String.valueOf(Centre_YEnter.getText()));
            int RayonX = X1+Integer.parseInt(String.valueOf(Centre_XEnter.getText()));
            int RayonY = Y1;
            cercle = new Cercle(new Point(X1,Y1),new Point(RayonX,RayonY));


        }

    }

    /**
     * setteur et getteur du cercle
     */

    public void setCercle(Cercle cercle) {
        this.cercle = cercle;
    }

    public Cercle getCercle() {
        return cercle;
    }
}
