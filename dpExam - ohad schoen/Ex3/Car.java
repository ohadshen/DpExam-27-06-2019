package Ex3;

public class Car {
    private int speed;

    public Car() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void startDrive() {
        System.out.println("you are driving");
    }

    public void finishDrive() {
        System.out.println("you have finished driving");
    }

    public void speedUp(int speedToIncrease) {
        speed += speedToIncrease;
        System.out.println("Crazy, your speed is " + speed + " kmh");
    }

    public void turnRight() {
        System.out.println("you have turned right");
    }

    public void turnLeft() {
        System.out.println("you have turned left");
    }

    public void showFeul() {
        System.out.println("your fuel are: " + Math.random() * 250 + " liters");
    }

    public void showLocation() {
        System.out.println("your coordinates are: " + Math.random() * 1000 + " , " + Math.random() * 1000);
    }


}
