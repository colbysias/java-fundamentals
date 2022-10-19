package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Heirarchy {
    public static void main(String[] args) {


        Motherboard motherboard = new Motherboard("Asus", 2015);
        Processor processor = new Processor("Intel", 2016);

        motherboard.turnOn();

        int thisInt = processor.yearsOut(2016);
        System.out.println("This processor has been out " + thisInt + " years"  );


    }

}
     class Computer{
        String model;

        int year;

         public Computer(String model, int year) {
             this.model = model;
             this.year = year;
         }

         public void turnOn(){
             System.out.println("Turn on Computer");
         }

         public int yearsOut(int year){
             return 2021 - year;
         }
     }

     class Motherboard extends Computer{

        Motherboard(String model, int year) {
            super(model, year);
        }

        public void turnOn(){
            System.out.println("Turn on Motherboard");
        }
        }

     class Processor extends Motherboard{

         Processor(String model, int year) {

             super(model, year);
         }

         public void turnOn(){
             System.out.println("Turn on Processor");
         }

         public int yearsOut(int year){
             return 2021- year;
         }
     }

