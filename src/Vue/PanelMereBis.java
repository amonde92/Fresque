package Vue;

import Dessin.Dessin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Panel Mère, panel où seront ajoutés les panels fils
 */
public class PanelMereBis extends JPanel implements ActionListener {
    PanelOption panelOption;
    PanelFresque panelFresque;
    Dessin dessin;
    Dessin dessinBis;
    public PanelMereBis( Dessin dessin, Dessin dessinBis) {
        this.dessin = dessin;
        this.dessinBis = dessinBis;
        panelFresque = new PanelFresque(dessin, dessinBis);
        setLayout(new BorderLayout());
        panelOption = new PanelOption(this,panelFresque);
        add(panelOption,BorderLayout.NORTH);
        add(panelFresque,BorderLayout.CENTER);
        panelFresque.setVisible(true);

    }

    /**
     * Ecouteur des boutons "Aire" et "Périmètre" qui va permettre
     * d'afficher l'aire et le perimètre du dessin
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == panelOption.getAire()){
            panelOption.getDisplay_aire().setText("Aire : "+dessin.Aire());
            panelOption.getDisplay_aire().setVisible(true);
        }
        if (e.getSource() == panelOption.getPerimetre()){
            panelOption.getDisplay_perimetre().setText("Aire : "+dessin.Perimetre());
            panelOption.getDisplay_perimetre().setVisible(true);
        }
    }
}
