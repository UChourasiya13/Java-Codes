import java.util.Scanner;
import java.lang.Math ;

public class Power {
    public static void main(String[] args) {
        System.out.print("Enter a number to find power of that number :");
        Scanner in = new Scanner(System.in) ;
        double num = in.nextInt();
        double pow =  Math.pow( num , 2) ;
        System.out.println("Power of a number is :" + pow);

    }
}
