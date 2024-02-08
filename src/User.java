public class User implements Atacar{

    public int hp;
    public int mana;
    public int attackPoints;
    public int attackEquipamento;

    public int ataqueNormal(int hpAlvo){
        return hpAlvo - attackPoints - attackEquipamento;
    }

}
