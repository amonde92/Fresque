package Image;

import Forme.Forme;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Cette classe représente une image, qui est composé de plusieurs formes.
 * Une Hashset est utilisé pour ajouter les formes de sorte à ne pas autoriser
 * l'ajout de doublons de formes
 */
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

    /**
     * Méthode qui permet d'ajouter une image au dessin
     * @param forme forme à ajouter à l'image
     * @return true si l'ajout a bien été réalisé sinon false
     */
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
     * Méthode qui permet d'obtenir l'aire d'un dessin
     * @return l'aire de l'image, qui correspond à la somme des aires de chaque forme
     */
    public double Aire() {
        double aire =0;
        for(Forme forme: this.listeForme) {
            aire += forme.Aire();
        }
        return aire;
    }

    /**
     * Méthode qui permet d'obtenir le périmètre d'un d'un dessin
     * @return le périmètre de l'image, qui correspond à la somme des périmètres de chaque forme
     */
    public double Perimetre() {
        double somme = 0;
        for (Forme f : this.listeForme) {
            somme += f.Perimetre();
        }
        return somme;
    }
    /**
     * Méthode qui réalise l'homotéthie d'une image.
     * Elle appelle la méthode homothetie sur chaque forme de l'image
     * @param rapport : le rapport selon lequel sera faite l'homothétie
     */
    public void homothetie(int rapport) {
        for (Forme forme : this.listeForme) {
            forme.homothetie(rapport);

        }
    }

    /**
     * Méthode qui réalise la translation d'une image.
     * Elle appelle la méthode de translation sur chaque forme de l'image
     *
     * @param vector vecteur selon lequel la translation sera faite.
     */
    public void translation(int[] vector) {
        for (Forme forme : this.listeForme) {
            forme.translation(vector);
        }
    }

    /**
     * Méthode qui réalise la translation d'une image.
     * Elle appelle la méthode de rotation sur chaque forme de l'image
     */
    public void rotation() {
        for (Forme forme : this.listeForme) {
            forme.rotation();
        }
    }

    /**
     * Méthode qui réalise la symétrie axiale d'une image.
     * Elle appelle la méthode de symetrie_axiale sur chaque forme de l'image
     */
    public void symetrie_axiale() {
        for (Forme forme : this.listeForme) {
            forme.symetrie_axiale();
        }
    }

    /**
     * Méthode qui réalise la symétrie centrale d'une image.
     * Elle appelle la méthode de symetrie_centrale sur chaque forme de l'image
     */
    public void symetrie_centrale() {
        for (Forme forme : this.listeForme) {
            forme.symetrie_centrale();
        }
    }



    /**
     *Méthode qui compare l'objet courant et l'objet donné en paramètre
     * @return true si les deux objets sont égaux sinon false
     */
     public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Image image = (Image) obj;
         if (listeForme == null) {
             return image.listeForme == null;
         } else return listeForme.equals(image.listeForme);
     }

    /**
     * Méthode toString
     * @return informations clés de l'image
     */
    @Override
    public String toString() {
        return "Image{" +
                "listeForme=" + listeForme +
                '}';
    }
}
