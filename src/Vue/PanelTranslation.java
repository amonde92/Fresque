package Vue;

import javax.swing.*;
import java.awt.*;

public class PanelTranslation extends JPanel {
    VectorOptionTranslation param = new VectorOptionTranslation();
    public PanelTranslation(){
        setLayout (new GridLayout (1,2,8,18));
        add(param);
        //add(new PanelFresque("Translation"));
    }
}
