package Forme;

import java.util.ArrayList;
import java.util.Objects;

public class Polygone extends Forme implements Comparable<Polygone> {
    /*
    public void Print() {

        for (int i = 0; i < (Cote.size()); i++) {
            System.out.println(Cote.get(i).getA().getX() + " X1 , " + Cote.get(i).getA().getY() + "Y1  " + Cote.get(i).getB().getX() + " X2 , " + Cote.get(i).getB().getY() + "Y2 ");

        }
    }
    }*/

    private ArrayList<Ligne> Cote = new ArrayList<>();

    public  Polygone (int [][] coordonne){
        instanceCote(coordonne);
    }
    public void instanceCote(int[][] coordonne) {
        addLigne(coordonne);
    }
    public void addLigne(int[][] tab) {

        for (int i = 0; i < (tab.length) - 1; i++) {
            Cote.add(new Ligne(new Point(tab[i][0], tab[i][1]), new Point(tab[i + 1][0], tab[i + 1][1])));
        }
        Cote.add(new Ligne(new Point(tab[(tab.length) - 1][0], tab[(tab.length) - 1][1]), new Point(tab[0][0], tab[0][1])));
    }
    @Override
    public double Perimetre() {
        super.Perimetre();
        double somme = 0;
        for (Ligne ligne : Cote) {
            somme += ligne.Distance();
        }

        return somme;
    }

     @Override
    public double Aire() {
        super.Aire();
        double aire = 0;
        for (Ligne ligne : this.Cote) {
            // Récupérer les coordonnées des points du segment
            Point p1 = ligne.getA();
            Point p2 = ligne.getB();

            // Ajouter le produit des coordonnées des points au calcul de l'aire
            aire += p1.getX() * p2.getY() - p1.getY() * p2.getX();
        }
        // Diviser l'aire par 2 pour obtenir la valeur finale
        return Math.abs(aire / 2);
    }

    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        ArrayList<Ligne> coteBis = new ArrayList<>();
        for(Ligne ligne: Cote) {
            ligne.homothetie(rapport);
            coteBis.add(ligne);
        }
        setCote(coteBis);
    }

    @Override
    public void translation(int[] vector) {
        super.translation(vector);
        ArrayList<Ligne> coteBis = new ArrayList<>();
        for(Ligne ligne: Cote) {
            ligne.translation(vector);
            coteBis.add(ligne);
        }
        setCote(coteBis);
    }

    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        ArrayList<Ligne> coteBis = new ArrayList<>();
        for(Ligne ligne: Cote) {
            ligne.symetrie_axiale();
            coteBis.add(ligne);
        }
        setCote(coteBis);
    }

    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        ArrayList<Ligne> coteBis = new ArrayList<>();
        for(Ligne ligne: Cote) {
            ligne.symetrie_centrale();
            coteBis.add(ligne);
        }
        setCote(coteBis);
    }

    @Override
    public void rotation() {
        super.rotation();
        ArrayList<Ligne> coteBis = new ArrayList<>();
        for(Ligne ligne: Cote) {
            ligne.rotation();
            coteBis.add(ligne);
        }
        setCote(coteBis);
    }

    public ArrayList<Ligne> getCote() {
        return Cote;
    }
    public void setCote(ArrayList<Ligne> cote) {
        Cote = cote;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Polygone p = (Polygone) obj;
        return Objects.equals(Cote, p.Cote);
    }

    @Override
    public String toString() {
        return "Polygone{" +
                "Cote=" + Cote +
                '}';
    }

    @Override
    public int compareTo(Polygone o) {
        return 0;
    }
}
