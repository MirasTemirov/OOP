package LAB10;

public class ToshibaBattery extends Battery {
    private double voltage;
    private double currency;
    private double energy;
    private double extraEnergy;

    public ToshibaBattery(double voltage, double currency, double energy, double extraEnergy) {
        this.voltage = voltage;
        this.currency = currency;
        this.energy = energy;
        this.extraEnergy = extraEnergy;
    }

    @Override
    public double getPower() {
        return voltage * currency;
    }

    @Override
    public double getLifeTime() {
        return (energy + extraEnergy) / getPower();
    }

    public double getEnergy() {
        return energy + extraEnergy;
    }
}
