package Ex9;

public class RegularCarPartsFactory extends CarPartsFactoryBase {
    @Override
    protected CoolingSystem createCoolingSystem() {
        return new RegularCoolingSystem();
    }

    @Override
    protected LightSystem createLightSystem() {
        return new RegularLightSystem();
    }

    @Override
    protected Motor createMotor() {
        return new RegularMotor();
    }

    @Override
    protected Battery createBattery() {
        return new RegularBattery();
    }
}
