package Ex10;

public class LightEffect extends WindowDecorator {
    public LightEffect(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public void operateWindow() {
        System.out.println("light the window!");
        this.iWindow.operateWindow();
    }
}
