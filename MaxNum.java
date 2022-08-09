import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        System.out.print("Enter Three number : ");
        Scanner in = new Scanner(System.in) ;
        // Taking input from User
        int a = in.nextInt() ;
        int b = in.nextInt() ;
        int c = in.nextInt() ;

        int max ; //for maximum number
        max = a ;//initializing  maximum number

        if ( b > max){
            max = b ;
        }
        if ( c > max){
            max = c ;
        }
        System.out.println("Max Number is :" + max);
    }
}
