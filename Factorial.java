import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number for Factorial :");
        Scanner in = new Scanner(System.in) ;
        int num = in.nextInt();
        int fact = 1 ;

        for (int i = 1 ; i<= num ; i++){
            fact = fact * i ;
        }
        System.out.println(" Factorial of a number is :" + fact);
    }
}
