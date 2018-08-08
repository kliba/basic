package eu.kliba.basic;

public class Strings {

    public void allMethodFromStringsClass() {
        splitWithSpace("isthereanyspace?");
        bannTabuChar('y',"yellow");
        everySecondChar("hello");
        printBackwards("abcdefgh");
        spitASentence("Here we go.");
        displayBackwardsCapital("capital back");
        spitToWorldsWithCapitalFirstChar("There you go.");

    }

    /**
     * Put a space character to after every char of string.
     * @param world parameter as a String
     */
    private static void splitWithSpace(String world) {
        String printing = "";

        for (int i = 0; i < world.length(); i++) {
            printing += world.charAt(i) + " ";
        }
        System.out.println(world + " = " + printing);
    }

    /**
     * Prints the input world without the tabu character.
     * @param tabuCharacter char what is replaced from the input world
     * @param world input world as a String
     */
    private static void bannTabuChar(char tabuCharacter, String world) {
        String printing = "";
        for (int i = 0; i < world.length(); i++) {
            if (world.charAt(i) != tabuCharacter) {
                printing += world.charAt(i);
            }
        }
        System.out.println("The " + world + " without " + tabuCharacter + " is " + printing);
    }

    /**
     * Print every second character of the input String.
     * @param world String as a parameter.
     */
    private static void everySecondChar(String world) {
        for (int i = 0; i < world.length(); i++) {
            if (i % 2 == 1) {
                System.out.println(world.charAt(i));
            }
        }

    }

    /**
     * print the input wold in backwards
     * @param world String as an input
     */
    private static void printBackwards(String world) {
        String backwards = "";

        for (int i = (world.length() - 1); i >=0; i--) {
            backwards += world.charAt(i);
        }
        System.out.println(world + " backwards is " + backwards);
    }

    /**
     * Input sentence is going to be spitted at every world if those are separated by space character.
     * Then print them in a new line.
     * @param sentence Sentence as a String what should be spitted.
     */
    private static void spitASentence(String sentence) {
        String[] strings = sentence.split(" ");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    /**
     * Read an input String what will be printed in backwards. Furthermore it is going to be capital letter.
     * @param world Parameter as a String.
     */
    private static void displayBackwardsCapital(String world) {
        String printing = "";
        for (int i = world.length() - 1; i >= 0; i--) {
            printing += world.charAt(i);
        }
        System.out.println(printing.toUpperCase());
    }

    /**
     * The input sentence will be spitted by space characters and print them with first capital letter
     * in a new lines.
     * @param sentence Sentence what should be spitted. It is a string.
     */
    private static void spitToWorldsWithCapitalFirstChar(String sentence) {
        String[] strings = sentence.split(" ");

        for (String s : strings) {
            //find first character of the param
            String firstCharacter = s.charAt(0) + "";
            // firstCharacter variable assigns to myCharCapital to uppercase and stores that as a String
            String myCharCapital = ("" + firstCharacter).toUpperCase();
            //print out wolds replacing the first letter to uppercase
            System.out.println(myCharCapital + s.substring(1, s.length()));
        }
    }

}
