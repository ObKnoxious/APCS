// Completes alternate domain assignment instead of partner lab
// By Knox Crichton

import java.util.*;
public class Domain {
    public String url;
    // Constructor for url
    public Domain(String url){    
        this.url = url;
    }
    // getter
    public String getURL(){return url;}
    // setter
    public void setURL(String url){this.url = url;}
    // prints full domain url
    public String toString(){
        return "Full URL: " + this.url;
    }
    // a WORKING equals()
    public boolean equals(Domain o){
        if(!(o instanceof Domain)){
            return false;
        } else {
            Domain objDomain = (Domain) o;
            return (url.equals(o.getURL()));
        }
    }
    // Checks for www
    public boolean isWWW(){
        String[] parse = url.split("\\.");
        if(parse[0].equals("www")){
            return true;
        } else {
            return false;
        //return Arrays.toString(parse);
        //String parse1 = parse[0];
        //return parse1;
        }
    }
    public String getTLD(){    
        String[] parse = url.split("\\.");
        if(parse.length < 2){
            return "unknown";
        }
        return parse[2];
    }
    public String getName(){
        String[] parse = url.split("\\.");
        if(parse.length < 2){
            return "unknown";
        }
        return parse[1];
    }
}

