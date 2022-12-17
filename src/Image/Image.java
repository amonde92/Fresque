package Image;

import Forme.Forme;

import java.util.HashSet;
import java.util.Iterator;

public class Image {


    private HashSet<Forme> listeForme;

    public void setListeForme(HashSet<Forme> listeForme) {this.listeForme = listeForme;}
    public HashSet<Forme> getListeForme() {return listeForme;}

    public Image (){
        this.listeForme= new HashSet<Forme>();
    }

    public Iterator getIterator() {
        return this.listeForme.iterator();
    }

    public boolean addFormes_geo(Forme forme) {
        Iterator j = this.getIterator();
        while(j.hasNext()) {
            Forme f = (Forme) j.next();
            if(forme.equals(f)) {
                return false;
            }
        }
        return this.listeForme.add(forme);
    }

    /**
     * calcule l'aire de l'image avec l'aire de ses formes
     */
    public double Aire() {
        double aire =0;
        for(Forme forme: this.listeForme) {
            aire += forme.Aire();
        }
        return aire;
    }

    /**
     * calcule le périmetre de l'image avec l'aire de ses formes
     */
    public double Perimetre() {
        double somme = 0;
        for (Forme f : this.listeForme) {
            somme += f.Perimetre();
        }
        return somme;
    }
    /**
     * augmentation ou réduction des formes qui compose l'image par rapport à un rapport
     */
    public void homothetie(int rapport) {
        for (Forme forme : this.listeForme) {
            forme.homothetie(rapport);

        }
    }

    /**
     * translation des formes qui compose l'image par rapport à un vecteur
     */
    public void translation(int[] vector) {
        for (Forme forme : this.listeForme) {
            forme.translation(vector);
        }
    }

    /**
     * rotation des formes qui compose l'image par rapport à un rapport
     */
    public void rotation() {
        for (Forme forme : this.listeForme) {
            forme.rotation();
        }
    }

    /**
     * symétrie axiale des formes qui compose l'image par rapport à un rapport
     */
    public void symetrie_axiale() {
        for (Forme forme : this.listeForme) {
            forme.symetrie_axiale();
        }
    }

    /**
     * symétrie centrale des formes qui compose l'image par rapport à un rapport
     */
    public void symetrie_centrale() {
        for (Forme forme : this.listeForme) {
            forme.symetrie_centrale();
        }
    }

    /**
     * vérifie que deux images ne soient pas égale
     * (2 images sont considéré égaux si elle leurs formes sont toutes égales)
     */
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
