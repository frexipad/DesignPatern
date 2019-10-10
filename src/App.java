import dpObservable.*;
import employer.Belgian;
import employer.Employe;
import patternStratigy.*;
import person.Chevallier;
import person.Personnage;
import person.Roi;
import strategies.ComportementFleche;
import strategies.ComportementHache;
import strategies.Comportementpoignard;
import test.Chat;
import test.Cxt;
import test2.Cxt2;
import test2.Lion;
import test3.Context3;
import test3.Pony;
import test4.Cxt4;
import test4.Ferrary;

public class App {

    public static void main(String[] args) {

        Context ctx =new Context();
        ctx.setTrie(new A());
        ctx.appliquerStratigy();

        ctx.setTrie(new B());
        ctx.appliquerStratigy();
        ctx.appliquerStratigy();

        Cxt cxt1 =new Cxt();
        cxt1.setIinterface(new Chat());
        cxt1.appliStrategy();

        Cxt2 cxt2 =new Cxt2();
        cxt2.setIinterface2(new Lion());
        cxt2.comportement();

        Context3 context3 =new Context3();
        context3.setInterface3(new Pony());
        context3.comportementStrategy();

        Cxt4 cxt4=new Cxt4();
        cxt4.setInterf4(new Ferrary());
        System.out.println("speed ferrary is :"+cxt4.speedCars());


        Personnage personnage = new Personnage() {
            @Override
            public void combattre() {

            }
        };

        Chevallier chevallier=new Chevallier();
        chevallier.combattre();

        Employe employe =new Employe();
        employe.setiCalculIGR(new Belgian());
        float result = employe.traitement(-10000);
        System.out.println(result);

        Meteo meteo =new MeteoImpl();
        Observer o1 =new ObserverImpOne();
        Observer o2 =new ObserverImplTwo();
        Observer o3 = new ObserverImpOne();
        System.out.println("*****************Observable*******************************************");

        meteo.addSubscribe(o1);
        ((MeteoImpl) meteo).setState(10);
        ((MeteoImpl) meteo).setState(20);
        ((MeteoImpl) meteo).setState(30);
        ((MeteoImpl) meteo).setState(30);



    }
}
