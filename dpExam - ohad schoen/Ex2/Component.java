package Ex2;

import javax.naming.OperationNotSupportedException;
import java.util.List;

public interface Component {
    int getSum();

   List<Component> getChilds();

   void add(Component component1) throws OperationNotSupportedException;}
