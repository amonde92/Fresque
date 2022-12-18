package Forme;

import static java.lang.Math.cos;
import static java.lang.Math.sin;

/**
 * Classe qui répresente un Pointt
 */
public class Point extends Forme{
    private int x;
    private int y;

    /**
     * Constructeur de la class Point
     * @param x : abcisse du point
     * @param y : ordonnée du point
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setX(int x) {this.x = x;}

    public int getX() {return x;}

    public void setY(int y) {this.y = y;}

    public int getY() {return y;}

    /**
     * Réalise la rotation d'un point par à 90° dans le sens anti-horaire rapport à l'origine
     */
    public void rotation (){
        int temp=x;
        x=-y;
        y=temp;
    }
    /**
     * Méthode qui réalise la symétrie axiale d'un point par rapport à l'axe des ordonnées
     */
    public void symetrie_axiale(){x=-x;}

    /**
     * Méthode qui réalise symétrie centrale du point par rapport à l'origine
     */
    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        x=-x;
        y=-y;
    }
    /**
     * Méthode qui réalise la translation du point par rapport au vecteur donnée.
     * x-> x+vector[0] et y->y+vecteur[1]
     * @param vector : vecteur selon lequel est faite la translation
     */
    public void translation(int [] vector){
        x=x+vector[0];
        y=y+vector[1];
    }
    /**
     * Méthode qui réalise l'homothétie du point selon le rapport saisie
     * x->x*rapport et y->y*rapport
     * @param rapport : rapport selon lequel est faite l'homothétie
     */
    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        x*=rapport;
        y*=rapport;
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

        Point p = (Point) obj;
        return this.getX() == p.getX() && this.getY() == p.getY();
    }

    /**
     * Méthode toString
     * @return informations clés du Point
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
