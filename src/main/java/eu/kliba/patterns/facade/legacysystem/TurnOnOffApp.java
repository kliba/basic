package eu.kliba.patterns.facade.legacysystem;

import eu.kliba.patterns.facade.CarEnginFacade;

public class TurnOnOffApp {

    public static void main(String[] args) {
        CarEnginFacade carEnginFacade = new CarEnginFacade();

        //start engine
        carEnginFacade.startEngine();

        //stop engine
        carEnginFacade.stopEngine();
    }
}
