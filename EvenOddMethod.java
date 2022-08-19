import java.util.Scanner;

public class EvenOddMethod {
    public static void main(String[] args) {
        System.out.println("Enter a number to check it is Odd or Even :");
        Scanner in = new Scanner(System.in) ;
        int no = in.nextInt() ;
        evenodd( no) ;
    }
    static void evenodd( int num) {
        if ( num % 2 == 0 ) System.out.println("It is a even number ");
        else System.out.println(" It is a odd number");
    }
}
