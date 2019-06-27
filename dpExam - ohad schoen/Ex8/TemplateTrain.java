package Ex8;

public abstract class TemplateTrain {

    protected void changeCloths() {
        System.out.println("change cloths");
    }
    protected void drinkWater() {
        System.out.println("drink water");
    }
    protected abstract void doExersice();
    protected void doShower() {
        System.out.println("omg a shower!!");
    }

    public void run() {
        changeCloths();
        drinkWater();
        doExersice();
        doShower();
    }
}
