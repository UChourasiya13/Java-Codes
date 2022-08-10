import java.util.Scanner;

public class NumCount {
    public static void main(String[] args) {
        System.out.print("Enter min 5 digit number :");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print("Enter a number that is to be found in the above number  :");
        int i = in.nextInt();
        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (i == rem) {
                count++;
            }
           num = num/10 ;
        }
        System.out.println(count);
    }
}
