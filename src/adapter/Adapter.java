package adapter;

public class Adapter implements Standard {
private EncienneImpl encienne = new EncienneImpl();

    @Override
    public void operation(int nb1, int nb2) {
        double res = encienne.calcule((double)nb1,nb2);
        encienne.print(res);

    }
}
