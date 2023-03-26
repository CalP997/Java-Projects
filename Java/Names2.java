/**
 * @(#)Names2.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class Names2 {
        
    /**
     * Creates a new instance of <code>Names2</code>.
     */
    public Names2() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        String s2;
        System.out.println("Enter your 1st name");
        s1 = scan.next();
        System.out.println("Enter your last name");
        s2 = scan.next();
        System.out.println("Your name is " + s1 + " " + s2);
    }
}
