package employer;

public class Employe {
    public ICalculIGR iCalculIGR;

    public float traitement(float salaire){
        float v = iCalculIGR.culculIGR(salaire);
        return v;
    }

    public void setiCalculIGR(ICalculIGR iCalculIGR) {
        this.iCalculIGR = iCalculIGR;
    }
}
