package Vue;

import Dessin.Dessin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PanelMereBis extends JPanel implements ItemListener, ActionListener {
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

    public void itemStateChanged(ItemEvent e) {
        System.out.println("changement");
    }

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
