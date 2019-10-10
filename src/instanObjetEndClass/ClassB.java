package instanObjetEndClass;

public class ClassB extends ClassA {
    int v3 = 2;

    void methode2(){
        System.out.println(super.methode1()*v3);
    }
}
