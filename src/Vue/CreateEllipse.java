package Vue;

import Forme.Ellipse;
import Forme.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateEllipse extends JPanel implements ActionListener {

    /**
     * création des textes et de l'affiche du panel
     */
    private Ellipse ellipse;
    JButton validation = new JButton("validation");
    JLabel CentreX = new JLabel("X : ");
    JLabel CentreY = new JLabel("Y : ");
    JLabel A = new JLabel("Demi axe horizontal : ");

    JLabel B = new JLabel(" Demi axe verticale : ");

    JTextField CentreX_Entre = new JTextField(6);
    JTextField CentreY_Entre = new JTextField(6);
    JTextField AText = new JTextField(6);
    JTextField BText = new JTextField(6);
    CreateImage createImage;

    /**
     * mise en place des texts et de l'affichage du panelh
     * mise en place d'action Listener
     */


    public CreateEllipse(CreateImage c) {
            this.createImage = c;
            setLayout(new GridBagLayout());
            GridBagConstraints contrainte = new GridBagConstraints();

            contrainte.gridx = 0;
            contrainte.gridy = 0;
            add(CentreX, contrainte);
            contrainte.gridx = 1;
            add(CentreX_Entre, contrainte);

            contrainte.gridx = 0;
            contrainte.gridy = 1;
            add(CentreY, contrainte);
            contrainte.gridx = 1;
            add(CentreY_Entre, contrainte);

            contrainte.gridx = 2;
            contrainte.gridy = 0;
            add(A, contrainte);
            contrainte.gridx = 3;
            add(AText, contrainte);

            contrainte.gridx = 2;
            contrainte.gridy = 1;
            add(B, contrainte);
            contrainte.gridx = 3;
            contrainte.gridy = 1;
            add(BText, contrainte);

            contrainte.gridx = 4;
            add(validation, contrainte);
            validation.addActionListener(c);

        }

        public JButton getValidation() {
            return validation;
        }

        public void setValidation(JButton validation) {
            this.validation = validation;
        }






    /**
     * si le boutton de validation est appuyé on récupère les valeur mis dans les texts
     * et on créé la forme en question
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == validation) {

            int Y1 = Integer.parseInt(String.valueOf(CentreY_Entre.getText()));
            int X1 = Integer.parseInt(String.valueOf(CentreX_Entre.getText()));
            int Ax = X1 + Integer.parseInt(String.valueOf(AText.getText()));
            int Ay = Y1;
            int Bx = X1;
            int By = Y1 + Integer.parseInt(String.valueOf(BText.getText()));
            ellipse = new Ellipse(new Point(X1, Y1), new Point(Ax, Ay), new Point(Bx, By));

        }
    }

    /**
     * setteur et getteur de l'éllipse
     */
    public Ellipse getEllipse() {return ellipse;}

    public void setEllipse(Ellipse ellipse) {this.ellipse = ellipse;}
}

