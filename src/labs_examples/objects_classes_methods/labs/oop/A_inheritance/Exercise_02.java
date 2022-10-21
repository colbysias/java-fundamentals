package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

/**
 * Run the class below and study the output. What prints and why?
 *
 * Your answer:
 * The int 10 is Printed because in the main method you are creating a new variable "a" from class A,
 * even though you're extending it from B. So whenever you print out that variable "i" from the class it prints it from class A
 * since that is the initial class we are creating the object from.
 */
class A {
    int i = 10;
}

class B extends A{
    int i = 20;
}

public class Exercise_02 {

    public static void main(String[] args) {
        A a = new B();

        System.out.println(a.i);
    }
}