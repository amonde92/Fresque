package Forme;

public class Ligne extends Forme{

    private Point  a;
    private Point b;

    public Ligne(Point a, Point b){
        this.a = a;
        this.b = b;
    }


    public int Distance(){
        try{
            return (int) Math.sqrt(Math.pow((this.b.getX()-this.a.getX()),2)+Math.pow(this.b.getY()-this.a.getY(),2));
        }
        catch (ArithmeticException e){
            System.out.println();
            System.out.println("il y a un problème : " + e.getMessage());
            return -1;
        }
    }

    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        a.homothetie(rapport);
        b.homothetie(rapport);
    }

    @Override
    public void translation(int[] vector) {
        super.translation(vector);
        a.translation(vector);
        b.translation(vector);
    }

    @Override
    public void rotation() {
        super.rotation();
        a.rotation();
        b.rotation();
    }

    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        a.symetrie_centrale();
        b.symetrie_centrale();
    }

    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        a.symetrie_axiale();
        b.symetrie_axiale();
    }

    public Point getA() {return a;}
    public void setA(Point a) {this.a = a;}
    public Point getB() {return b;}
    public void setB(Point b) {this.b = b;}

    @Override
    public String toString() {
        return "Ligne{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
