/**
 * @(#)SumTo.java
 *
 *
 * @author 
 * @version 1.00 2016/10/12
 */
import java.util.Scanner;
public class SumTo {
        
    /**
     * Creates a new instance of <code>SumTo</code>.
     */
    public SumTo() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    int max;
    int total = 0;
    
    System.out.println("Enter number ");
    max = scan.nextInt();
    
    for ( int i = 0 ; i < max;  i++) {
    	total = total + i;
    }
    System.out.println("Sum of numbers between 1 and " + max + " = " + total);
    }
}
