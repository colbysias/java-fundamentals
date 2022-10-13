class Main {
    public static void main(String[] args) {
        // please create the varargs method as instructed below
        // then, please call the varargs method at least 3 // times here with a different number of arguments
        myMethod("Hello", "World");
        myMethod("This", "is", "Another");
        myMethod("One");

    }

    // please write a varargs method of your choice that
    // prints out the length of the array of arguments
    // passed into the method below
    public static void myMethod(String... v) {
        for (String word : v) {
            System.out.println(word);
        }

    }
}