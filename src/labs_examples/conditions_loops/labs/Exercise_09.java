package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {
    public static void main(String[] args) {
        int num = 0;

        while( num <= 100){
            if(num == 50){
                break;
            }
            num++;
        }
    }
}
