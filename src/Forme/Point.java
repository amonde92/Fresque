package Forme;
public class Point extends Forme{

    private int x;
    private int y;


    public Point(int x, int y) {
        this.x = x+618;
        this.y = y+283;
    }

    public int getX() {return x;}

    public void setX(int x) {this.x = x;}

    public int getY() {return y;}

    public void setY(int y) {this.y = y;}

    public void rotation (){
        int ValTemp=x;
        x=-y+618;
        y=ValTemp;
    }

    public void symetrie_axiale(){x=-x+618;}

    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
        x=-x+618;
        y=-y+283;
    }

    public void translation(int [] vector){
        x=x+vector[0];
        y=y+vector[1];
    }

    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
        x*=rapport-618;
        y*=rapport-283;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        Point p = (Point) obj;
        return this.getX() == p.getX() && this.getY() == p.getY();
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
