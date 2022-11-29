package Forme;

public class Cercle extends Forme {
    private Point center;
    private Point R;
    private Ligne ray;


    public Cercle(Point c, Point r){
        this.center = c;
        this.R = r;
        ray = new Ligne(center,R);
    }

    public Point getCenter() {return center;}
    public void setCenter(Point center) {this.center = center;}
    public Ligne getRay() {return ray;}

    public void setRay(Ligne ray) {this.ray = ray;}


    @Override
    public double Perimetre() {
        super.Perimetre();
        return (2*Math.PI*this.ray.Distance());
    }

    @Override
    public double Aire() {
        super.Aire();
        return (Math.PI*this.ray.Distance()*this.ray.Distance());
    }

    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        center.homothetie(rapport);
        ray.homothetie(rapport);
    }

    @Override
    public void translation(int [] vector) {
        super.translation(vector);
        center.translation(vector);
        ray.translation(vector);

    }

    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        center.symetrie_axiale();
        ray.symetrie_axiale();
    }

    @Override
    public void rotation() {
        super.rotation();
        center.rotation();
        ray.rotation();
    }

    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        center.symetrie_centrale();
        ray.symetrie_centrale();

    }

    @Override
    public String toString() {
        return "Cercle{" +
                "center=" + center +
                ", ray=" + ray +
                '}';
    }
}
