/**
 * @(#)ChangeCase.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class ChangeCase {
        
    /**
     * Creates a new instance of <code>ChangeCase</code>.
     */
    public ChangeCase() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1;
        System.out.println("Enter your last name in lower case");
        s1 = scan.next();
        System.out.println("Your name in upper-case: " + s1.toUpperCase());
        char initial = s1.toUpperCase().charAt(0); //chain methods
        System.out.println("Your initial in upper-case is " + initial);
    }
}
