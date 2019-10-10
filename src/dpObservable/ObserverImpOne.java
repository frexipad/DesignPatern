package dpObservable;

public class ObserverImpOne implements Observer {
    @Override
    public void update(Meteo meteo) {
        double state = ((MeteoImpl)meteo).getState();
        double res = state+2;
        System.out.println("************ObserverImplOne***************************");
        System.out.println("Nouvelle mise ajour du state : "+state);
        System.out.println(("Nouvelle resultat est "+res));
        System.out.println("******************************************************");

    }
}
