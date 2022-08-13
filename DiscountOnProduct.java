import java.sql.SQLOutput;
import java.util.Scanner;

public class DiscountOnProduct {
    public static void main(String[] args) {
        System.out.print(" Enter original price of a product : ");
        Scanner in  = new Scanner(System.in) ;
        int original_price = in.nextInt();
        System.out.print(" Enter Discount percentage on a product :");
        int discount_percent = in.nextInt() ;
        int total_fair = original_price - (original_price *5)/100;
        System.out.println( " Total fair after Discount on a product is  :" + total_fair);

    }
}
