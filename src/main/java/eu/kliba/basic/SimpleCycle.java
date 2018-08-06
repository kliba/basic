package eu.kliba.basic;

public class SimpleCycle {

    public void invokeAllSimpleCycleMethods() {
        printAllPositiveIntegersUntil(13);
        printDividersOf(20);
        printSumOfDividersOf(20);
        isPerfectNumber(7);
        getPowerValueOf(2,3);
        isPositiveNumber(11);
        divideByTwoUntilPossible(12);
        isPrime(2);

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

    /**
     * Prints if the input number is perfect number or not. Perfect number is when
     * the sum of the dividers are equal to the input number multiple to 2.
     * eg.:(6; because 2*6 = 1 + 2 + 3 + 6)
     * @param number that number what we would like to know if that is a perfect number or not. As an Integer.
     */
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

    /**
     * Calculates the power of the two input parameters. It only works if we do not use negative parameters.
     * @param base base of the power
     * @param exhibitor exhibitor of the power
     */
    private static void getPowerValueOf(Integer base, Integer exhibitor) {
        Integer result = base;
        if (exhibitor == 0) {
            result = 1;
        }else if (exhibitor == 1) {
            result = base;
        }else {
            for (int i = 1; i < exhibitor; i++) {
                result = result * base;
            }
        }
        System.out.println("result of " + base + " on " + exhibitor + " is equal to " + result);
    }

    /**
     * If the input number is not positive it provides an Runtime exception on the other hand writes the number out.
     * @param number Integer input parameter.
     * @throws RuntimeException is if the number is smaller than 1.
     */
    private static void isPositiveNumber(Integer number) throws RuntimeException {
        if (number < 1) {
            throw new RuntimeException();
        }else {
            System.out.println("Number " + number + " is positive one.");
        }
    }

    /**
     * Divides the input number by 2 until it is the result is odd number. Then prints the '2 * ...n * odd number.
     * @param number input Integer.
     */
    private static void divideByTwoUntilPossible(Integer number) {
        int tempNr = number;
        int counter = 0;
        String printer = "Number " + number + " is equal to ";

        if (tempNr % 2 == 0) {
            while (tempNr % 2 == 0) {
                tempNr = tempNr / 2;
                counter++;
            }
        }
        for (int i = 0; i < counter; i++) {
            printer += "2 * ";
        }
        if (tempNr != 0) {
            printer += tempNr;
        }
        System.out.println(printer);
    }

    //should be completed.... next time
    private static boolean isPrime(Integer number) {
        if (number < 2) {
            return true;
        }else if (number % 2 == 0) {
            return true;
        }
        return true;
    }
}
