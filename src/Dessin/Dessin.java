package Dessin;

import Forme.Forme;
import Image.Image;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * Cette classe représente un dessin, qui est composé de plusieurs images.
 * Une Hashset est utilisé pour ajouter les images de sorte à ne pas permettre
 * l'ajout de doublons d'images
 */
public class Dessin {
    private HashSet<Image> listeImage;

    public HashSet<Image> getListeImage() {
        return listeImage;
    }
    public void setListeImage(HashSet<Image> listeImage) {
        this.listeImage = listeImage;
    }

    public Dessin() {
        this.listeImage = new HashSet<>();
    }

    public Iterator getIterator() {
        return listeImage.iterator();
    }

    /**
     * Méthode qui permet d'ajouter une image au dessin
     * @param image image à ajouter au dessin
     * @return true si l'ajout a bien été réalisé sinon false
     */
    public boolean addImage(Image image) {
        Iterator j = this.getIterator();
        while(j.hasNext()) {
            Image i = (Image) j.next();
            if(image.equals(i)) {
                return false;
            }
        }
        return listeImage.add(image);
    }

    /**
     * Méthode qui permet d'obtenir le périmètre d'un d'un dessin
     * @return le périmètre du dessin, qui correspond à la somme des périmètres de chaque image
     */
    public double Perimetre() {
        double perimetre = 0;
        Iterator iterator = this.getIterator();
        while(iterator.hasNext()) {
            Image i = (Image) iterator.next();
            perimetre += i.Perimetre();
        }
        return perimetre;
    }


    /**
     * Méthode qui permet d'obtenir l'aire d'un dessin
     * @return l'aire du dessin, qui correspond à la somme des aires de chaque image
     */
    public double Aire() {
        double aire=0;
        Iterator iterator = this.getIterator();
        while(iterator.hasNext()) {
            Image image = (Image) iterator.next();
            aire += image.Aire();
        }
        return aire;
    }

    /**
     * Méthode qui réalise la translation d'un dessin.
     * Elle appelle la méthode de translation sur chaque image du dessin
     * @see Image#translation(int[])
     * @param vector vecteur selon lequel la translation sera faite.
     */
    public void translation(int[] vector) {
        for(Image i : this.listeImage) {
            i.translation(vector);
        }
    }

    /**
     * Méthode qui réalise la translation d'un dessin.
     * Elle appelle la méthode de rotation sur chaque image du dessin
     * @see Image#rotation()
     */
    public void rotation() {
        for(Image i : this.listeImage) {
            i.rotation();
        }
    }

    /**
     * Méthode qui réalise la symétrie centrale d'un dessin.
     * Elle appelle la méthode de symetrie_centrale sur chaque image du dessin
     * @see Image#symetrie_centrale()
     */
    public void symetrie_centrale() {
        for(Image i : this.listeImage) {
            i.symetrie_centrale();
        }
    }

    /**
     * Méthode qui réalise la symétrie axiale d'un dessin.
     * Elle appelle la méthode de symetrie_axiale sur chaque image du dessin
     * @see Image#symetrie_axiale()
     */
    public void symetrie_axiale() {
        for(Image i : this.listeImage) {
            i.symetrie_axiale();
        }
    }

    /**
     * Méthode qui réalise l'homotéthie d'un dessin.
     * Elle appelle la méthode homothetie sur chaque image du dessin
     * @see Image#homothetie(int)
     * @param rapport : le rapport selon lequel sera faite l'homothétie
     */
    public void homothetie(int rapport) {
        for(Image i : this.listeImage) {
            i.homothetie(rapport);
        }
    }

    /**
     *Méthode qui compare l'objet courant et l'objet donné en paramètre
     * @return true si les deux objets sont égaux sinon false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Dessin other = (Dessin) obj;
        if (listeImage == null) {
            return other.listeImage == null;
        } else return listeImage.equals(other.listeImage);
    }

    /**
     * Méthode qui réalise le tri des images présentent dans le dessin
     * Nous avons choisi de réalisé ce tri par aire décroissant des images présente dans le dessin
     * Cette méthode de tri des images d'un dessin se fait grâce aux méthodes permettant d'avoir
     * les aires des formes présentent dans les images.
     *
     * @see Image#Aire()
     * @return Une List contenant les images triées selon leurs aires décroissantes
     */
    public List<Image> triImageDecroissant() {
        List<Image> liste_trier = new ArrayList<Image>();
        List<Image> l = new ArrayList<Image>(this.listeImage);
        int size = l.size();
        for(int z = 0; z<size; ++z) {
            double aire = 0;
            int id_per = 0;
            for(int i = 0; i<l.size(); ++i) {
                if(l.get(i).Aire() >= aire) {
                    id_per = i;
                    aire = l.get(i).Perimetre();
                }
            }
            liste_trier.add(l.get(id_per));
            l.remove(id_per);
        }
        return liste_trier;
    }

    /**
     * Méthode qui permet de faire la copie du dessin actuel
     * @return Un nouvel objet Dessin qui est une copie du dessin actuel
     */
    public Dessin copie() {
        Dessin d = new Dessin();
        Iterator iterator = this.getIterator();

        while(iterator.hasNext()) {
            d.addImage((Image)iterator.next());
        }

        return d;
    }

    /**
     * Methode toString
     * @return Informations clés du dessin
     * @see Image#toString()
     */
    @Override
    public String toString() {
        String text = " ";
        for(Image i: this.listeImage) {
            text += "|"+i.toString() + "|, \n";
        }
        return text;
    }



}
