package Forme;

public abstract class Forme {
    /**
     * fonction de transformation des formes
     */
    public  void homothetie (int rapport){}

    public void translation(int [] vector){
        return ;
    }

    public void rotation (){
        return ;
    }

    public void symetrie_centrale(){}
    public void symetrie_axiale(){}

    public double Aire (){
        return  1;
    }

    public double Perimetre (){
        return  1;
    }

}
