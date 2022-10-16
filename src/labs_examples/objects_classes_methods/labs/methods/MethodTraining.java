package labs_examples.objects_classes_methods.labs.methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class MethodTraining {
    public static void main(String[] args) {
        int num = 10;
        int[] intArray = {4, 90, 34, 76, 1};
        //Pass by Value
        myMethod(num);
        System.out.println(num);

        int largestNum = largest(1, 6, 3, 20);
        System.out.println("The largest number is: " + largestNum);

        System.out.println(consonants("This is a sentence"));
        System.out.println(isPrime(27));

        int[] numArray = smallArray(intArray);
        System.out.println(Arrays.toString(numArray));


        ArrayList list = threeMethods(100, 1, 2);
        System.out.println(threeMethods(100, 1, 2));
        System.out.println("The ArrayList has " + list.size() + " numbers in it.");

        System.out.println(Arrays.toString(reverseArray(intArray)));
    }

    public static int myMethod(int a) {
        return a;
    }

    public static double myMethod(double a) {
        return a;
    }

    public static void PassByReference() {

    }

    public static int largest(int a, int b, int c, int d) {
        int largestNum = 0;
        if (a > largestNum) {
            largestNum = a;
        }
        if (b > largestNum) {
            largestNum = b;
        }
        if (c > largestNum) {
            largestNum = c;
        }
        if (d > largestNum) {
            largestNum = d;
        }
        return largestNum;
    }

    public static boolean isVowel(char t) {
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
                t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
    }

    public static boolean isSpace(char x) {
        return x == ' ';
    }

    public static String consonants(String sentence) {

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (!isVowel(sentence.charAt(i)) && !isSpace(sentence.charAt(i))) {
                count++;
            }
        }
        return "There are " + count + " consonants in the string: " + sentence;
    }

    public static boolean isPrime(int num) {

        if (num == 0 || num == 1) {
            return false;
        }
        if (num % 2 == 1) {
            return true;
        }
        return false;
    }

    public static int[] smallArray(int[] arr) {
        int smallestNumber = arr[0];
        int largestNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] < smallestNumber) {
                smallestNumber = arr[i];
            }
            System.out.println(smallestNumber);
        }
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] > largestNumber) {
                largestNumber = arr[j];
            }
            System.out.println(largestNumber);
        }
        int num[] = {smallestNumber, largestNumber};
        return (num);
    }

    public static ArrayList<Integer> threeMethods(int maxNum, int divisor1, int divisor2) {
        ArrayList list = new ArrayList<>();
        for (int i = 0; i <= maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static int[] reverseArray(int[] arr) {

        int temp;

        for (int i = 0; i < arr.length / 2; i++) {

            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        return arr;

    }
}



