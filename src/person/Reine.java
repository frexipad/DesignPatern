package person;

import strategies.ComportementFleche;

public class Reine extends Personnage {

    public Reine() {
        this.comportementArme = new ComportementFleche();
    }

    @Override
    public void combattre() {
        this.score+=1;
    }
}
