package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    public static void main(String[] args) {
    int num = 10;
    //Pass by Value
        myMethod(num);
        System.out.println(num);
    }

    public static int myMethod(int a){
        return a;
    }
    public static double myMethod(double a){
        return a;
    }
    public static void PassByReference(){

    }
}
