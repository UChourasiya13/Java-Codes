import java.util.Scanner;

public class HcfLcm {
    public static int getHcf(int a ,int b){

        int remainder = 0  ;
        while (b>0){
            remainder = a%b;
            a = b ;
            b = remainder ;
        }
        return a ;
    }
    public static int getLcm(int a ,int b){
        int max = (a>b)?a:b ;
        int i ;
        for( i = max ; i<=a*b;i++ ){
            if(i%a==0 && i%b==0){
                break ;
            }

        }

        return i;
    }

    public static void main(String[] args) {
        //Take number from user

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter 2 Numbers :");
        int num1= sc.nextInt();
        int num2= sc.nextInt();//taking input from user
        int hcf = getHcf(num1 ,num2) ;
        int lcm = getLcm(num1,num2) ;
        System.out.println("HCF of 2 Number is :" + hcf);
        System.out.print("LCm of 2 Number is :" + lcm);

    }
}
