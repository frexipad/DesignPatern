package person;

import strategies.ComportementHache;

public class Chevallier extends Personnage {
    @Override
    public void combattre() {
        Chevallier chevallier=new Chevallier();
        chevallier.setComportementArme(new ComportementHache());
        this.score+=1;
        System.out.print("Bonjour je suis le Chevallier et voila mon score ,"+score+" ,");
        chevallier.comportementArm();

    }
}
