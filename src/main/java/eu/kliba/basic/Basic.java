package eu.kliba.basic;

public class Basic {

    /**
     * invokeAllBasicMethods calls all of the methods what are implemented in the Basic class.
     */
    public void invokeAllBasicMethods() {
        sayHelloWorld();
        sayHelloSomeone("user");
        printDoubleOf(18);
        print4BasicMathCalculation(4, 2);
        printBiggerNumber(980, 1024);
        isItValidTriangle(10, 4, 2);

    }

    /**
     * sayHelloWorld prints the 'Hello world!'
     */
    private static void sayHelloWorld() {
        System.out.println("Hello world!");
    }

    /**
     * sayHelloSomeone concatenates the "Hello" to the parameter ans prints it out.
     * @param userName is the input parameter. String type.
     */
    private static void sayHelloSomeone(String userName) {
        System.out.println("Hello " + userName + "!");
    }

    /**
     * printDoubleOf doubles the input parameter and prints it out.
     * @param number is the input parameter. Integer type.
     */
    private static void printDoubleOf(Integer number) {
        System.out.println("2 times to " + number + ": " + (number * 2));
    }

    /**
     * print4BasicMathCalculation calculates the four basic math operations (+, -, *, /)
     * @param number1 first Integer parameter
     * @param number2 second Integer parameter
     */
    private static void print4BasicMathCalculation(Integer number1, Integer number2) {
        //+
        System.out.println("+: " + (number1 + number2));

        //-
        System.out.println("-: " + (number1 - number2));

        //*
        System.out.println("*: " + (number1 * number2));

        //  /
        if (number1 % number2 != 0) {
            System.out.println("Integer cannot display float numbers.");
        } else {
            System.out.println("/: " + (number1 / number2));
        }
    }

    /**
     * printBiggerNumber select the bigger number from the 2 params and print prints that out
     * @param number1 first Integer parameter
     * @param number2 second Integer parameter
     */
    private static void printBiggerNumber(Integer number1, Integer number2) {
        if (number1 < number2) {
            System.out.println("Bigger number is " + number2);
        } else if (number1 > number2) {
            System.out.println("Bugger number is " + number1);
        } else {
            System.out.println("The " + number1 + "and " + number2 + "are the same.");
        }
    }

    /**
     * isItValidTriangle based on the 3 params calculates if it can be a valid triangle.
     * Than prints the result out.
     * @param a a side of a triangle as an Integer.
     * @param b b side of a triangle as an Integer.
     * @param c c side of a triangle as an Integer.
     */
    private static void isItValidTriangle(Integer a, Integer b, Integer c) {
        if (a > (b + c) | b > (a + c) | c > (a + b)) {
            System.out.println("This can not be a valid triangle because the 2 legs " +
                    "are not longer than the sweeping");
        } else {
            System.out.println("Yes, it can be a valid triangle.");
        }
    }

}
