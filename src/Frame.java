import javax.swing.*;

public class Frame extends JFrame {
    public Frame(String a){

        // Titre
        setTitle(a);
        // taille : 400 pixels largeur  et 100 pixels hauteur
        setSize(1250, 650);
        // Au centre
        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Fenetre visible
        setVisible(true);
    }
}
