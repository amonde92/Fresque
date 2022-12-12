package Vue;

import javax.swing.*;
import java.awt.*;

public class PanelCreatePoint extends JPanel {

    JLabel X = new JLabel("X : ");

    public JButton getValidate() {
        return validate;
    }

    public void setValidate(JButton validate) {
        this.validate = validate;
    }

    public JTextField getXEnter() {
        return XEnter;
    }

    public JTextField getYEnter() {
        return YEnter;
    }

    JLabel Y = new JLabel("Y : ");

    JTextField XEnter = new JTextField(6);
    JTextField YEnter = new JTextField(6);

    JButton validate =  new JButton("Valider");

    CreatePolygone c;
    public PanelCreatePoint (CreatePolygone c){
        this.c = c;
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
        validate.addActionListener(c);
    }



}
