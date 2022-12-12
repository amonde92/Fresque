package Image;

import Forme.Forme;

import java.util.HashSet;
import java.util.Iterator;

public class Image {
    private HashSet<Forme> listeForme;

    public void setListeForme(HashSet<Forme> listeForme) {this.listeForme = listeForme;}
    public HashSet<Forme> getListeForme() {return listeForme;}

    public Image (HashSet<Forme> f){
        listeForme=f;
    }

    public double Aire() {
        double aire =0;
        for(Forme forme: this.listeForme) {
            forme.rotation();
            aire += forme.Aire();
        }
        return aire;
    }

    public double Perimetre() {
        double somme = 0;
        for (Forme f : this.listeForme) {
            somme += f.Perimetre();
        }
        return somme;
    }

    public void homothetie(int rapport) {
        for (Forme forme : this.listeForme) {
            forme.homothetie(rapport);

        }
    }
    public void translation(int[] vector) {
        for (Forme forme : this.listeForme) {
            forme.translation(vector);
        }
    }

    public void rotation() {
        for (Forme forme : this.listeForme) {
            forme.rotation();
        }
    }


    public void symetrie_axiale() {
        for (Forme forme : this.listeForme) {
            forme.symetrie_axiale();
        }
    }

    public void symetrie_centrale() {
        for (Forme forme : this.listeForme) {
            forme.symetrie_centrale();
        }
    }

    // vérifie que deux images ne soient pas égale
    // (2 images sont considéré égale si elle leurs formes sont toutes égales)
    public boolean equal(Image image) {
        if (this == image) return true;
        if (image == null) return false;
        if (this.getClass() != image.getClass()) return false;

        Image i = (Image) image;
        if (listeForme == null) {
            return i.listeForme == null;
        } else return listeForme.equals(i.listeForme);
    }
}
