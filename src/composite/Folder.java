package composite;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component {

    List<Component> componentList=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public void vieuw() {
        String tab =identation();
        System.out.println(tab+"Folder : "+name);
        for (Component c : componentList){
            c.vieuw();
        }
    }

    public void addComponent(Component component){
        component.leval = leval+1;
        this.componentList.add(component);
    }
}
