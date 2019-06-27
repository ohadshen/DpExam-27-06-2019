package Ex10;

public class ShadowEffect extends WindowDecorator {
    public ShadowEffect(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public void operateWindow() {
        System.out.println("window is darker now");
        iWindow.operateWindow();
    }
}
