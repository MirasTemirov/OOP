package LAB10;

public class DuracellBattery extends Battery {
    private double voltage;
    private double currency;
    private double energy;
    private double internalVoltage;

    public DuracellBattery(double voltage, double currency, double energy, double internalVoltage) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.internalVoltage = internalVoltage;
    }

    @Override
    public double getPower() {
        return voltage * currency;
    }

    @Override
    public double getLifeTime() {
        return energy / getPower();
    }

    public double getEnergy() {
        return energy;
    }
}
