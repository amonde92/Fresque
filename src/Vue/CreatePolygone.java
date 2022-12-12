
package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreatePolygone extends JPanel implements ActionListener {

    JButton validation = new JButton("validation");
    PanelCreatePoint point = new PanelCreatePoint(this);
    JButton Plus = new JButton("Ajouter un point");


    public CreatePolygone (){


        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();
        //contrainte.insets = new Insets(1,10,1,10);

        contrainte.gridx = 0;
        contrainte.gridy = 0;
        contrainte.gridwidth = 3;
        add(Plus,contrainte);

        contrainte.gridx = 3;
        contrainte.gridy = 0;
        add(point,contrainte);

        contrainte.gridx = 3;
        contrainte.gridy = 3;
        add(validation,contrainte);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == point.getValidate() ){
            System.out.println(point.getXEnter().getText() +" "+point.getYEnter().getText());
        }
    }
}

