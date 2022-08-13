import java.util.Scanner;
import java.lang.Math ;
public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter points to find distance :");
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        double distance = Math.sqrt( (x2-x1)*(x2 - x1) + (y2-y1)*(y2-y1) ) ;
        System.out.println("Distance between points is :" + distance );

    }
}
