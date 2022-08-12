import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        System.out.print("Enter number of Unit for electricity  :");
        Scanner in = new Scanner(System.in) ;
        float unit = in.nextFloat(); ;
        double billtopay = 0  ;
         if ( unit < 100) {
             billtopay = unit*1.2 ;
         } else if ( unit <200) {
             billtopay = 1.2*100 + (unit-100)*2 ;

         }
         else if ( unit < 300){
             billtopay = 1.2*100 + 200*2 + (unit-300)*3 ;
         }
        System.out.println(" Electricity Bill  to pay :" + billtopay);




    }
}
