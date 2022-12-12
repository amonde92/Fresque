package Dessin;

import Image.Image;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Dessin {
    private HashSet<Image> listeImage;

    public HashSet<Image> getListeImage() {
        return listeImage;
    }

    public void setListeImage(HashSet<Image> listeImage) {
        this.listeImage = listeImage;
    }

    public Dessin() {
        this.listeImage = new HashSet<Image>();
    }

    public Iterator getIterator() {
        return listeImage.iterator();
    }
    public boolean ajoutImage(Image i) {
        Iterator j = this.getIterator();
        while(j.hasNext()) {
            Image ii = (Image) j.next();
            if(i.equals(ii)) {
                return false;
            }
        }
        return listeImage.add(i);
    }

    public double getPerimetre() {
        double perimetre = 0;
        Iterator itr = this.getIterator();
        while(itr.hasNext()) {
            Image i = (Image) itr.next();
            perimetre += i.Perimetre();
        }
        return perimetre;
    }

    public double Aire() {
        double aire=0;
        Iterator itr = this.getIterator();
        while(itr.hasNext()) {
            Image i = (Image) itr.next();
            aire += i.Aire();
        }
        return 0;

    }

    public void translation(int vector[]) {
        for(Image i : this.listeImage) {
            i.translation(vector);
        }
    }

    public void rotation() {
        for(Image i : this.listeImage) {
            i.rotation();
        }
    }

    public void symetrie_centrale() {
        for(Image i : this.listeImage) {
            i.symetrie_centrale();
        }
    }


    public void symetrie_axiale() {
        for(Image i : this.listeImage) {
            i.symetrie_axiale();
        }
    }

    public void homothetie(int rapport) {
        for(Image i : this.listeImage) {
            i.homothetie(rapport);
        }
    }

    public List<Image> triImageDec() {
        List<Image> l = new ArrayList<Image>();
        List<Image> liste_trier = new ArrayList<Image>();
        l.addAll(this.listeImage);
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

    public Dessin copie() {
        Dessin d = new Dessin();
        Iterator itr = this.getIterator();

        while(itr.hasNext()) {
            d.ajoutImage((Image)itr.next());
        }

        return d;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Dessin d = (Dessin) obj;
        if (listeImage == null) {
            return d.listeImage == null;
        } else return listeImage.equals(d.listeImage);
    }


}
