package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateLigne extends JPanel implements ActionListener {
    JButton validation = new JButton("validation");
    JLabel X1 = new JLabel("X1 : ");
    JLabel Y1 = new JLabel("Y1 : ");
    JLabel X2 = new JLabel("X2 : ");
    JLabel Y2 = new JLabel("Y2 : ");
    JTextField X1_Enter = new JTextField();
    JTextField Y1_Enter = new JTextField();
    JTextField X2_Enter = new JTextField();
    JTextField Y2_Enter = new JTextField();


    public CreateLigne() {
        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();
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
    }
        @Override
        public void actionPerformed (ActionEvent e){

        }

}

