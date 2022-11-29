package Forme;

import java.util.ArrayList;

public class Polygone extends Forme{
    static final private Point ref = new Point(1000, 2000);
    final private ArrayList<Ligne> Cote = new ArrayList<>();

    public double Perimetre() {
        double somme = 0;

        for (int i = 0; i < Cote.size(); i++) {
            somme = somme + this.Distance(Cote.get(i));
        }

        return somme;
    }

     @Override
    public double Aire() {
        double aire = 0;
        aire = Triangulation();
        return aire;
    }

    public double Triangulation() {
        ArrayList<Ligne> Pclone = new ArrayList<Ligne>();
        for (int j = 0; j < Cote.size(); j++) {
            Pclone.add(Cote.get(j));
        }
        double aire = 0;
        int i = 0;

        while (Pclone.size() >= 2) {//tant qu'il y a au moins plus de 2 côté
            if (Pclone.size() != 3) {//on vérif si il reste 3 ou non
                Ligne A = Pclone.get(i);//on prend le 1er côté
                Ligne B = Pclone.get(i + 1);//on prend le 2eme côté
                Ligne C = new Ligne(new Point(Pclone.get(i).getA().getX(), Pclone.get(i).getA().getY()), new Point(Pclone.get(i + 1).getB().getX(), Pclone.get(i + 1).getB().getY()));//on créé un côté qui relie A et B
                if (Get_intercection_X(C,Pclone)%2!=0){//on vérifie si combien de fois il coupe le polyone
                    aire = aire + Aire_triangle(A, B, C);//si c'est impaire on calcule l'aire du triangle
                    if (Pclone.size() >= 2) {// on vérife si on peut supprimé les 2 coté utiliser sans problème
                        Pclone.remove(i);//on enlève le côté
                        Pclone.remove(i);// on enlève le coté
                        Pclone.add(i, C);// on rajoute le côté créer par raport à l'indexe de prélèvement
                        i = 0;// remise à 0 de l'indexe
                    }
                }else {// si c'est pas bien
                    i++;// on incrémente l'indice et on recommence
                }


            } else {// si il reste pile 3 côté
                Ligne A = Pclone.get(i);//on prend le 1er côté
                Ligne B = Pclone.get(i + 1);//on prend le 2eme côté
                Ligne C = Pclone.get(i + 2);//on prend le 3eme côté
                aire = aire + Aire_triangle(A, B, C);// on calcule l'aire du triangle
                Pclone.remove(i);// on enlève le côté
                Pclone.remove(i);// on enlève le côté
                Pclone.remove(i);// on enlève le côté
                i = 0; // on remet à 0 l'indexe
            }

        }


        return aire; // on retourne l'aire calculé
    }

    public char Get_intercection_X(Ligne C, ArrayList<Ligne> clone) {
        //création de la droite de référence
        int milieuX = (C.getB().getX() - C.getA().getX()) / 2;
        int milieuY = (C.getB().getY() - C.getA().getY()) / 2;
        float m1 = (ref.getY() - milieuY) / (ref.getX() - milieuX);
        char compt = 0;
        int b1 = (int) (milieuY - (m1 * milieuX));

        for (int i = 2; i < clone.size(); i++) {
            float m2 = (clone.get(i).getB().getY() - clone.get(i).getA().getY()) / (clone.get(i).getB().getX() - clone.get(i).getA().getX());
            int b2 = (int) (milieuY - (m2 * milieuX));
            int Xj = (int) ((b2 - b1) / (m1 - m2));


            if (clone.get(i).getA().getX() > clone.get(i).getB().getX()) {//qui est plus grand entre le X de A et le X de B


                if (Xj < clone.get(i).getA().getX() && Xj > clone.get(i).getB().getX()) {// on regarde si le Xj est entre les X de A et B

                    int Yj = (int) (m1 * Xj + b1); // on calcule le Y  si X est dans la fourchette
                    if (clone.get(i).getA().getY() > clone.get(i).getB().getY()) { //qui est plus grand entre le Y de A et le Y de B
                        if (Yj < clone.get(i).getA().getY() && Yj > clone.get(i).getB().getY()) { // on regarde si le Yj est dans la fourchette$
                            compt++; //si oui on incrémente
                        }
                    } else {
                        if (Yj > clone.get(i).getA().getY() && Yj < clone.get(i).getB().getY()) {// on regarde si le Yj est dans la fourchette
                            compt++; // si oui on incrémente
                        }
                    }
                }
            }
            else {// si B est plus grand que A
                if (Xj < clone.get(i).getB().getX() && Xj > clone.get(i).getA().getX()) {// on regarde si le Xj est entre les X de A et B

                    int Yj = (int) (m1 * Xj + b1); // on calcule le Y  si X est dans la fourchette
                    if (clone.get(i).getA().getY() > clone.get(i).getB().getY()) { //qui est plus grand entre le Y de A et le Y de B
                        if (Yj < clone.get(i).getA().getY() && Yj > clone.get(i).getB().getY()) {
                            compt++;
                        }
                    } else {
                        if (Yj > clone.get(i).getA().getY() && Yj < clone.get(i).getB().getY()) {
                            compt++;
                        }
                    }
                }
            }
        }
        return compt;
    }

    public double Hauteur(double gamma, double B) {
        return B * Math.sin(gamma);
    }

    public double Aire_triangle(Ligne A, Ligne B, Ligne C) {
        double gamma = Gamma(A, B, C);
        return (A.Distance() * Hauteur(gamma, B.Distance())) / 2;
    }


    public double Alpha(Ligne A, Ligne B, Ligne C) {
        double alphaR = 0;
        double test = -0.5 * Math.pow(A.Distance(), 2) + 0.5 * Math.pow(B.Distance(), 2) + 0.5 * Math.pow(C.Distance(), 2) / (B.Distance() * C.Distance());
        alphaR = Math.acos(test);
        double alphaD = 180 / Math.PI * alphaR;

        return alphaD;
    }

    public double Beta(Ligne A, Ligne B, Ligne C) {
        double betaR = 0;
        double test = 0.5 * Math.pow(A.Distance(), 2) - 0.5 * Math.pow(B.Distance(), 2) + 0.5 * Math.pow(C.Distance(), 2) / (A.Distance() * C.Distance());
        betaR = Math.acos(test);
        double betaD = 180 / Math.PI * betaR;

        return betaD;
    }

    public double Gamma(Ligne A, Ligne B, Ligne C) {
        double beta = Beta(A, B, C);
        double alpha = Alpha(A, B, C);
        return 180 - alpha - beta;
    }

    private double Distance(Ligne L) {
        try {
            return Math.sqrt(Math.pow((L.getB().getX() - L.getA().getX()), 2) + Math.pow(L.getB().getY() - L.getA().getY(), 2));
        } catch (ArithmeticException e) {
            System.out.println();
            System.out.println("il y a un problème : " + e.getMessage());
            return -1;
        }

    }

    public void addLigne(int tab[][]) {

        for (int i = 0; i < (tab.length) - 1; i++) {
            Cote.add(new Ligne(new Point(tab[i][0], tab[i][1]), new Point(tab[i + 1][0], tab[i + 1][1])));
        }
        Cote.add(new Ligne(new Point(tab[(tab.length) - 1][0], tab[(tab.length) - 1][1]), new Point(tab[0][0], tab[0][1])));
    }

    public void Print() {

        for (int i = 0; i < (Cote.size()); i++) {
            System.out.println(Cote.get(i).getA().getX() + " X1 , " + Cote.get(i).getA().getY() + "Y1  " + Cote.get(i).getB().getX() + " X2 , " + Cote.get(i).getB().getY() + "Y2 ");

        }
    }

    @Override
    public void homothetie(int rapport) {
        super.homothetie(rapport);
    }

    @Override
    public void translation(int[] vector) {
        super.translation(vector);
    }

    @Override
    public void symetrie_axiale() {
        super.symetrie_axiale();
    }

    @Override
    public void symetrie_centrale() {
        super.symetrie_centrale();
    }

    @Override
    public void rotation() {
        super.rotation();
    }

    public ArrayList<Ligne> getCote() {
        return Cote;
    }
}
