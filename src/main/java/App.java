import eu.kliba.basic.Basic;
import eu.kliba.basic.EmbedCycle;
import eu.kliba.basic.SimpleCycle;
import eu.kliba.basic.Strings;

public class App {
    public static void main(String[] args) {

        Basic basicInstance = new Basic();
//        basicInstance.invokeAllBasicMethods();

        SimpleCycle simpleCycleInstance = new SimpleCycle();
        simpleCycleInstance.invokeAllSimpleCycleMethods();

        Strings myStrings = new Strings();
//        myStrings.allMethodFromStringsClass();

        EmbedCycle myEmbedCycle = new EmbedCycle();
//        myEmbedCycle.allMethodFromEmbedCycle();
    }
}
