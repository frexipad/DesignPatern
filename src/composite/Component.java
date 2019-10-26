package composite;

public abstract class Component {
    protected String name;
    protected int leval ;

    public Component(String name) {
        this.name = name;
    }

    public abstract void vieuw();

    public String identation(){
        String str ="";
        for (int i = 0; i < leval; i++) {
            str="\t";
        }
        return str;
    }
}
