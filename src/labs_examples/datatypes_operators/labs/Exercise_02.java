package labs_examples.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 *      Answer: Information is lost when you narrow.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // write code here
        int num = 10;
        double num2 = num;

        System.out.println(num2);

        double decimal = 10.5;
        int newNum = (int)decimal;

        System.out.println(newNum);

    }
}
