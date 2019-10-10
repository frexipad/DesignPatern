package test3;

public class Context3 {
    Interface3 interface3;

    public void comportementStrategy(){
        interface3.comportement();
    }

    public void setInterface3(Interface3 interface3) {
        this.interface3 = interface3;
    }
}
