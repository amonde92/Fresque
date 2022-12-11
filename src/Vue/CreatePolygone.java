
package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePolygone extends JPanel implements ActionListener {

    JButton validation = new JButton("validation");
    JLabel X = new JLabel("X : ");
    JLabel Y = new JLabel("Y : ");

    JTextField YEnter = new JTextField();
    JTextField XEnter = new JTextField();
    JButton Plus = new JButton("Plus");
    JButton remove = new JButton("remove");

    public CreatePolygone (){


        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();

        contrainte.gridx = 0;
        contrainte.gridy = 0;
        add(validation,contrainte);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

