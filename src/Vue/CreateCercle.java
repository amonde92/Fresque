package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateCercle extends JPanel implements ActionListener {

    JButton validation = new JButton("valider");
    JLabel Centre_X = new JLabel("X : ");
    JLabel Centre_Y = new JLabel("Y : ");
    JLabel Rayon = new JLabel("Rayon: ");
    JTextField RayonEnter = new JTextField(6);
    JTextField Centre_XEnter = new JTextField(6);
    JTextField Centre_YEnter = new JTextField(6);

    public CreateCercle (){
        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();
        contrainte.gridx = 0;
        contrainte.gridy = 0;
        add(Centre_X,contrainte);
        contrainte.gridx = 1;
        add(Centre_XEnter,contrainte);

        contrainte.gridx = 2;
        add(Centre_Y,contrainte);
        contrainte.gridx = 3;
        add(Centre_YEnter,contrainte);

        contrainte.gridx = 4;
        add(Rayon,contrainte);
        contrainte.gridx = 5;
        add(RayonEnter,contrainte);

        contrainte.gridx = 6;
        add(validation,contrainte);
        validation.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
