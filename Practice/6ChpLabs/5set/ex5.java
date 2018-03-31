import java.lang.*;
import java.text.*;
import java.util.*;
//Solution to excersise 5 of chapter 6 by Knox Crichton
public class ex5{
    public static void main(String[] args){
        int arr[] = {100,50,85,0,90,279};
        System.out.println(above(arr));

    }
    public static String above(int arr[]){
        DecimalFormat df = new DecimalFormat("##.##%");
        double above = 0;
        for(int i : arr){
            if(i >= 90){
                above+=1;
            }
        }
        return (df.format(above / arr.length));
    }
}
