/**
 * @(#)SetString.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class SetString {
        
    /**
     * Creates a new instance of <code>SetString</code>.
     */
    public SetString() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = "This is a Java string program";
        System.out.println("Length of s1 = " +s1.length());
        
        //count starts at 0
        System.out.println("Char at position 10 = " + s1.charAt(8));
        System.out.println("S1 in uppercase is " + s1.toUpperCase());
    }
}
