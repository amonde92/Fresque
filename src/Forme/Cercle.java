package Forme;

public class Cercle extends Forme implements Comparable<Cercle> {

    /**
     * création des variables élémentaire pour le cercle
     */

    private Point center;
    private Point R;
    private Ligne ray;

    /**
     * instanciation du cercle
     */
    public Cercle(Point c, Point r){
        this.center = c;
        this.R = r;
        ray = new Ligne(center,R);
    }

    /**
     * setteur et getteur des variables élémentaire du cercle
     */
    public Point getCenter() {return center;}
    public void setCenter(Point center) {this.center = center;}
    public Ligne getRay() {return ray;}

    public void setRay(Ligne ray) {this.ray = ray;}

    /**
     * calcule du périmetre du cercle
     */
    @Override
    public double Perimetre() {
        super.Perimetre();
        return (2*Math.PI*this.ray.Distance());
    }
    /**
     * calcule de l'aire du cercle
     */
    @Override
    public double Aire() {
        super.Aire();
        return (Math.PI*this.ray.Distance()*this.ray.Distance());
    }
    /**
     * aggrandire ou diminuer le cercle par rapport à un rapport
     */
    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        center.homothetie(rapport);
        R.homothetie(rapport);
    }
    /**
     * fait une translation du cercle par rapport à un vecteur
     */
    @Override
    public void translation(int [] vector) {
        super.translation(vector);
        center.translation(vector);
        R.translation(vector);

    }
    /**
     * fait une symétrie axiale du cercle
     */
    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        center.symetrie_axiale();
        R.symetrie_axiale();
    }

    /**
     * fait une rotation du cercle
     */

    @Override
    public void rotation() {
        super.rotation();
        center.rotation();
        ray.rotation();
    }
    /**
     * fait une symétrie centrale du cercle
     */
    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        center.symetrie_centrale();
        R.symetrie_centrale();

    }
    /**
     * vérifie si on a déjà ou non le cercle créé
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Cercle c = (Cercle) obj;
        return this.ray.equals(c.ray);
    }
    /**
     * affiche les variables élémentaire du cercle
     */
    @Override
    public String toString() {
        return "Cercle{" +
                "center=" + center +
                ", ray=" + ray +
                '}';
    }

    @Override
    public int compareTo(Cercle o) {
        return 0;
    }
}
