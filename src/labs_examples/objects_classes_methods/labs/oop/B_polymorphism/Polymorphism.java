package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Polymorphism implements ComputerInterface{
    public static void main(String[] args) {
        Polymorphism poly = new Polymorphism();
        poly.overload();
        System.out.println(poly.overload("this is a string"));
        System.out.println(poly.overload(12));

        override ride = new override();
        child child1 = new child();

        ride.run();
        child1.run();

        Polymorphism computer = new Polymorphism();
                computer.start();
                computer.increaseRPM(20);
    }

    @Override
    public boolean start() {
        System.out.println("Starting Computer");
        return true;
    }

    @Override
    public void stop() {
        System.out.println("Stopping Computer");
    }

    @Override
    public void increaseRPM(int rpm) {
        System.out.println("Increasing RPM");
    }

    @Override
    public void decreaseRPM(int rpm) {
        System.out.println("Decreasing RPM");
    }

    public void overload(){
        System.out.println("Default overload method");
    }

    public String overload(String a){
        return a;
    }

    public int overload(int a){
        a++;
        return a;
    }


}

class override{
    void run(){
        System.out.println("Parent class");
    }
}

class child extends override{
    void run(){
        System.out.println("Child Class");
    }
}




