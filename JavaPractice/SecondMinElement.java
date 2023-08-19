import java.awt.*;
import java.util.Arrays;

public class SecondMinElement {
    public static void main(String[] args) {
        int []arr = {3,1,2,1,1};
        int n = arr.length;
        int min = Integer.MAX_VALUE; //first find the max possible values 
        int secondmin = Integer.MAX_VALUE;//first find the max possible values 

        //{1,2,3,4,5}
        for(int i=0 ; i<n;i++){
           if(arr[i]<min){ //agar array ki value min se kam hai toh min arr[i] jaega or agar apn ko koi 
               //value min se kam milegi toh jo min rahega vo second min  ban jaega 
               secondmin = min;
               min = arr[i];
           }
           //agar  array me rakhi value second min se kam hai toh second min array ki value rahegi 
           //but vo array ki value min ke barabar nahi hona chaiye 
           else if(arr[i]<secondmin && arr[i]!=min){
               secondmin = arr[i];
           }

        }
        System.out.println(secondmin + " " + min);
    }
}
