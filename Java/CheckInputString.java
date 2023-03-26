/**
 * @(#)CheckInputString.java
 *
 *
 * @author 
 * @version 1.00 2016/10/19
 */
import java.util.Scanner;
public class CheckInputString {
        
    /**
     * Creates a new instance of <code>CheckInputString</code>.
     */
    public CheckInputString() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input;
        System.out.println("Enter value");
        input = scan.nextLine()();
        //|| = or
        if ( input.equals("Red"))||input.equals("Blue")||input.equals("Green")){
        		System.out.println("Valid");
        }else {
        		System.out.println("*** Invalid ***");
        	}
        	
    }
}
