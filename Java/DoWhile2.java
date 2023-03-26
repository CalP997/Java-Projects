/**
 * @(#)DoWhile2.java
 *
 *
 * @author 
 * @version 1.00 2016/10/12
 */
import java.util.Scanner;
public class DoWhile2 {
        
    /**
     * Creates a new instance of <code>DoWhile2</code>.
     */
    public DoWhile2() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number;
        Scanner scan = new Scanner(System.in);
        
        do{
        	System.out.println("Looping.....");
        	
        	System.out.println("Enter number 8 to exit");
        	number = scan.nextInt();
        	
        } while ( number != 8 );
        System.out.println("Loop ended");
    }
}
