package Forme;

public class Cercle extends Forme {
    private Point center;
    private Ligne ray;


    public Cercle(Point c, Ligne r){
        this.center = c;
        this.ray = r;
    }

    public Point getCenter() {return center;}
    public void setCenter(Point center) {this.center = center;}
    public Ligne getRay() {return ray;}

    public void setRay(Ligne ray) {this.ray = ray;}

    public double Perimetre(){
        return (2*Math.PI*this.ray.Distance());
    }
    public double Aire(){
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
    public void symétrie_axiale() {
        super.symétrie_axiale();
        center.symétrie_axiale();
        ray.symétrie_axiale();
    }

    @Override
    public void rotation() {
        super.rotation();
        center.rotation();
        ray.rotation();
    }

    @Override
    public void symétrie_centrale() {
        super.symétrie_centrale();
        center.symétrie_centrale();
        ray.symétrie_centrale();

    }
}
