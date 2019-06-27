package Ex10;

public abstract class WindowDecorator implements IWindow {
    protected IWindow iWindow;

    public WindowDecorator(IWindow iWindow) {
        this.iWindow = iWindow;
    }
}
