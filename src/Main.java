import Forme.Cercle;
import Forme.Point;
import Forme.Polygone;
import Vue.Frame;

public class Main {
    public static void main(String[] args) {

        int [][] T = new int[][]{{0,0}, {1,3}, {24,6}, {5,7}, {2,5}};
        Polygone P = new Polygone(T);
        P.Print();
        P.rotation();
        System.out.println();
        System.out.println();
        P.Print();
        P.homothetie(2);
        System.out.println();
        System.out.println();
        P.Print();

    }
}