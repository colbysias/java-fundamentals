package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter a 2nd number: ");
        int secondInt = scanner.nextInt();
        int sum = 0;
        double average = (firstInt + secondInt) / 2;

        if (firstInt > secondInt){
            int spareInt = secondInt;
            secondInt = firstInt;
            firstInt = spareInt;
        }

        for (int i = firstInt; i <= secondInt; i++){

            sum += i;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }

}
