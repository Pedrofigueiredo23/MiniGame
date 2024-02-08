import java.util.Scanner;

public class Main {

    public static void jogar(User user, Monstro monstro){

        String opção;
        Scanner scan = new Scanner(System.in);

        //Ficar enfrentar até vida 0
        while(true){

            System.out.println("Monstro a enfrentar");
            System.out.println("hp: " + monstro.hp);
            System.out.println("attackPoints: " + monstro.attackPoints);

            System.out.println("a) Atacar");
            System.out.println("f) Fugir");

            opção = scan.nextLine();


            if(opção.toLowerCase().equals("a")){
                monstro.hp = user.ataqueNormal(monstro.hp);
                System.out.println("Hp do monstro: " + monstro.hp);

                user.hp = monstro.ataqueNormal(user.hp);
                System.out.println("Hp do User: " + user.hp);
            }

            if(opção.toLowerCase().equals("f")) {
                System.out.println("Fugiu com sucesso");
                return;
            }

            if(user.hp <= 0 || monstro.hp <=0){
                System.out.println("Game over");
        }
            if (monstro.hp <= 0){
                System.out.println("Monstro derrotado");
                break;
            }
    }
        if (user.hp <=0 && monstro.hp <= 0){
            System.out.println("Empate");
        }
        if (user.hp <=0){
            System.out.println("Voce perdeu");
        }
        if (monstro.hp <=0){
            System.out.println("Voce ganhou");
        }
}
    public static void main(String[] args) {



        User user = new User();
        user.hp = 10;
        user.attackPoints = 3;

        Monstro monstro1 = new Monstro();
        monstro1.hp = 5;
        monstro1.attackPoints = 2;

        jogar(user, monstro1);

        /*Monstro monstro2 = new Monstro();
        monstro2.hp = 7;
        monstro2.attackPoints = 3;

        Monstro monstro3 = new Monstro();
        monstro3.hp = 10;
        monstro3.attackPoints = 4;*/


    }
}