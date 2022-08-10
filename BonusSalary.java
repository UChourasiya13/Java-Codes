import java.util.Scanner;
public class BonusSalary {
    public static void main(String[] args) {
        System.out.print("Enter salary  ");
        Scanner in = new Scanner(System.in) ;
        int i = in.nextInt() ;

        if( i>=20000) System.out.println("Get hike upto 2000 and final salary is : " + (i+2000) );
        else if ( i >= 30000) System.out.println("Get hike upto  5000 and final salary is : " + (i+5000));
        else System.out.println("Get no hike");

    }
}
