//Solution to excersise 4 set 5 chapter 6 by Knox Crichton
public class ex4{
    public static void main(String[] args){
        float arr[] = {0.1f,1.0f,2.79f,3.05f,4.5f,5.13f};
        x2(arr);

    }
    public static void x2(float arr[]){
        for(float i : arr){
            i = i * 2.0f;
            System.out.println(i);
        }
    }
}

