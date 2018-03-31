//Solution to excersise 3 of chapter 6 by Knox Crichton
public class ex3{
    public static void main(String[] args){
        int arr[] = {0,1,2,3,4,5};
        zero(arr);

    }
    public static void zero(int arr[]){
        for(int i : arr){
            arr[i] = 0;
            System.out.println(arr[i]);
        }
    }
}

