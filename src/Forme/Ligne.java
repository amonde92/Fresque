package Forme;

public class Ligne extends Forme implements Comparable<Ligne>{
    private Point  a;
    private Point b;

    /**
     * Constructeur de la class Ligne
     * @param a : premier Point
     * @param b : second Point
     * @see Point
     */
    public Ligne(Point a, Point b){
        this.a = a;
        this.b = b;
    }

    public Point getA() {return a;}
    public void setA(Point a) {this.a = a;}
    public Point getB() {return b;}
    public void setB(Point b) {this.b = b;}

    /**
     * Méthode qui calcule la distance de la Ligne
     * @return la distance de la ligne
     */
    public double Distance(){
        try{
            return Math.sqrt(Math.pow((this.b.getX()-this.a.getX()),2)+Math.pow(this.b.getY()-this.a.getY(),2));
        }
        catch (ArithmeticException e){
            System.out.println();
            System.out.println("il y a un problème : " + e.getMessage());
            return -1;
        }
    }

    /**
     * Méthode qui réalise l'homothétie de la ligne, la méthode homothétie est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#homothetie(int)
     * @param rapport : rapport selon lequel est réalisée l'homothétie
     */
    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        a.homothetie(rapport);
        //b.homothetie(rapport);
    }

    /**
     * Méthode qui réalise la translation de la ligne, la méthode translation est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#translation(int[])
     * @param vector : vecteur selon lequel est réalisée la translation
     */
    @Override
    public void translation(int[] vector) {
        super.translation(vector);
        a.translation(vector);
        //b.translation(vector);
    }

    /**
     * Méthode qui réalise la rotation de la ligne, la méthode rotation est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#symetrie_axiale()
     */
    @Override
    public void rotation() {
        super.rotation();
        a.rotation();
        b.rotation();
    }

    /**
     * Méthode qui réalise la symétrie centrale de la ligne, la méthode symétrie_centrale est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#symetrie_centrale()
     */
    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        a.symetrie_centrale();
        b.symetrie_centrale();
    }

    /**
     * Méthode qui réalise la symétrie axiale du cercle, la méthode symétrie_axiale est appelé sur les points,
     * c'est ce qui permet d'ensuite la réaliser sur le cercle
     * @see Point#symetrie_axiale()
     */
    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
        a.symetrie_axiale();
        b.symetrie_axiale();
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
        Ligne l = (Ligne) obj;
        if (this.getA().equals(l.getA())){
            return this.getB().equals(l.getB());
        }
        return false ;
    }

    /**
     * Méthode toString
     * @return informations clés de la Ligne
     */
    @Override
    public String toString() {
        return "Ligne{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    /**
     * Méthode qui permet de vérifier qu'un doublon n'est pas présent lors de l'ajout dans la HashSet d'image
     * @param o the object to be compared.
     * @return 0 s'il y a déja un cercle présent dans la HashSet d'image
     */
    @Override
    public int compareTo(Ligne o) {
        return 0;
    }
}
