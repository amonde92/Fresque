package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateCercle extends JPanel implements ActionListener {

    JButton validation = new JButton("validation");
    JLabel Centre_X = new JLabel("X : ");
    JLabel Centre_Y = new JLabel("Y : ");
    JLabel Rayon = new JLabel("R : ");
    JTextField RayonEnter = new JTextField();
    JTextField Centre_XEnter = new JTextField();
    JTextField Centre_YEnter = new JTextField();

    public CreateCercle (){
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
        validation.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== validation) {

            int Y1 = Integer.parseInt(String.valueOf(Centre_XEnter.getText()));
            int X1 = Integer.parseInt(String.valueOf(Centre_YEnter.getText()));
            int RayonX = X1+Integer.parseInt(String.valueOf(Centre_XEnter.getText()));
            int RayonY = Y1;

        }

    }
}
