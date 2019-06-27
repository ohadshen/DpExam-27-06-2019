package Ex10;

public class ThreeDimantionsEffect extends WindowDecorator {
    public ThreeDimantionsEffect(IWindow iWindow) {
        super(iWindow);
    }

    @Override
    public void operateWindow() {
        System.out.println("3d effect");
        iWindow.operateWindow();
    }
}
