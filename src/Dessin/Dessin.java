package Dessin;

import Forme.Forme;

import java.util.HashSet;

public class Dessin {
    private HashSet<Forme> listeImage;

    public HashSet<Forme> getListeImage() {
        return listeImage;
    }

    public void setListeImage(HashSet<Forme> listeImage) {
        this.listeImage = listeImage;
    }

    public Dessin(HashSet<Forme> listeImage) {
        this.listeImage = listeImage;
    }
}
