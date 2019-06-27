package Ex2;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public class Leaf implements Component{
    private int number;

    public Leaf(int number) {
        this.number = number;
    }

    @Override
    public int getSum() {
        return number;
    }

    @Override
    public List<Component> getChilds() {
        return null;
    }

    @Override
    public void add(Component component) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("leaf can have childs");
    }
}
