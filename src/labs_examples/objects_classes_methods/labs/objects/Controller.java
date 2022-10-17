package labs_examples.objects_classes_methods.labs.objects;

public class Controller {

    public static void main(String[] args) {
        Person person1 = new Person("Colby", 30);
        Computer computer1 = new Computer("Black", "GTX970");

        System.out.println(person1.name + " is " + person1.age + " years old and has a " +  computer1.color + " computer with a " +
                computer1.graphicsCard  + " graphics card");
    }
}

class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}

class Computer{
    String color;
    String graphicsCard;

    public Computer(String color, String graphicsCard){
        this.color = color;
        this.graphicsCard = graphicsCard;
    }
}
