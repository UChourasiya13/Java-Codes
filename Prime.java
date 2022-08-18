import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter a number to check whether it is prime or not ");
        Scanner in = new Scanner(System.in) ;
        int num = in.nextInt();
        int i ;
        for ( i = 2; i<=num-1 ; i++){
            if(num%i==0)
                break;
        }
        if ( num==i) System.out.println("it is a prime number ");
        else System.out.println("Not a prime ");
    }
}
