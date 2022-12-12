package Vue;

import javax.swing.*;
import java.awt.*;

public class CreateEllipse extends JPanel{
        JButton validation = new JButton("validation");
        JLabel Center = new JLabel("Centre : ");
        JLabel A = new JLabel("Demi axe horizontal : ");

        JLabel B = new JLabel(" Demi axe verticale : ");

        JTextField centerText = new JTextField(6);
        JTextField AText = new JTextField(6);
        JTextField BText = new JTextField(6);

        public CreateEllipse(){
            setLayout(new GridBagLayout());
            GridBagConstraints contrainte = new GridBagConstraints();

            contrainte.gridx = 0;
            contrainte.gridy = 0;
            add(Center,contrainte);
            contrainte.gridx = 1;
            add(centerText,contrainte);

            contrainte.gridx = 2;
            add(A,contrainte);
            contrainte.gridx = 3;
            add(AText,contrainte);

            contrainte.gridx = 4;
            add(B,contrainte);

            contrainte.gridx = 5;
            add(BText,contrainte);

            contrainte.gridx = 6;
            add(validation,contrainte);

        }
    }


