//Solutio to excersise 2 of set 5 of chapter 6 by Knox Crichton
public class ex2{
    public static void main(String[] args){
        int arr[] = {0,1,2,3,4,5};
        System.out.println(sum(arr));

    }
    public static int sum(int arr[]){
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}

