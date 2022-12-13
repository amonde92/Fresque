package Forme;
public class Point extends Forme{
    /**
     * variable élémentaire du point
     */
    private int x;
    private int y;

    /**
     *initialisateur du point
     */
    public Point(int x, int y) {
        this.x = x+618;
        this.y = y+283;
    }

    /**
     * setteur et getteur des variables élémentaire du point
     */
    public void setX(int x) {this.x = x;}

    public int getX() {return x;}

    public void setY(int y) {this.y = y;}

    public int getY() {return y;}

    /**
     * rotation des variables élémentaire du point
     */
    public void rotation (){
        int ValTemp=x;
        x=-y+618;
        y=ValTemp;
    }
    /**
     * symétrie axiale des variable élémentaire du point
     */
    public void symetrie_axiale(){x=-x+618;}
    /**
     * symétrie centrale des variable élémentaire du point
     */
    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        x=-x+618;
        y=-y+283;
    }
    /**
     * translation des variable élémentaire du point par rapport à un vecteur
     */
    public void translation(int [] vector){
        x=x+vector[0];
        y=y+vector[1];
    }
    /**
     * augmentation ou réduction des variable élémentaire du point par rapport à un rapport
     */
    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        x*=rapport-618;
        y*=rapport-283;
    }

    /**
     * vérifie si on a déjà ou non le point créé
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Point p = (Point) obj;
        return this.getX() == p.getX() && this.getY() == p.getY();
    }

    /**
     * affiche les variables élémentaire du point
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
