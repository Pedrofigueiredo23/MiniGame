public class Monstro implements Atacar{

    public int hp;
    public int attackPoints;

    public int ataqueNormal(int hpAlvo){
        return hpAlvo - attackPoints;
    }


}
