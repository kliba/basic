package eu.kliba.patterns.facade.legacysystem;

public class FuelInjector {

    String fuelPump;

    public FuelInjector(String fuelPump) {
        this.fuelPump = fuelPump;
    }

    public String getFuelPump() {
        return fuelPump;
    }

    public void on() {
        System.out.println("The " + fuelPump + "turned on.");
    }

    public void inject() {
        System.out.println("The " + fuelPump + "is injected.");
    }

    public void off() {
        System.out.println("The " + fuelPump + "turned off.");
    }
}
