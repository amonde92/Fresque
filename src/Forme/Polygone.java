package Forme;

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;
public class Polygone{
    static final private Point ref = new Point(1000,2000);
    final private ArrayList<Ligne> Cote = new ArrayList<>();
    private double Aire =0;

    public double Perimetre(){
        double somme=0;

        for (int i=0;i<Cote.size();i++){
            somme = somme+this.Distance(Cote.get(i));
        }

        return somme;
    }


    public void Aire(){
        double aire = 0;
        aire = Triangulation();
        this.Aire = aire;
    }
    public double Triangulation(){
        ArrayList<Ligne> Pclone = new ArrayList<Ligne>();
        for (int j=0;j<Cote.size();j++)
        {
            Pclone.add(Cote.get(j));
        }
        double aire=0;
        int i=0;

        while (Pclone.size() >=2){
            if (Pclone.size()!=3) {
                Ligne A = Pclone.get(i);
                Ligne B = Pclone.get(i + 1);
                Ligne C = new Ligne(new Point(Pclone.get(i).getA().getX(), Pclone.get(i).getA().getY()),new Point (Pclone.get(i + 1).getB().getX(), Pclone.get(i + 1).getB().getY()));
                aire = aire + Aire_triangle(A, B, C);
                if (Pclone.size() >= 2) {
                    Pclone.remove(i);
                    Pclone.remove(i);
                    Pclone.add(0, C);
                    i = 0;
                }


            }
            else {
                Ligne A = Pclone.get(i);
                Ligne B = Pclone.get(i + 1);
                Ligne C = Pclone.get(i + 2);
                aire = aire + Aire_triangle(A, B, C);
                Pclone.remove(i);
                Pclone.remove(i);
                Pclone.remove(i);
                i = 0;
            }

        }



        return aire;
    }
    public void Get_intercection_X(Ligne C,Polygone clone){
        //création de la droite de référence
        int milieuX = (C.getB().getX() - C.getA().getX())/2;
        int milieuY = (C.getB().getY() - C.getA().getY())/2;
        float m1 = (ref.getY()-milieuY)/(ref.getX()-milieuX);
        int b1 = (int) (milieuY-(m1*milieuX));
        for (int i=2;i<clone.Cote.size();i++){
            float m2 = (clone.Cote.get(i).getB().getY() - clone.Cote.get(i).getA().getY())/(clone.Cote.get(i).getB().getX() - clone.Cote.get(i).getA().getX());
            int b2 = (int) (milieuY-(m2*milieuX));
            int Xj = (int) ((b2-b1)/(m1-m2));
            if (clone.Cote.get(i).getA().getX()>clone.Cote.get(i).getB().getX()){
                if(Xj<clone.Cote.get(i).getA().getX()&&Xj>clone.Cote.get(i).getB().getX()){

                }
            }
            else{
                if(Xj<clone.Cote.get(i).getB().getX()&&Xj>clone.Cote.get(i).getA().getX()){

                }
            }
        }
    }

    public double Hauteur(double gamma, double B){
        return B*Math.sin(gamma);
    }

    public double Aire_triangle(Ligne A, Ligne B, Ligne C){
        double gamma = Gamma(A,B,C);
        return (A.Distance()*Hauteur(gamma,B.Distance()))/2;
    }


    public double Alpha(Ligne A,Ligne B, Ligne C){
        double alphaR=0;
        double test =-0.5*Math.pow(A.Distance(),2)+0.5*Math.pow(B.Distance(),2)+0.5*Math.pow(C.Distance(),2)/(B.Distance()*C.Distance());
        alphaR = Math.acos(test);
        double alphaD = 180/Math.PI*alphaR;

        return alphaD;
    }
    public double Beta(Ligne A,Ligne B, Ligne C){
        double betaR=0;
        double test =0.5*Math.pow(A.Distance(),2)-0.5*Math.pow(B.Distance(),2)+0.5*Math.pow(C.Distance(),2)/(A.Distance()*C.Distance());
        betaR = Math.acos(test);
        double betaD = 180/Math.PI*betaR;

        return betaD;
    }
    public double Gamma(Ligne A, Ligne B, Ligne C){
        double beta = Beta(A,B,C);
        double alpha = Alpha(A,B,C);
        return 180-alpha-beta;
    }

    private double Distance(Ligne L){
        try{
            return Math.sqrt(Math.pow((L.getB().getX()-L.getA().getX()),2)+Math.pow(L.getB().getY()-L.getA().getY(),2));
        }
        catch (ArithmeticException e){
            System.out.println();
            System.out.println("il y a un problème : " + e.getMessage());
            return -1;
        }

    }

    public void addLigne(int tab[][]){

        for (int i=0;i<(tab.length)-1;i++){
            Cote.add(new Ligne(new Point(tab[i][0],tab[i][1]),new Point(tab[i+1][0],tab[i+1][1])));
        }
        Cote.add(new Ligne(new Point(tab[(tab.length)-1][0],tab[(tab.length)-1][1]),new Point(tab[0][0],tab[0][1])));
    }

    public void Print(){

        for (int i=0;i<(Cote.size());i++){
            System.out.println(Cote.get(i).getA().getX()+" X1 , "+Cote.get(i).getA().getY()+"Y1  "+Cote.get(i).getB().getX()+" X2 , "+Cote.get(i).getB().getY()+"Y2 ");

        }
    }
    public ArrayList<Ligne> getCote() {return Cote;}

    public void setAire(double aire) {this.Aire = aire;}

    public double getAire() {return Aire;}
}
