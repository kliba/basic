package eu.kliba.basic;

public class SimpleCycle {

    public void invokeAllSimpleCycleMethods() {
        printAllPositiveIntegersUntil(13);
        printDividersOf(20);
        printSumOfDividersOf(20);
        isPerfectNumber(7);

    }

    /**
     * This method prints all of the Integer numbers what are bigger than 0 and smaller or equal of the
     * parameters.
     * @param lastInteger last number what is going to be printed out.
     */
    private static void printAllPositiveIntegersUntil(Integer lastInteger) {
        String container = "";
        if (lastInteger <= 0) {
            System.out.println("This method handles only the positive numbers.");
        } else {
            for (int i = 1; i <= lastInteger; i++) {
                container += i + " ";
            }
        }
        System.out.println(container);
    }

    /**
     * Prints every divider of the input value. This method handles only the positive numbers.
     * @param dividend the Integer number whats dividers will be displayed.
     */
    private static void printDividersOf(Integer dividend) {
        String dividers = "";

        if (dividend <= 0) {
            System.out.println("This method handles only the positive numbers.");
        } else {
            for (int i = 1; i <= dividend; i++) {
                if (dividend % i == 0) {
                    dividers += i + " ";
                }
            }
            System.out.println("The dividers of the " + dividend + " are " + dividers);
        }
    }

    /**
     * Calculates the dividers and the input Integer then summarize them.
     * This method handles only the positive numbers.
     * @param dividend Integer parameter.
     */
    private static void printSumOfDividersOf(Integer dividend) {
        Integer dividersSum = 0;

        if (dividend <= 0) {
            System.out.println("This method handles only the positive numbers.");
        } else {
            for (int i = 1; i <= dividend; i++) {
                if (dividend % i == 0) {
                    dividersSum += i;
                }
            }
            System.out.println("The SUM of dividers of the " + dividend + " is " + dividersSum);
        }
    }

    private static void isPerfectNumber(Integer number) {
        String dividers = "";
        Integer calcuation = 0;

        if (number <= 0) {
            System.out.println("This method handles only the positive numbers.");
        } else {
            for (int i = 1; i <= (number / 2); i++) {
                if (number % i == 0) {
                    dividers += i + " ";
                    calcuation += i;
                }
            }
        }
        if (calcuation == number) {
            System.out.println("The number of " + number + " is a perfect number because the sum of the dividers("
            + dividers + ") are equal to " + number + ".");
        }else {
            System.out.println("The number of " + number + " is NOT a perfect number because the sum of the dividers("
                    + dividers + ") are NOT equal to " + number + ".");
        }
    }
}
