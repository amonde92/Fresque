package Vue;

import javax.swing.*;
import java.awt.*;

public class PanelCreatePoint extends JPanel {

    JLabel X = new JLabel("X : ");
    JLabel Y = new JLabel("Y : ");

    JTextField XEnter = new JTextField(6);
    JTextField YEnter = new JTextField(6);

    JButton validate =  new JButton("Valider");

    public PanelCreatePoint (){
        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();
        contrainte.insets = new Insets(10,10,10,10);

        contrainte.gridx = 0;
        contrainte.gridy = 0;
        add(X,contrainte);
        contrainte.gridx = 1;
        add(XEnter,contrainte);
        contrainte.gridx = 0;
        contrainte.gridy = 1;
        add(Y,contrainte);
        contrainte.gridx = 1;
        add(YEnter,contrainte);
        contrainte.gridx = 1;
        contrainte.gridy = 2;
        add(validate,contrainte);
    }



}
