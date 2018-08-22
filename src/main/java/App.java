import eu.kliba.basic.Basic;
import eu.kliba.basic.EmbedCycle;
import eu.kliba.basic.SimpleCycle;
import eu.kliba.basic.Strings;
import eu.kliba.filetasks.FileCreation;
import eu.kliba.filetasks.ReadFromAFile;
import eu.kliba.filetasks.WriteIntoFile;

public class App {
    public static void main(String[] args) {
//********************BASIC JAVA**************************************
        Basic basicInstance = new Basic();
//        basicInstance.invokeAllBasicMethods();

        SimpleCycle simpleCycleInstance = new SimpleCycle();
//        simpleCycleInstance.invokeAllSimpleCycleMethods();

        Strings myStrings = new Strings();
//        myStrings.allMethodFromStringsClass();

        EmbedCycle myEmbedCycle = new EmbedCycle();
//        myEmbedCycle.allMethodFromEmbedCycle();

//*****************FILE HANDLING****************************************
        FileCreation myFileCreation = new FileCreation();
//        myFileCreation.createDirectory("/home/kliba/devByMe/projects/src/main/docs");
//        myFileCreation.createFile("/home/kliba/devByMe/projects/src/main/docs", "generated.txt");


        WriteIntoFile myWritter = new WriteIntoFile();
//        myWritter.writeInAFile("/home/kliba/devByMe/projects/src/main/docs/generated.txt", "you can find me in the docs, see you there :)");

        ReadFromAFile myReader = new ReadFromAFile();
//        myReader.readAndPrintFromAFile("/home/kliba/devByMe/projects/src/main/docs/generated.txt");

//****************DESIGN PATTERNS****************************************

    }
}
