package cofeeshop;

public class Coffe {

    protected static final double prix = 6 ;

    protected boolean melk ;
    protected boolean caramel ;
    protected boolean chocolat;
    protected boolean chantelly;

    public  double getPrix() {
        double prixIngrediant = 0;
        if (this.melk)prixIngrediant+=2;
        if (this.caramel)prixIngrediant+=1.5;
        if (chantelly)prixIngrediant+=1;
        if (chocolat)prixIngrediant+=3;
        return prixIngrediant+prix;
    }

    public boolean isMelk() {
        return melk;
    }

    public void setMelk(boolean melk) {
        this.melk = melk;
    }

    public boolean isCaramel() {
        return caramel;
    }

    public void setCaramel(boolean caramel) {
        this.caramel = caramel;
    }

    public boolean isChocolat() {
        return chocolat;
    }

    public void setChocolat(boolean chocolat) {
        this.chocolat = chocolat;
    }

    public boolean isChantelly() {
        return chantelly;
    }

    public void setChantelly(boolean chantelly) {
        this.chantelly = chantelly;
    }
}
