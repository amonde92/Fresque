package Forme;

public class Cercle extends Forme implements Comparable<Cercle> {
    private Point center;
    private Point R;
    private Ligne ray;

    /**
     * Constructeur de la class Cercle, récupére deux points, l'origine
     * et un second point qui servira pour construire une ligne (centre et rayon)
     * @param c : Point, origine du cercle
     * @param r : Point, pour calculer le rayon du cercle
     */
    public Cercle(Point c, Point r){
        this.center = c;
        this.R = r;
        ray = new Ligne(center,R);
    }
    public Point getCenter() {return center;}
    public void setCenter(Point center) {this.center = center;}
    public Ligne getRay() {return ray;}

    public void setRay(Ligne ray) {this.ray = ray;}

    /**
     * Méthode qui calcul le périmètre d'un cercle selon une formule mathématique
     * @return Le périmètre du cercle
     */
    @Override
    public double Perimetre() {
        super.Perimetre();
        return (2*Math.PI*this.ray.Distance());
    }

    /**
     * Méthode qui calcul l'aire du cercle selon une formule mathématique
     * @return l'aire du cercle
     */
    @Override
    public double Aire() {
        super.Aire();
        return (Math.PI*this.ray.Distance()*this.ray.Distance());
    }

    /**
     * Méthode qui réalise l'homothétie du cercle, la méthode homothétie est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#homothetie(int)
     * @param rapport : rapport selon lequel est réalisée l'homothétie
     */
    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        center.homothetie(rapport);
        R.homothetie(rapport);
    }
    /**
     * Méthode qui réalise la translation du cercle, la méthode translation est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#translation(int[])
     * @param vector : vecteur selon lequel est réalisée la translation
     */
    @Override
    public void translation(int [] vector) {
        super.translation(vector);
        center.translation(vector);
        R.translation(vector);

    }
    /**
     * Méthode qui réalise la symétrie axale du cercle, la méthode symétrie_axiale est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#symetrie_axiale()
     */
    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        center.symetrie_axiale();
        R.symetrie_axiale();
    }

    /**
     * Méthode qui réalise la rotation du cercle, la méthode rotation est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#symetrie_axiale()
     */
    @Override
    public void rotation() {
        super.rotation();
        center.rotation();
        ray.rotation();
    }
    /**
     * Méthode qui réalise la symétrie centrale du cercle, la méthode symétrie_centrale est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#symetrie_centrale()
     */
    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        center.symetrie_centrale();
        R.symetrie_centrale();

    }
    /**
     * Méthode qui compare l'objet courant et l'objet donné en paramètre
     * @return true si les deux objets sont égaux sinon false
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
     * Méthode toString
     * @return informations clés du Point
     */
    @Override
    public String toString() {
        return "Cercle{" +
                "center=" + center +
                ", ray=" + ray +
                '}';
    }

    /**
     * Méthode qui permet de vérifier qu'un doublon n'est pas présent lors de l'ajout dans la HashSet d'image
     * @param o the object to be compared.
     * @return 0 s'il y a déja un cercle présent dans la HashSet d'image
     */
    @Override
    public int compareTo(Cercle o) {
        return 0;
    }
}
