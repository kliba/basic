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
        displayAverageOf(4, 5);
        calculatePitagoras(3, 4);
        calculateFaceAndVolumetricOfABrick(2, 3, 4);
        calculateCircuitAndCircumferenceOfACycle(8);

    }

    /**
     * sayHelloWorld prints the 'Hello world!'
     */
    private static void sayHelloWorld() {
        System.out.println("Hello world!");
    }

    /**
     * sayHelloSomeone concatenates the "Hello" to the parameter ans prints it out.
     *
     * @param userName is the input parameter. String type.
     */
    private static void sayHelloSomeone(String userName) {
        System.out.println("Hello " + userName + "!");
    }

    /**
     * printDoubleOf doubles the input parameter and prints it out.
     *
     * @param number is the input parameter. Integer type.
     */
    private static void printDoubleOf(Integer number) {
        System.out.println("2 times to " + number + ": " + (number * 2));
    }

    /**
     * print4BasicMathCalculation calculates the four basic math operations (+, -, *, /)
     *
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
     *
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
     *
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

    /**
     * This method prints the average value of the 2 input numbers
     *
     * @param a first input value as an Integer
     * @param b second input value as an Integer
     */
    private static void displayAverageOf(Integer a, Integer b) {
        Float average;
        average = (a.floatValue() + b.floatValue()) / 2;
        System.out.println("The " + a + " and " + b + " average value is " + average);
    }

    /**
     * Based on the Pitagoras theory calculates then displays the sweeping of a triangle.
     * It is only use able if the triangle is to square.
     *
     * @param leg1 first leg ot the square-angle.
     * @param leg2 second leg ot the square-angle.
     */
    private static void calculatePitagoras(Integer leg1, Integer leg2) {
        //a^ + b^ = c^
        Float sweeping;
        sweeping = (leg1.floatValue() * leg1.floatValue()) + (leg2.floatValue() * leg2.floatValue());
        System.out.println("The triangle where one leg is " + leg1 + " and the other is "
                + leg2 + " the sweeping is " + sweeping);
    }

    /**
     * Calculates the Face and Volumetric value of a brick then prints them out.
     * Result unit is not decided.
     *
     * @param height height of the brick.
     * @param width  width of the brick.
     * @param depth  depth of the brick.
     */
    private static void calculateFaceAndVolumetricOfABrick(Integer height, Integer width, Integer depth) {
        Float face; // A=2(ab+bc+ac)
        Float volumetric; // V=abc

        face = 2 * ((height.floatValue() * width.floatValue()) + (height.floatValue() * depth.floatValue()) +
                (width.floatValue() * depth.floatValue()));

        volumetric = height.floatValue() * width.floatValue() * depth.floatValue();

        System.out.println("There is a brick where the height is " + height + " the width is " +
                width + " and the depth is " + depth + ".");
        System.out.println("The face: " + face + " unit^2");
        System.out.println("The volumetric: " + volumetric + " unit^3");
    }

    /**
     * Calculates the circuit and circumference of a circle.
     *
     * @param radius Radius of the relevant circle.
     */
    private static void calculateCircuitAndCircumferenceOfACycle(Integer radius) {
        //Circuit K=2r*pi
        //Circumference T=r^2 * pi
        Double circuit;
        Double circumference;

        circuit = 2 * radius * Math.PI;
        circumference = (radius * radius) * Math.PI;

        System.out.println("A circle where the radius is " + radius + ".");
        System.out.println("The circuit: " + circuit);
        System.out.println("The circumference: " + circumference);

    }
}
