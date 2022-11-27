import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    JButton aire = new JButton ("Aire");
    JButton perimetre = new JButton ("Perimètre");
    JButton  homothetie= new JButton ("Homothétie");
    JButton translation = new JButton ("Translation");
    JButton rotation = new JButton ("Rotation");
    JButton sym_centrale = new JButton ("Symétrie Centrale");
    JButton sym_axiale = new JButton ("Symétrie Axiale");
    public Panel() {
        //Définition de sa couleur de fond
        this.setBackground(Color.ORANGE);
        add(aire);
        add(perimetre);
        add(homothetie);
        add(translation);
        add(rotation);
        add(sym_centrale);
        add(sym_axiale);
    }
}
