package Ex3;

public class ProxyCar {
    Car car;

    public ProxyCar(Car car) {
        this.car = car;
    }

    public void showFeul() {
        this.car.showFeul();
    }

    public void showLocation() {
        this.car.showLocation();
    }
}
