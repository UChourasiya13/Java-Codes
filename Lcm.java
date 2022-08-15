import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        System.out.println("Enter 2 number whose lcm to be find :");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        for ( int i = 1 ; i < num1 * num2; i++) {
            if ( i%num1== 0 &&  i%num2 == 0) {
                System.out.println("Lcm is " + i);
            }

        }

    }


}
