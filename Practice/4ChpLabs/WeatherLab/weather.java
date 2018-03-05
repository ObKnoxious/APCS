//Complete weather lab in Java by Knox Crichton 
import java.util.*
public class weather{
    private int temp;
    private String conditions;
    //Getters
    public int getTemp(){return temp;}
    public String getConditions(){return conditions;}
    //Setters
    public void setTemp(int value){temp = value;}
    public void setConditions(String value){conditions = value;}
    //Defulter
    public weather(){
        temp = 70;
        conditions = "Sunny";
    }
    public weather(String con, int deg){
            
    }
