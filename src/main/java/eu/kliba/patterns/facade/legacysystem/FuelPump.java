package eu.kliba.patterns.facade.legacysystem;

public class FuelPump extends FuelInjector{

    public FuelPump(String fuelPump) {
        super(fuelPump);
    }

    public void pump() {
        System.out.println("Fuel pump is pumping.");
    }
}
