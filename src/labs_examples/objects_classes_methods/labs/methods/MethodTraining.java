package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    public static void main(String[] args) {
    int num = 10;
    //Pass by Value
        myMethod(num);
        System.out.println(num);

        int largestNum = largest(1, 6, 3, 20);
        System.out.println("The largest number is: " + largestNum);

        System.out.println(consonants("This is a sentence"));
        System.out.println(isPrime(27));
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

    public static boolean isVowel(char t){
        return t == 'a' || t=='e' || t=='i' || t=='o' || t=='u'||
                t == 'A' || t=='E' || t=='I' || t=='O' || t=='U';
    }
    public static boolean isSpace(char x){
        return x == ' ';
    }
    public static String consonants(String sentence){

        int count = 0;

        for(int i = 0; i < sentence.length(); i++){

            if (!isVowel(sentence.charAt(i)) && !isSpace(sentence.charAt(i))) {
                count++;
            }
        }
        return "There are " + count + " consonants in the string: " + sentence;
    }

    public static boolean isPrime(int num){

        if(num == 0 || num == 1){
            return false;
        }
        if(num % 2 == 1){
            return true;
        }
        return false;
    }

    public static int smallArray(int[] arr){

        for(int i = 0; i< arr.length; i++) {
            int smallestNumber = arr[0];
            if (arr[i] < smallestNumber) {
                smallestNumber = arr[i];
            }

        }
        for(int j = 0; j  < arr.length; i++){
            int largestNumber = arr[0];
            if(arr[j] > largestNumber){
                largestNumber = arr[j];
            }
        }
        return [smallestNumber, largestNumber];
        }
    }

