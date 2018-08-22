package eu.kliba.patterns.facade.legacysystem;

public class CoolingController {

    String radiator;
    String temperatureSensor;


    public void setTemperatureUpperLimit(int maxTemperature){
        System.out.println("Max temperature is " + maxTemperature);
    }

    public void run() {
        System.out.println("Cooling controller is running.");
    }

    public void cool(int maxAllowedTemp) {
        System.out.println("Cooling controller is cooling to " + maxAllowedTemp);
    }

    public void stop() {
        System.out.println("Cooling controller is stopped.");
    }
}
