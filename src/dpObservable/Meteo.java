package dpObservable;

public interface Meteo {
    public void addSubscribe(Observer observer);
    public void unSubscribe(Observer observer);
    public void notifyObservers();
}
