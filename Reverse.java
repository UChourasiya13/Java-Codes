import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.print("Enter Min 3 digit number :");
        Scanner in = new Scanner(System.in) ;
        int num = in.nextInt() ;
        int count = 0 ;
        int rem ;
        int rev = 0;
        while ( num != 0) {
            rem = num % 10 ;
            rev =  rev*10 + rem ;
            num = num/10 ;
            count ++ ;
        }
        System.out.println("Reverse of " + num +"is :" + rev);


        
    }
}
