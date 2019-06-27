package memento;

import java.util.Stack;

public class TextCareTaker {

    Stack<TextMemento> PastStack;
    Stack<TextMemento> FeutreStack;

    public TextCareTaker() {
        this.PastStack = new Stack<>();
        this.FeutreStack = new Stack<>();
    }

    public void AddMomento(TextMemento textMemento) {
        this.PastStack.add(textMemento);
        this.FeutreStack.clear();
    }

    public  TextMemento undo(TextMemento currentMomento) {
        this.FeutreStack.add(currentMomento);
        return PastStack.pop();
    }

    public  TextMemento redo(TextMemento currentMomento) {
        if(FeutreStack.isEmpty()) {
            return currentMomento;
        } else {
            PastStack.push(currentMomento);
            return FeutreStack.pop();
        }
    }
}
