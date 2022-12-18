package Forme;

public class Ellipse extends Forme implements Comparable<Ellipse>{

    private Point center;
    private Point abscisse;
    private Point ordonne;
    private Ligne rayonA;
    private Ligne rayonB;
    final float pi= (float)Math.PI;

    public void setAbscisse(Point abscisse) {this.abscisse = abscisse;}
    public Point getAbscisse() {return abscisse;}
    public void setOrdonne(Point ordonne) {this.ordonne = ordonne;}
    public Point getOrdonne() {return ordonne;}
    public void setCenter(Point center) {this.center = center;}
    public Point getCenter() {return center;}
    public void setRayonA(Ligne rayonA) {this.rayonA = rayonA;}
    public Ligne getRayonA() {return rayonA;}
    public void setRayonB(Ligne rayonB) {this.rayonB = rayonB;}
    public Ligne getRayonB() {return rayonB;}

    /**
     * Constructeur de la class Ellipse, récupère trois points, l'origine,
     * un second point qui servira pour construire une ligne (centre et distance la plus courte du centre)
     * et un troisième point qui servira pour construire une ligne (centre et distance la plus longue du centre)
     * @param center : Point, origine du cercle
     * @param abscisse : Point, pour calculer le rayon court du cercle
     * @param ordonne : Point, pour calculer le rayon long du cercle
     */
    public Ellipse(Point center, Point abscisse, Point ordonne) {
        this.center = center;
        this.abscisse = abscisse;
        this.ordonne = ordonne;
        rayonA = new Ligne(center,abscisse);
        rayonB = new Ligne(center,ordonne);
    }
    /**
     * Méthode qui réalise l'homothétie de l'ellipse, la méthode homothétie est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur l'ellipse
     * @see Point#homothetie(int)
     * @param rapport : rapport selon lequel est réalisée l'homothétie
     */
    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        center.homothetie(rapport);
        abscisse.homothetie(rapport);
        ordonne.homothetie(rapport);
    }
    /**
     * Méthode qui réalise la translation de l'ellipse, la méthode translation est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur l'ellipse
     * @see Point#translation(int[])
     * @param vector : vecteur selon lequel est réalisée la translation
     */
    @Override
    public void translation(int[] vector) {
        super.translation(vector);
        //center.translation(vector);
        abscisse.translation(vector);
        ordonne.translation(vector);
    }
    /**
     * Méthode qui réalise la symétrie centrale de l'ellipse, la méthode symétrie_centrale est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur l'ellipse
     * @see Point#symetrie_centrale()
     */
    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        center.symetrie_centrale();
        abscisse.symetrie_centrale();
        ordonne.symetrie_centrale();
    }

    /**
     * Méthode qui réalise la symétrie axale de l'ellipse, la méthode symétrie_axiale est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur l'ellipse
     * @see Point#symetrie_axiale()
     */
    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        center.symetrie_axiale();
        abscisse.symetrie_axiale();
        ordonne.symetrie_axiale();
    }
    /**
     * Méthode qui réalise la rotation de l'ellipse, la méthode rotation est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur l'ellipse
     * @see Point#symetrie_axiale()
     */
    @Override
    public void rotation() {
        super.rotation();
        rayonA.rotation();
        rayonB.getB().rotation();
    }

    /**
     * Méthode qui calcul le périmètre d'une ellipse selon une formule mathématique
     * @return Le périmètre de l'ellipse
     */
    @Override
    public double Perimetre() {
        super.Perimetre();
        return 2*pi*(float)Math.sqrt(((float)Math.pow(rayonA.Distance(),2)+(float)Math.pow(rayonB.Distance(),2))/2);
    }

    /**
     * Méthode qui calcul l'aire de l'ellipse selon une formule mathématique
     * @return l'aire du cercle
     */
    @Override
    public double Aire() {
        super.Aire();
        return pi* rayonA.Distance()* rayonB.Distance();
    }

    /**
     * Méthode qui compare l'objet courant et l'objet donné en paramètre
     * @param obj : Objet, l'objet que l'on veut comparer
     * @return true si les deux objets sont égaux sinon false
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Ellipse e = (Ellipse) obj;
        if(this.rayonA.equals(e.rayonA)) {
            return this.rayonB.equals(e.rayonB);
        }
        return false;
    }
    /**
     * Méthode toString
     * @return informations clés du Point
     */
    @Override
    public String toString() {
        return "Ellipse{" +
                "center=" + center +
                ", abscisse=" + abscisse +
                ", ordonne=" + ordonne +
                ", rayonA=" + rayonA.Distance() +
                ", rayonB=" + rayonB.Distance() +
                ", pi=" + pi +
                '}';
    }
    /**
     * Méthode qui permet de vérifier qu'un doublon n'est pas présent lors de l'ajout dans la HashSet d'image
     * @param ellipse the object to be compared.
     * @return 0 s'il y a déja un cercle présent dans la HashSet d'image
     */
    @Override
    public int compareTo(Ellipse ellipse) {
        return 0;
    }
}
