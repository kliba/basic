package eu.kliba.basic;

public class EmbedCycle {

    public void allMethodFromEmbedCycle() {
        printMultiplicationTableToTen(5);
        printSimpleGraph(8);
        printTriangle(6);

    }

    /**
     * Needs a number and that number multiplication table will be printed from 1 to 10
     * @param multiplicand
     */
    private static void printMultiplicationTableToTen(Integer multiplicand) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + "*" + multiplicand + "=" + (multiplicand * i));
        }
    }

    /**
     * XOXOXOXO VS OXOXOXOX will be printed. If the for cycle counter is even number it uses the "XOXOXOXO"
     * on the other hand the OXOXOXOX is printed out.
     * @param linesNumber It is an Integer where we can define how many lines should be printed.
     */
    private static void printSimpleGraph(Integer linesNumber) {
        for (int i = 0; i < linesNumber; i++) {
            if (i % 2 == 0)
                System.out.println("XOXOXOXO");
            else
                System.out.println("OXOXOXOX");
        }
    }


    /**
     * Prints a triangle uses "*" character.
     * @param triangleSize number of * character at the last line.
     */
    private static void printTriangle(Integer triangleSize) {
        String graphElement = "*";
        String triangleFloor = "";

        for (int i = 0; i < triangleSize; i++) {
            triangleFloor += graphElement;
            System.out.println(triangleFloor);
        }
    }
}
