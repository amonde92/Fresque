package Forme;

import java.util.ArrayList;
import java.util.Objects;

public class Polygone extends Forme implements Comparable<Polygone> {



    public void Print() {

        for (int i = 0; i < (Cote.size()); i++) {
            System.out.println(Cote.get(i).getA().getX() + " X1 , " + Cote.get(i).getA().getY() + "Y1  " + Cote.get(i).getB().getX() + " X2 , " + Cote.get(i).getB().getY() + "Y2 ");

        }
    }


    /**
     * variable permétant de stocké ligne que compose un polygone
     * fonction permettant de l'instansier
     */
    private ArrayList<Ligne> Cote = new ArrayList<>(); // stockage des ligne qui compose un polygone
    public  Polygone (ArrayList<Point> point){instanceCote(point);} // permet de créer un polygone
    public void instanceCote(ArrayList<Point> point) {addLigne(point);} // permet de mettre les ligne du polygone

    /**
     * la fonction permet de créer les ligne du polygone avec les points
     * donnés en argument.
     */
    public void addLigne(ArrayList<Point> point) {

        for (int i = 0; i < (point.size()) - 1; i++) { //on balaye du 1er jusqu'à l'avant dernier
            Cote.add(new Ligne(point.get(i),point.get(i+1)));// on ajoute les ligne créer avec les points
        }
        Cote.add(new Ligne(point.get(point.size()-1), point.get(0))); //on relie le dernier point avec le 1er
    }

    /**
     *fonction qui permet de retourner la valeur du périmetre du polygone
     */

    @Override
    public double Perimetre() {
        super.Perimetre(); // évite l'erreur
        double somme = 0; // on initialise la variable de la somme à 0
        for (Ligne ligne : Cote) {// on parcours tous les lignes du polygone
            somme += ligne.Distance(); // on ajoute la distance de la ligne à la somme
        }

        return somme; // on retourne la somme qui est le périmetre
    }

    /**
     *calcule de l'aire du polygone avec la méthode laçage
     */

     @Override
    public double Aire() {
        super.Aire(); // évite l'erreur
        double aire = 0;
        for (Ligne ligne : this.Cote) {// on parcours tous les lignes du polygone
            // Récupérer les coordonnées des points du segment
            Point p1 = ligne.getA(); // on récupère le 1er point de la ligne
            Point p2 = ligne.getB(); // on récupère le 2eme point de ma ligne

            // Ajouter le produit des coordonnées des points au calcul de l'aire
            aire += p1.getX() * p2.getY() - p1.getY() * p2.getX(); // on calcule la matrice de la ligne
        }
         return Math.abs(aire / 2); // Diviser l'aire par 2 pour obtenir la valeur finale
     }


    /**
     * permet de argrandir ou de diminuer le polygone par rapport à un rapport
     */

    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport); // évite l'erreur
        ArrayList<Ligne> coteBis = new ArrayList<>(); // on créer un clone du polygone actuel
        for(Ligne ligne: Cote) { // on parcours les lignes du polygone
            ligne.homothetie(rapport); // on rentre dans la fonction homothetie des lignes
            coteBis.add(ligne); // on ajoute les nouvelle ligne au clone
        }
        setCote(coteBis); // one change les ligne du polygone originel avec celui du clone
    }

    /**
     * permet de faire une translation du polygone en cour
     */

    @Override
    public void translation(int[] vector) {
        super.translation(vector); // évite l'erreur
        ArrayList<Ligne> coteBis = new ArrayList<>(); // on créer un clone du polygone actuel
        for(Ligne ligne: Cote) { // on parcours les lignes du polygone
            ligne.translation(vector); // on rentre dans la fonction translation des lignes
            coteBis.add(ligne); // on ajoute les nouvelle ligne au clone
        }
        setCote(coteBis); // one change les ligne du polygone originel avec celui du clone
    }

    /**
     * permet de faire une symétrie axiale du polygone en cour
     */
    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale(); // évite l'erreur
        ArrayList<Ligne> coteBis = new ArrayList<>(); // on créer un clone du polygone actuel
        for(Ligne ligne: Cote) { // on parcours les lignes du polygone
            ligne.symetrie_axiale(); // on rentre dans la fonction symétrie axiale des lignes
            coteBis.add(ligne); // on ajoute les nouvelle ligne au clone
        }
        setCote(coteBis); // one change les ligne du polygone originel avec celui du clone
    }

    /**
     * permet de faire une symétrie centrale du polygone en cour
     */

    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale(); // évite l'erreur
        ArrayList<Ligne> coteBis = new ArrayList<>(); // on créer un clone du polygone actuel
        for(Ligne ligne: Cote) { // on parcours les lignes du polygone
            ligne.symetrie_centrale(); // on rentre dans la fonction symétrie centrale des lignes
            coteBis.add(ligne); // on ajoute les nouvelle ligne au clone
        }
        setCote(coteBis); // one change les ligne du polygone originel avec celui du clone
    }


    /**
     * permet de faire une rotation du polygone en cour
     */
    @Override
    public void rotation() {
        super.rotation(); // évite l'erreur
        ArrayList<Ligne> coteBis = new ArrayList<>(); // on créer un clone du polygone actuel
        for(Ligne ligne: Cote) { // on parcours les lignes du polygone
            ligne.rotation(); // on rentre dans la fonction rotation des lignes
            coteBis.add(ligne); // on ajoute les nouvelle ligne au clone
        }
        setCote(coteBis); // one change les ligne du polygone originel avec celui du clone
    }
/**
 * permet de récupérer la variable Cote du polygone
 */
    public ArrayList<Ligne> getCote() {
        return Cote;
    }

    /**
     *permet de changer la variable Cote du polygone avecx un autre
     */
    public void setCote(ArrayList<Ligne> cote) {
        Cote = cote;
    }


    /**
     * permet de vérifier si le polygone que l'on veux rajouté est déjà présent ou pas
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // on regarde si l'objet est identique à celle du polygone
        if (obj == null) return false; // on regarde si l'objet est vide ou pas
        if (this.getClass() != obj.getClass()) return false; // on regarde si la classe de l'objet vaut celle du polygone
        Polygone p = (Polygone) obj; // on transforme l'objet en polygone
        return Objects.equals(Cote, p.Cote);
    }

    /**
     * affiche le éléments du polygone pour le débeugage
     */

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
