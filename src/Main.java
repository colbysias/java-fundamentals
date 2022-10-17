class Main {
    public static void main(String[] args) {

        // please write a custom constructor in the Person class
        // as directed below (in the Person class)

        Person person1 = new Person("Colby", 30);
        Person person2 = new Person("Devin", 26);
        // now use that new constructor to create two unique Person objects

        // now print the instance var values of each object
        System.out.println(person1.name + " " + person1.age);
        System.out.println(person2.name + " " + person2.age);
    }
}

class Person {

    String name;
    int age;
        Person(String name1, int age1){
            name = name1;
            age = age1;
        }
    // please create a fully qualified constructor
    // (which is a constructor that takes in "name" and "age")
    // and set the instance variables above from within the constructor

}