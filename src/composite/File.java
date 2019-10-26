package composite;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    @Override
    public void vieuw() {
        String tab =this.identation();
        System.out.println(tab+"File : "+name);
    }
}
