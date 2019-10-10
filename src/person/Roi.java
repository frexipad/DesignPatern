package person;

import strategies.ComportementFleche;

public class Roi extends Personnage {

    public Roi() {
        this.comportementArme=new ComportementFleche();
    }

    @Override
    public void combattre() {
        this.score+=1;
        System.out.print("Je suis un roi ");
        this.comportementArme.utiliserArme();
    }
}
