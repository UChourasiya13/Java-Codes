import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        System.out.print("Enter number of times to run a loop  :");
        Scanner in = new Scanner(System.in) ;
        int num = in.nextInt();
        int sum = 0 ;
        int avg = 0 ;
        System.out.println("Enter Numbers to find Average");
        for (int i = 0 ; i < num ; i++) {
            int n = in.nextInt() ;
            sum = sum + n ;
            avg = sum / num ;
        }
        System.out.println(" average of a number is : " + avg );

    }
}
