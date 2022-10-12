package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
    int[] array = new int[10];
    int sum = 0;
    System.out.println("Enter 10 numbers: ");

    Scanner scanner = new Scanner(System.in);

    for(int i = 0; i < 10; i++){
        array[i] = scanner.nextInt();
    }

    for(int i=0; i< array.length;i++  ){
      sum += array[i];
    }
    System.out.println("Sum of the 10 numbers is: " + sum);
    }


}