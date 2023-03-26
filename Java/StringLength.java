/**
 * @(#)StringLength.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class StringLength {
        
    /**
     * Creates a new instance of <code>StringLength</code>.
     */
    public StringLength() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s1;
        
        
        System.out.println("Enter your last name");
        s1 = scan.next();
        
        System.out.println("Length of last name is " + s1.length() );
    }
}
