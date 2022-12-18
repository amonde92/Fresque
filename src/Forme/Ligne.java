package Forme;

public class Ligne extends Forme implements Comparable<Ligne>{
    /**
     * variables élémentaire de la ligne
     */
    private Point  a;
    private Point b;

    /**
     * initialisateur des points de la ligne
     */
    public Ligne(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    /**
     * calcule la distance entre les 2 points qui compose la ligne
     */
    public double Distance(){
        try{
            return Math.sqrt(Math.pow((this.b.getX()-this.a.getX()),2)+Math.pow(this.b.getY()-this.a.getY(),2));
            //return Integer.parseInt(String.valueOf(Math.sqrt(Math.pow((this.b.getX()-this.a.getX()),2)+Math.pow(this.b.getY()-this.a.getY(),2))));
        }
        catch (ArithmeticException e){
            System.out.println();
            System.out.println("il y a un problème : " + e.getMessage());
            return -1;
        }
    }

    /**
     * augmentation ou réduction de la ligne par rapport à un rapport
     */
    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        a.homothetie(rapport);
        //b.homothetie(rapport);
    }

    /**
     * translation des points de la ligne par rapport à un vecteur
     */
    @Override
    public void translation(int[] vector) {
        super.translation(vector);
        a.translation(vector);
        //b.translation(vector);
    }

    /**
     * rotation des points de la ligne par rapport à un vecteur
     */
    @Override
    public void rotation() {
        super.rotation();
        a.rotation();
        b.rotation();
    }

    /**
     * symétrie central des points de la ligne par rapport à un vecteur
     */
    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        a.symetrie_centrale();
        b.symetrie_centrale();
    }

    /**
     * symétrie axiale des points de la ligne par rapport à un vecteur
     */
    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        a.symetrie_axiale();
        b.symetrie_axiale();
    }

    /**
     * récupération des élément que compose la ligne
     */
    public Point getA() {return a;}
    public void setA(Point a) {this.a = a;}
    public Point getB() {return b;}
    public void setB(Point b) {this.b = b;}


    /**
     * vérifie si on a déjà ou non la ligne créé
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Ligne l = (Ligne) obj;
        if (this.getA().equals(l.getA())){
            return this.getB().equals(l.getB());
        }
        return false ;
    }

    /**
     * affiche les variables élémentaire de la ligne
     */
    @Override
    public String toString() {
        return "Ligne{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int compareTo(Ligne o) {
        return 0;
    }
}
