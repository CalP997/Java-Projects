/**
 * @(#)ValidateNumber.java
 *
 *
 * @author 
 * @version 1.00 2016/11/9
 */
import java.util.Scanner;
public class ValidateNumber {
        
    /**
     * Creates a new instance of <code>ValidateNumber</code>.
     */
    public ValidateNumber() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        try {
        	num = scan.nextInt();
        catch (Exception e) {
        	System.out.println("invalid number");
        }
        }
    }
}
