package Vue;

import Dessin.Dessin;
import Forme.Forme;
import Image.Image;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelDessin extends JPanel {
    Dessin dessin;
    //PanelImage panelImage;

    public PanelDessin(Dessin dessin) {
        this.dessin = dessin;
        GridLayout gridLayout = new GridLayout(2, 1, 5, 10);
        setLayout(gridLayout);

        for (Image image : this.dessin.getListeImage()) {
            PanelImage panelImage = new PanelImage(image);
            panelImage.setPreferredSize(new Dimension(500, 500));
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            panelImage.setBorder(border);
            add(panelImage);
            panelImage.updateUI();
            panelImage.setVisible(true);
        }
    }
}



