package eu.kliba.patterns.facade.legacysystem;

public class Radiator extends CoolingController{

    public void on() {
        System.out.println("Radiator turned on.");
    }

    public void off() {
        System.out.println("Radiator turned off.");
    }

    public void setSpeed() {
        System.out.println("Radiator speed is set.");
    }
}
