package Ex2;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> childs = new ArrayList<>();

    @Override
    public int getSum() {
        int currentSum = 0;
        for (Component child : childs) {
            currentSum += child.getSum();
        }

        return currentSum;
    }

    @Override
    public List<Component> getChilds() {
        return this.childs;
    }

    @Override
    public void add(Component component) throws OperationNotSupportedException {
        this.childs.add(component);
    }

    public boolean doesAllEven() {
        boolean isAllEven = true;

        for (Component child : childs) {
            if(child instanceof Leaf) {
                isAllEven = (child.getSum() % 2 == 0);
            } else {
                isAllEven = ((Composite)child).doesAllEven();
            }

            if(!isAllEven) {
                break;
            }
        }

        return isAllEven;
    }

}
