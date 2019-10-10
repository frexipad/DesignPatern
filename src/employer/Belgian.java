package employer;

public class Belgian implements ICalculIGR {
    @Override
    public float culculIGR(float salaireAnnuel) {
        if (salaireAnnuel>=0 && salaireAnnuel<=40000){
            return salaireAnnuel*5/100;
        }else if (salaireAnnuel>40000&&salaireAnnuel<=120000){
            return salaireAnnuel*12/100;
        }else if (salaireAnnuel>120000){
            return salaireAnnuel*40/100;
        }
        return 0;
    }
}
