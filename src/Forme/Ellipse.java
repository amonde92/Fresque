package Forme;

public class Ellipse extends Forme implements Comparable<Ellipse>{

    /**
     * variables élémentaire de l'éllipse
     */

    private Point center;
    private Point abscisse;
    private Point ordonne;
    private Ligne rayonA;
    private Ligne rayonB;
    final float pi= (float)Math.PI;




    /**
     * setteur et getteur des variables élémentaire de l'éllipse
     */

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
     * initilisateur de l'éllipse
     */
    public Ellipse(Point center, Point abscisse, Point ordonne) {
        this.center = center;
        this.abscisse = abscisse;
        this.ordonne = ordonne;
        rayonA = new Ligne(center,abscisse);
        rayonB = new Ligne(center,ordonne);
    }
    /**
     * aggrantisement ou réduction de l'éllipse par rapport à un rapport
     */
    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        center.homothetie(rapport);
        abscisse.homothetie(rapport);
        ordonne.homothetie(rapport);
    }
    /**
     * fait une translation de l'éllipse par rapport à un vecteur
     */
    @Override
    public void translation(int[] vector) {
        super.translation(vector);
        //center.translation(vector);
        abscisse.translation(vector);
        ordonne.translation(vector);
    }
    /**
     * fait une symétrie centrale sur l'éllipse
     */
    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        center.symetrie_centrale();
        abscisse.symetrie_centrale();
        ordonne.symetrie_centrale();
    }

    /**
     * fait une symétrie axiale sur l'éllipse
     */
    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        center.symetrie_axiale();
        abscisse.symetrie_axiale();
        ordonne.symetrie_axiale();
    }
    /**
     * fait une rotation sur l'éllipse
     */
    @Override
    public void rotation() {
        super.rotation();
        rayonA.rotation();
        rayonB.getB().rotation();
    }

    /**
     * calcule le périmetre de l'éllipse
     */
    @Override
    public double Perimetre() {
        super.Perimetre();
        return 2*pi*(float)Math.sqrt(((float)Math.pow(rayonA.Distance(),2)+(float)Math.pow(rayonB.Distance(),2))/2);
    }

    /**
     * calcule l'aire de l'éllipse
     */
    @Override
    public double Aire() {
        super.Aire();
        return pi* rayonA.Distance()* rayonB.Distance();
    }

    /**
     * vérifie si on a déjà ou non le cercle créé
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
     * affiche les variables élémentaire de l'éllipse
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

    @Override
    public int compareTo(Ellipse ellipse) {
        return 0;
    }
}
