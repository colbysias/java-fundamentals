package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        multiply(2,2);
        divide(2,2);
        joke("That's a joke, Ha Ha real funny");
        yearConversion(2);
        varargs("This","is","a sentence");
    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    public static int multiply(int a, int b){
        System.out.println(a * b);
        return a * b;

    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    public static int divide(int a, int b){
        System.out.println(a /b);
        return a / b;
    }

    // 3) Create a static void method that will print of joke of your choice to the console
public static void joke(String sentence){
        System.out.println(sentence);
}

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static int yearConversion(int years){
        System.out.println(years * 31536000);
        return years * 31536000;
    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
public static String varargs(String... values){
        System.out.println(Integer.toString(values.length));
        return Integer.toString(values.length);
}





}
