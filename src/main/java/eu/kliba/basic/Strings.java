package eu.kliba.basic;

public class Strings {

    public void allMethodFromStringsClass() {
        splitWithSpace("isthereanyspace?");
        bannTabuChar('y',"yellow");
        everySecondChar("hello");
        printBackwards("abcdefgh");

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

    private static void spitASentence(String sentence) {
    }
}
