import java.util.*;
import java.lang.*;
import javax.swing.*;
public class Ext{
    public static void main(String args[]){
        String file = JOptionPane.showInputDialog("Input filename to check extension of");
        String[] parse = file.split("\\.");
        System.out.println(parse[1]);
    }
}
