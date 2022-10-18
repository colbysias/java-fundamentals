package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Heirarchy {

}


     class Computer{
        String model;
        int year;

         public Computer(String model, int year) {
             this.model = model;
             this.year = year;
         }
     }

     class Motherboard extends Computer{

        Motherboard(String model, int year) {
            super(model, year);
        }
        }

     class Processor extends Motherboard{

         Processor(String model, int year) {
             super(model, year);
         }
     }

