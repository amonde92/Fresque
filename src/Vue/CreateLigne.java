package Vue;

import Forme.Ligne;
import Forme.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateLigne extends JPanel implements ActionListener {
    private Ligne ligne;
    JButton validation = new JButton("validation");
    JLabel X1 = new JLabel("X1 : ");
    JLabel Y1 = new JLabel("Y1 : ");
    JLabel X2 = new JLabel("X2 : ");
    JLabel Y2 = new JLabel("Y2 : ");
    JTextField X1_Enter = new JTextField(5);
    JTextField Y1_Enter = new JTextField(5);
    JTextField X2_Enter = new JTextField(5);
    JTextField Y2_Enter = new JTextField(5);

    CreateImage createImage;


    public CreateLigne(CreateImage c) {
        this.createImage = c;
        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();
        contrainte.insets= new Insets(10,10,10,10);
        contrainte.gridx = 0;
        contrainte.gridy = 0;
        add(X1,contrainte);
        contrainte.gridx = 1;
        add(X1_Enter, contrainte);

        contrainte.gridx = 2;
        add(Y1,contrainte);
        contrainte.gridx = 3;
        add(Y1_Enter, contrainte);

        contrainte.gridx = 0;
        contrainte.gridy = 1;
        add(X2,contrainte);
        contrainte.gridx = 1;
        add(X2_Enter, contrainte);

        contrainte.gridx = 2;
        add(Y2,contrainte);
        contrainte.gridx = 3;
        add(Y2_Enter, contrainte);

        contrainte.gridy = 2;
        add(validation,contrainte);
        validation.addActionListener(c);
    }

    public JButton getValidation() {
        return validation;
    }

    public void setValidation(JButton validation) {
        this.validation = validation;
    }

    public JTextField getX1_Enter() {
        return X1_Enter;
    }

    public void setX1_Enter(JTextField x1_Enter) {
        X1_Enter = x1_Enter;
    }

    public JTextField getY1_Enter() {
        return Y1_Enter;
    }

    public void setY1_Enter(JTextField y1_Enter) {
        Y1_Enter = y1_Enter;
    }

    public JTextField getX2_Enter() {
        return X2_Enter;
    }

    public void setX2_Enter(JTextField x2_Enter) {
        X2_Enter = x2_Enter;
    }

    public JTextField getY2_Enter() {
        return Y2_Enter;
    }

    public void setY2_Enter(JTextField y2_Enter) {
        Y2_Enter = y2_Enter;
    }

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

