package Vue;

import javax.swing.*;
import java.awt.*;

public class CreateElipse  extends JPanel{
        JButton validation = new JButton("validation");
        JLabel Centre_X = new JLabel("X : ");
        JLabel Centre_Y = new JLabel("Y : ");
        JLabel Rayon_A = new JLabel("R : ");
        JTextField Rayon_AEnter = new JTextField();
        JLabel Rayon_B = new JLabel("R : ");
        JTextField Rayon_BEnter = new JTextField();
        JTextField Centre_XEnter = new JTextField();
        JTextField Centre_YEnter = new JTextField();

        public CreateElipse (){
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
            add(Rayon_A,contrainte);
            contrainte.gridx = 1;
            add(Rayon_AEnter,contrainte);
            contrainte.gridx = 0;
            contrainte.gridy = 3;
            add(Rayon_B,contrainte);
            contrainte.gridx = 1;
            add(Rayon_BEnter,contrainte);

            contrainte.gridx = 0;
            contrainte.gridy = 4;
            add(validation,contrainte);

        }
    }


