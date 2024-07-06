package LAB10;

public class FlashLight {
    private Battery[] batteries;

    public FlashLight(Battery[] batteries) {
        this.batteries = batteries;
    }

    public double getTotalPower() {
        double totalPower = 0;
        for (Battery battery : batteries) {
            totalPower += battery.getPower();
        }
        return totalPower;
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (Battery battery : batteries) {
            if (battery instanceof ToshibaBattery) {
                totalEnergy += ((ToshibaBattery) battery).getEnergy();
            } else if (battery instanceof DuracellBattery) {
                totalEnergy += ((DuracellBattery) battery).getEnergy();
            }
        }
        return totalEnergy;
    }

    public double getTotalLifeTime() {
        return getTotalEnergy() / getTotalPower();
    }
}

