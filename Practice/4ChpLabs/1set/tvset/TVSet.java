// Part 2 Set 1 Class file by Knox Crichton
import java.util.*;
import java.text.*;
public class TVSet{
    // Instance varriables
    private String brand;
    private double price;
    // Constructor
    public TVSet(String brand, double price){
        this.brand = brand;
        this.price = price;
    }
    // Setters n getters
    public String getBrand(){return brand;}
    public double getPrice(){return price;}
    public void setBrand(String brand){this.brand = brand;}
    public void setPrice(double price){this.price = price;}
    // toString & equals
    public String toString(){
        DecimalFormat df = new DecimalFormat("$#.00");
        return "This TV is a " + brand + " that costs " + df.format(price);
    }
    public boolean equals(TVSet o){
        if(!(o instanceof TVSet)){
            return false;
        } else {
            if(brand.equals(o.getBrand()) && price == o.getPrice()){
                return true;
            } else {
                return false;
            }
        }
    }
}



