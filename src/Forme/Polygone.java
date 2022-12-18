package Forme;

import java.util.ArrayList;
import java.util.Objects;

public class Polygone extends Forme implements Comparable<Polygone> {
    public void Print() {

        for (int i = 0; i < (Cote.size()); i++) {
            System.out.println(Cote.get(i).getA().getX() + " X1 , " + Cote.get(i).getA().getY() + "Y1  " + Cote.get(i).getB().getX() + " X2 , " + Cote.get(i).getB().getY() + "Y2 ");

        }
    }

    private ArrayList<Ligne> Cote = new ArrayList<>();


    /**
     * Constructeur de la class Polygone, récupère une liste point
     * @param point : ArrayListe<Point> : point qui compose le polygone
     */
    public  Polygone (ArrayList<Point> point){instanceCote(point);}

    /**
     * permet d'instancier le polygone la première fois
     * @param point : ArrayListe<Point> : point qui compose le polygone
     */
    public void instanceCote(ArrayList<Point> point) {addLigne(point);}

    /**
     * fonction qui permet d'ajouter les points
     * du polygone pour faire la figure
     * @param point : Point, ce qui compose le polygone
     */
    public void addLigne(ArrayList<Point> point) {

        for (int i = 0; i < (point.size()) - 1; i++) {
            Cote.add(new Ligne(point.get(i),point.get(i+1)));
        }
        Cote.add(new Ligne(point.get(point.size()-1), point.get(0)));
    }

    /**
     * Méthode qui calcul le périmètre d'un polygone selon une formule mathématique
     * @return Le périmètre d'un polygone
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
     * Méthode qui calcul l'aire d'un polygone selon une formule mathématique
     * @return l'aire d'un polygone
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
     * Méthode qui réalise l'homothétie d'un polygone, la méthode homothétie est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le polygone
     * @see Point#homothetie(int)
     * @param rapport : rapport selon lequel est réalisée l'homothétie
     */

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

    /**
     * Méthode qui réalise la translation du polygone, la méthode translation est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le polygone
     * @see Point#translation(int[])
     * @param vector : vecteur selon lequel est réalisée la translation
     */
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

    /**
     * Méthode qui réalise la symétrie axale du polygone, la méthode symétrie_axiale est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le polygone
     * @see Point#symetrie_axiale()
     */
    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        ArrayList<Ligne> coteBis = new ArrayList<>();
        for(Ligne ligne: Cote) {
            ligne.symetrie_axiale();
            coteBis.add(ligne);
        }
        setCote(coteBis);     }

    /**
     * Méthode qui réalise la symétrie centrale du polygone, la méthode symétrie_centrale est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le polygone
     * @see Point#symetrie_centrale()
     */

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


    /**
     * Méthode qui réalise la rotation du polygone, la méthode rotation est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le polygone
     * @see Point#symetrie_axiale()
     */
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


    /**
     * Méthode qui compare l'objet courant et l'objet donné en paramètre
     * @return true si les deux objets sont égaux sinon false
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
     * Méthode toString
     * @return informations clés du Point
     */
    @Override
    public String toString() {
        return "Polygone{" +
                "Cote=" + Cote +
                '}';
    }
    /**
     * Méthode qui permet de vérifier qu'un doublon n'est pas présent lors de l'ajout dans la HashSet d'image
     * @param o the object to be compared.
     * @return 0 s'il y a déja un polygone présent dans la HashSet d'image
     */
    @Override
    public int compareTo(Polygone o) {
        return 0;
    }
}
