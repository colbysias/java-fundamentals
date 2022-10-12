package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word: ");
        String word = scanner.next();

        String vowels = "aeiouAEIOU";
        int num = 0;

        while (num <= word.length()) {
           char letter = word.charAt(num);
            if (vowels.contains(String.valueOf(letter))) {
                System.out.println("The Word is: " + word);
                System.out.println("The first vowel is: " + word.charAt(num));
                break;
            } else {
                num++;
            }


        }
    }
}
