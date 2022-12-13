
package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import Forme.Point;

public class CreatePolygone extends JPanel implements ActionListener {

    JButton validation = new JButton("validation");
    PanelCreatePoint point = new PanelCreatePoint(this);
    JButton Plus = new JButton("Ajouter un point");

    Point [] tabPoint;

    Point test = new Point(1, 2);
    ArrayList<Point> poi = new ArrayList<>();
    //, new Point(3, 4), new Point(5, 6)};
    PointPolygoneTable model = new PointPolygoneTable(poi);
    JTable table = new JTable(model);

    CreateImage createImage;


    public CreatePolygone (CreateImage c){
        this.createImage = c;

        setLayout(new GridBagLayout());
        GridBagConstraints contrainte = new GridBagConstraints();
        contrainte.insets = new Insets(10,10,10,10);

        contrainte.gridx = 0;
        contrainte.gridy = 0;
        contrainte.gridwidth = 3;
        add(Plus,contrainte);
        Plus.addActionListener(this);

        contrainte.gridx = 3;
        contrainte.gridy = 0;
        add(point,contrainte);
        point.setVisible(false);

        contrainte.gridx = 3;
        contrainte.gridy = 3;
        add(validation,contrainte);
        validation.addActionListener(c);

        contrainte.gridx = 10;
        contrainte.gridy = 0;
        contrainte.gridheight = 4;
        add(table,contrainte);



    }

    public JButton getValidation() {
        return validation;
    }

    public void setValidation(JButton validation) {
        this.validation = validation;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Plus){
            point.setVisible(true);
        }

        if(e.getSource() == point.getValidate() ){
            poi.add(new Point(Integer.parseInt(String.valueOf(point.getXEnter().getText())),
                    Integer.parseInt(String.valueOf(point.getYEnter().getText()))));
            point.setVisible(false);
            this.updateUI();
        }
    }
}

