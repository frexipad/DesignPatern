package dpObservable;

public class ObserverImplTwo implements Observer {
    private int counter;
    @Override
    public void update(Meteo meteo) {
        double state = ((MeteoImpl)meteo).getState();
        double res = state+2;
        if (counter%2==0)++counter;
        System.out.println("************ObserverImplTwo***************************");
        System.out.println("Nouvelle mise ajour du state : "+state);
        System.out.println(("Nouvelle resultat est "+res));
        System.out.println("Le counter est :"+counter);
        System.out.println("******************************************************");
    }
}
