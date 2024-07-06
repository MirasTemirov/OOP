package LAB10;

public class Main {
    public static void main(String[] args) {
        ToshibaBattery[] toshibaBatteries = {
                new ToshibaBattery(2.5, 2.0, 2000, 500),
                new ToshibaBattery(15.5, 2.1, 2100, 600),
                new ToshibaBattery(9.5, 2.2, 2200, 700),
                new ToshibaBattery(3.5, 2.3, 2300, 800),
                new ToshibaBattery(20.5, 2.4, 5000, 900)
        };

        DuracellBattery[] duracellBatteries = {
                new DuracellBattery(2.0, 2.0, 2100, 0.2),
                new DuracellBattery(2.5, 2.1, 2200, 0.3),
                new DuracellBattery(3.0, 2.2, 2300, 0.4),
                new DuracellBattery(3.5, 2.3, 2400, 0.5),
                new DuracellBattery(4.0, 2.4, 2500, 0.6)
        };


        FlashLight[] flashLights = {
                new FlashLight(new Battery[]{toshibaBatteries[0], duracellBatteries[0]}),
                new FlashLight(new Battery[]{toshibaBatteries[1], duracellBatteries[1]}),
                new FlashLight(new Battery[]{toshibaBatteries[2], duracellBatteries[2]}),
                new FlashLight(new Battery[]{toshibaBatteries[3], duracellBatteries[3]}),
                new FlashLight(new Battery[]{toshibaBatteries[4], duracellBatteries[4]})
        };

        for (FlashLight flashLight : flashLights) {
            System.out.println("FlashLight lifetime: " + flashLight.getTotalLifeTime() + " seconds");
        }

        double maxLifetime = 0;
        FlashLight maxLifetimeFlashLight = null;
        for (FlashLight flashLight : flashLights) {
            if (flashLight.getTotalLifeTime() > maxLifetime) {
                maxLifetime = flashLight.getTotalLifeTime();
                maxLifetimeFlashLight = flashLight;
            }
        }

        System.out.println("FlashLight with max lifetime: " + maxLifetimeFlashLight.getTotalLifeTime() + " seconds");
    }
}
