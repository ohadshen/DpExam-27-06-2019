package Ex9;

public class HybridCarPartsFactory extends CarPartsFactoryBase {
    @Override
    protected CoolingSystem createCoolingSystem() {
        return new HybridCoolingSystem();
    }

    @Override
    protected LightSystem createLightSystem() {
        return new HybridLightSystem();
    }

    @Override
    protected Motor createMotor() {
        return new HybridMotor();
    }

    @Override
    protected Battery createBattery() {
        return new HybridBattery();
    }
}
