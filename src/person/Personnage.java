package person;

import strategies.ComportementArme;

public abstract class Personnage {

    protected String name;
    protected int score ;

    //Interface Master
    protected ComportementArme comportementArme;
    public abstract void combattre();

    public void comportementArm() {
        comportementArme.utiliserArme();
    }


    public void setComportementArme(ComportementArme comportementArme) {
        this.comportementArme = comportementArme;
    }
}
