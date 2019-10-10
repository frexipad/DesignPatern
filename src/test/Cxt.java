package test;

public class Cxt {
    Iinterface iinterface;

    public void appliStrategy(){
        this.iinterface.comportement();
    }

    public void setIinterface(Iinterface iinterface) {
        this.iinterface = iinterface;
    }
}
