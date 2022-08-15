import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        System.out.println("Enter  2 number whose hcf is to be calculated :");
        Scanner in = new Scanner( System.in );
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int hcf = 0 ;
        for(int i = 1 ; i <n1 || i <n2 ; i++){
            if ( n1%i==0 && n2%i==0){
                hcf = i;
            }
        }System.out.println("HCF is :"+ hcf );
    }
}
