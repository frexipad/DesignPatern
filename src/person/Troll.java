package person;

public class Troll extends Personnage {
    @Override
    public void combattre() {
        this.score+=1;
    }
}
