import java.util.Scanner;
import java.lang.Math ;

public class DepreciationValue {
    public static void main(String[] args) {
        System.out.print("Enter initial Value , Rate , and time of an item :");
        Scanner in = new Scanner(System.in) ;
        double int_value = in.nextDouble();
        double rate = in.nextDouble() ;
        double time = in.nextFloat() ;
        double depreciation = int_value * Math.pow(1- rate/100 , time) ;
        System.out.println("Depreciation of value :" + depreciation);


        

    }
}
