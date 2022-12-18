package Forme;


/**
 * Classe Abstraite Forme, qui représente toutes les formes possibles de cette Fresque
 * et les méthodes qu'elles peuvent implémenter.
 */
public abstract class Forme {

    /**
     * Méthode qui réalise l'homotéthie de la forme
     * @param rapport : rapport selon lequel est réalisée l'homothétie
     */
    public  void homothetie (int rapport){}

    /**
     * Méthode qui réalise la translation de la forme
     * @param vector : vecteur selon lequel est faite la translation
     */
    public void translation(int [] vector){}

    /**
     * Méthode qui réalise la rotation de la forme
     */
    public void rotation (){}

    /**
     * Méthode qui réalise la symétrie centrale de la forme
     */
    public void symetrie_centrale(){}

    /**
     * Méthode qui réalise la symétrie axiale de la forme
     */
    public void symetrie_axiale(){}

    /**
     * Méthode qui retourne l'aire d'une forme
     * @return L'aire de la forme
     */
    public double Aire (){
        return  1;
    }

    /**
     * Méthode qui retourne le périmètre de la forme
     * @return Le périmètre de la forme
     */
    public double Perimetre (){
        return  1;
    }

}
