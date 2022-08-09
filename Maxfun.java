import java.util.Scanner;

public class Maxfun {
    public static void main(String[] args) {
        System.out.print("Enter  number's : ");
        Scanner in = new Scanner(System.in) ;
        // Taking input from User
        int a = in.nextInt() ;
        int b = in.nextInt() ;
        //The Java.lang.math.max() function is an inbuilt function in Java which returns
        // maximum of two numbers.
        int max = Math.max(a , b) ; //using max function
        System.out.println("Max Number is :" + max);
    }
}


