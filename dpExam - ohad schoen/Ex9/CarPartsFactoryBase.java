package Ex9;

import javafx.scene.effect.Light;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class CarPartsFactoryBase {
    protected CarFrame createFrame() {
        return new CarFrame();
    }

    protected Wheels createWheels() {
        return new Wheels();
    }

    protected Seats createSeats() {
        return new Seats();
    }

    protected abstract CoolingSystem createCoolingSystem();

    protected abstract LightSystem createLightSystem();

    protected abstract Motor createMotor();

    protected abstract Battery createBattery();

    public List<CarPart> createCarParts() {
        List<CarPart> parts = new ArrayList<>();

        parts.add(createFrame());
        parts.add(createWheels());
        parts.add(createSeats());
        parts.add(createCoolingSystem());
        parts.add(createLightSystem());
        parts.add(createMotor());
        parts.add(createBattery());

        return parts;
    }

}
