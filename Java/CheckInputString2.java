/**
 * @(#)CheckInputString2.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class CheckInputString2 {
        
    /**
     * Creates a new instance of <code>CheckInputString2</code>.
     */
    public CheckInputString2() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("enter value");
        input = scan.nextLine();
        switch ( input) {
        	case "red":
        	case "blue":
        	case "green":
        		System.out.println("valid");
        		break;
        	default:
        		System.out.println("***invalid***");
        }
    }
}
