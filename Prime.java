import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.print("Enter a number to check whether it is prime or not ");
        Scanner in = new Scanner(System.in) ;
        int num = in.nextInt();
        int i ,flag ;
        flag = 0 ;
        for ( i = 2; i<=num-1 ; i++){
            if(num%i==0)
                System.out.println("Not a prime");
                flag = 1 ;
                break;
        }
        if ( flag==0) System.out.println("it is a prime number ");
        else System.out.println("Not a prime ");
    }
}
