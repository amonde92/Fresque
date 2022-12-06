package Vue;

import javax.swing.*;
import java.awt.*;

public class VectorOptionTranslation extends JPanel {
    JLabel titre = new JLabel("Vecteur pour la translation : ");
    JLabel x = new JLabel("x : ");
    JLabel y = new JLabel("y : ");

    JTextField textX = new JTextField(6);
    JTextField textY = new JTextField(6);

    JButton ok = new JButton("Ok");

    public VectorOptionTranslation(){
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        add(titre,c);

        c.gridx = 0;
        c.gridy = 1;
        add(x,c);

        c.gridx = 1;
        c.gridy = 1;
        add(textX,c);

        c.gridx = 0;
        c.gridy = 2;
        add(y,c);

        c.gridx = 1;
        c.gridy = 2;
        add(textY,c);

        c.gridx = 3;
        c.gridy = 3;
        add (ok,c);
    }

}
