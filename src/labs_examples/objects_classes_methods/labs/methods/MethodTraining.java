package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    public static void main(String[] args) {
    int num = 10;
    //Pass by Value
        myMethod(num);
        System.out.println(num);

        int largestNum = largest(1, 6, 3, 20);
        System.out.println("The largest number is: " + largestNum);
    }

    public static int myMethod(int a){
        return a;
    }
    public static double myMethod(double a){
        return a;
    }
    public static void PassByReference(){

    }

    public static int largest(int a, int b, int c, int d){
        int largestNum = 0;
        if(a > largestNum){
            largestNum = a;
        }
        if(b > largestNum){
            largestNum = b;
        }
        if(c > largestNum){
            largestNum = c;
        }
        if(d > largestNum){
            largestNum = d;
        }
        return largestNum;
    }

   // public static String consonants(String sentence){

    //}
}
