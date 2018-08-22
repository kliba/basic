package eu.kliba.patterns.facade.legacysystem;

public class AirFlowController extends AirFlowMeter{

    String airFlowMeter;

    public void takeAir() {
        System.out.println("Air is provided. Breath deep...");
    }

    public void off() {
        System.out.println("Air flow controller turned off.");
    }
}
