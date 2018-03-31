//Complete weather lab in Java by Knox Crichton 
import java.util.*;
public class Weather{
    private int temp;
    private String conditions;
    //Getters
    public int getTemp(){return temp;}
    public String getConditions(){return conditions;}
    //Setters
    public void setTemp(int value){temp = value;}
    public void setConditions(String value){conditions = value;}
    //Defulter
    public Weather(){
        temp = 70;
        conditions = "Sunny";
    }
    //Constructor
    public Weather(String conditions, int temp){
        if(temp < -50 || temp > 150){
            System.out.println("Not a valid temperature");
            this.temp = 70;
            this.conditions = conditions;
        } else {
            this.temp = temp;
            this.conditions = conditions;
        }
    }
    // To Metric
    public double fToC(){
        //double c = ((double) temp-32)*(5/9);
        double p1 = (double) temp - 32;
        double p2 = p1*0.55; 
        return p2;
    }
    // Checks consistentcy
    public boolean isConsistent(){
        int tem = getTemp();
        String con = getConditions();
        if(tem < 32 && !con.equalsIgnoreCase("snowy")){
            return false;
        } else if(tem > 100 && !con.equalsIgnoreCase("sunny")){
            return false;
        } else {
            return true;
        }
    }
    // toString and equals 
    public String toString(){
        String o = "The temperature is " + temp + " and it is " + conditions + " outside.";
        return o;
    }
    public boolean equals(Weather w){
        if(!(w instanceof Weather)){
            return false;
        } else {
            if(conditions.equals(w.getConditions()) && temp == w.getTemp()){  
                return true;
            } else {
                return false;
            }
        }
    }
}

        


    
