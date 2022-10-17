package labs_examples.objects_classes_methods.labs.objects;

public class TwoClasses {
    public static void main(String[] args) {
        School school1 = new School("Saginaw", 1999);
        School school2 = new School();
        School school3 = new School("Boswell");

        System.out.println(school1.name);
        System.out.println(school2.name);
        System.out.println(school3.name);
    }
}

class School{
    String name;
    int yearBuilt;

    public School(String name, int yearBuilt){
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    public School(){
        name = "Chisolm";
        yearBuilt = 2000;
    }

    public School(String name){
        this.name = "EMSISD";
    }
}
