package Forme;

public class Ellipse extends Forme{

    private Point center;
    private Point abscisse;
    private Point ordonne;
    private Ligne rayonA;

    public Point getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(Point abscisse) {
        this.abscisse = abscisse;
    }

    public Point getOrdonne() {
        return ordonne;
    }

    public void setOrdonne(Point ordonne) {
        this.ordonne = ordonne;
    }

    private Ligne rayonB;
    final float pi= (float)Math.PI;
    public Point getCenter() {
        return center;
    }
    public void setCenter(Point center) {
        this.center = center;
    }
    public Ligne getRayonA() {
        return rayonA;
    }
    public void setRayonA(Ligne rayonA) {
        this.rayonA = rayonA;
    }
    public Ligne getRayonB() {
        return rayonB;
    }
    public void setRayonB(Ligne rayonB) {this.rayonB = rayonB;
    }


    public Ellipse(Point center, Point abscisse, Point ordonne) {
        this.center = center;
        this.abscisse = abscisse;
        this.ordonne = ordonne;
        rayonA = new Ligne(center,abscisse);
        rayonB = new Ligne(center,ordonne);
    }

    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        center.homothetie(rapport);
        rayonA.homothetie(rapport);
        rayonB.homothetie(rapport);
    }

    @Override
    public void translation(int[] vector) {
        super.translation(vector);
        center.translation(vector);
        rayonA.translation(vector);
        rayonB.translation(vector);
    }

    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        center.symetrie_centrale();
        rayonA.symetrie_centrale();
        rayonB.symetrie_centrale();
    }

    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        center.symetrie_axiale();
        rayonA.symetrie_axiale();
        rayonB.symetrie_axiale();
    }

    @Override
    public void rotation() {
        super.rotation();
        center.rotation();
        rayonA.rotation();
        rayonB.rotation();
    }

    @Override
    public double Perimetre() {
        super.Perimetre();
        return 2*pi*(float)Math.sqrt(0.5*((float)Math.pow(rayonA.Distance()/2,2)+(float)Math.pow(rayonB.Distance()/2,2)));
    }

    @Override
    public double Aire() {
        super.Aire();
        return pi* rayonA.Distance()* rayonB.Distance()/4;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "center=" + center +
                ", abscisse=" + abscisse +
                ", ordonne=" + ordonne +
                ", rayonA=" + rayonA +
                ", rayonB=" + rayonB +
                ", pi=" + pi +
                '}';
    }
}
