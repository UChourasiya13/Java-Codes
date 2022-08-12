import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumTillZero {
    public static void main(String[] args) {
        System.out.println("Enter min 5 digit no :");
        Scanner in = new Scanner(System.in) ;
        int num = in.nextInt() ;
        int count = 0;
        int sum = 0 ;
        while( num!= 0 ){
            int rem = num % 10;
            sum = sum + rem ;
            num = num/10 ;
            if( num == 0 )break ;
                else  count ++ ;

        }
        System.out.println("sum is : "+ sum);
     }
}
