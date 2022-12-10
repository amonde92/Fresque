package Image;

import Forme.Forme;

import java.util.HashSet;
import java.util.Iterator;

public class Image  extends Forme{
    private HashSet<Forme> listeForme;

    public void setListeForme(HashSet<Forme> listeForme) {this.listeForme = listeForme;}
    public HashSet<Forme> getListeForme() {return listeForme;}

    public Image (HashSet<Forme> f){
        listeForme=f;
    }

    @Override
    public double Aire() {
        super.Aire();
        double aire =0;
        for(Forme forme: this.listeForme) {
            forme.rotation();
            aire += forme.Aire();
        }
        return aire;
    }

    @Override
    public double Perimetre() {
        super.Perimetre();
        double somme = 0;
        for (Forme f : this.listeForme) {
            somme += f.Perimetre();
        }
        return somme;
    }

    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        for (Forme forme : this.listeForme) {
            forme.homothetie(rapport);

        }
    }
    @Override
    public void translation(int[] vector) {
        super.translation(vector);
        for (Forme forme : this.listeForme) {
            forme.translation(vector);
        }
    }

    @Override
    public void rotation() {
        super.rotation();
        for (Forme forme : this.listeForme) {
            forme.rotation();
        }
    }

    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        for (Forme forme : this.listeForme) {
            forme.symetrie_axiale();
        }
    }

    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        for (Forme forme : this.listeForme) {
            forme.symetrie_centrale();
        }
    }

    // vérifie que deux images ne soient pas égale
    // (deux images sont considérer égale si elle contiennet les meme formes)
    public boolean equal(Image image) {
        //if (taille égale a 4nretourne true )
        int tempo = listeForme.size();
        int tempo2 = image.listeForme.size();
        int taille = Math.max(tempo, tempo2);

        for (Forme forme: image.listeForme){
            for (Forme forme1: listeForme){
                if (forme.getClass().equals(forme1.getClass())){
                    taille--;
                }
            }
        }
        return taille == 0;
    }
}
