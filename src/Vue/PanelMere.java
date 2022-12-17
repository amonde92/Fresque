package Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PanelMere extends JPanel implements ItemListener, ActionListener {
    PanelFresque currentPanel;
    PanelOption panelOption;
    //PanelTranslation translation =new PanelTranslation();
    PanelFresque transformation = new PanelFresque("Transformation");
    PanelFresque homotethie = new PanelFresque("Homotéthie");
    PanelFresque rotation = new PanelFresque("Rotation");
    PanelFresque sym_centrale = new PanelFresque("Symétrie Centrale");
    PanelFresque sym_axiale = new PanelFresque("Symétrie Axiale");

    PanelFresque translation = new PanelFresque("translation");
    JFrame frame;

    public PanelMere(JFrame frame) {
        this.frame = frame;
        setLayout(new BorderLayout());
        panelOption = new PanelOption(this);
        add(panelOption, BorderLayout.NORTH);
        currentPanel = transformation;
        add(currentPanel,BorderLayout.CENTER);
        currentPanel.setVisible(true);



    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println(e.getItem());

        if (currentPanel != null) this.remove(currentPanel);

        switch (e.getItem().toString()) {
            case "Transformation" ->currentPanel = transformation;
            case "Homothétie" -> currentPanel = homotethie;
            case "Rotation" -> currentPanel = rotation;
            case "Symétrie Centrale" -> currentPanel = sym_centrale;
            case "Symétrie Axiale" -> currentPanel = sym_axiale;
            case "Translation" -> currentPanel = translation;
        }

        System.out.println(currentPanel);
        if (currentPanel != null) {
            this.add(currentPanel);
        }
        this.updateUI();
        currentPanel.getCenter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == panelOption.getCreate()){
            CreateImage n = new CreateImage(frame);
        }
    }
}
