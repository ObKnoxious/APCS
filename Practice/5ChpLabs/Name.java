import java.util.*;
import java.lang.*;
import javax.swing.*;
public class Name{
    public static void main(String args[]){
        String file = JOptionPane.showInputDialog("Input full name:");
        String[] parse = file.split("\\ ");
        System.out.println(parse[0]);
    }
}
